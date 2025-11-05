package ali.com.example.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id , String orderNumber , String skuCode ,
                           BigDecimal price, Integer quantity, userDetails userDetails)  {
    public record userDetails(String email, String firstName , String lastName){

    }
}
