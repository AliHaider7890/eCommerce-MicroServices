package ali.com.example.inventory_service.service;

import ali.com.example.inventory_service.model.Inventory;
import ali.com.example.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String sku , Integer quantity){
       return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(sku,quantity);
    }

    public Inventory findByskuCode(String skuCode){
        Inventory product = inventoryRepository.findBySkuCode(skuCode);
        return product;
    }

}
