package com.modulith.micro.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
 interface InventoryRepository extends JpaRepository<Inventory, Long> {

 Optional<Inventory> getInventoryByName(String name);

 List<Inventory> getInventoryByNameIn(List<String>name);
}
