package ali.com.example.order_service.service;

import ali.com.example.order_service.client.InventoryClient;
import ali.com.example.order_service.dto.OrderRequest;
import ali.com.example.order_service.event.OrderPlacedEvent;
import ali.com.example.order_service.model.Order;
import ali.com.example.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    //Testing can be done through Mockito - WireMock
    //Using Wiremock for this project
    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;
    private final KafkaTemplate<String , OrderPlacedEvent > kafkaTemplate;

    public void placeOrder(OrderRequest orderRequest) {
      // commenting for hardcode - var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode() , orderRequest.quantity());

        boolean isProductInStock = true;
        String email = "muhammadalih60@gmail.com";

        if(isProductInStock){
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setQuantity(orderRequest.quantity());
            order.setSkuCode(orderRequest.skuCode());
            orderRepository.save(order);
            OrderPlacedEvent orderPlacedEvent = new OrderPlacedEvent(order.getOrderNumber() , email );
            log.info("Start- Sending OrderPlacedEvent {} to Kafka Topic", orderPlacedEvent);
            kafkaTemplate.send("order-placed", orderPlacedEvent);
            log.info("End- Sending OrderPlacedEvent {} to Kafka Topic", orderPlacedEvent);

        }
        else{
            throw new RuntimeException("Product is not available ");
        }
    }

}