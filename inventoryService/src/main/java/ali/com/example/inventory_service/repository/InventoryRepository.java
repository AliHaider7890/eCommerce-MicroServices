package ali.com.example.inventory_service.repository;

import ali.com.example.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory , Long > {

    Inventory findByQuantity(Integer quantity);
    Inventory findBySkuCode(String skuCode);
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String sku, Integer quantity);
}
