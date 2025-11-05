package ali.com.example.inventory_service.controller;

import ali.com.example.inventory_service.model.Inventory;
import ali.com.example.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        return inventoryService.isInStock(skuCode, quantity);
    }

    @GetMapping("/")
    public ResponseEntity<Inventory> getbyskuCode(@RequestParam String skuCode){
        Inventory inventory = inventoryService.findByskuCode(skuCode);
        if (inventory != null) {
            return ResponseEntity.ok(inventory);
        } else {
            return ResponseEntity.notFound().build();
        }
        //return ResponseEntity<Inventory> ;
    }
}