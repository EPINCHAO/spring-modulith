package com.modulith.micro.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrderInventoryRepository extends JpaRepository <OrderInventory, Long> {
}
