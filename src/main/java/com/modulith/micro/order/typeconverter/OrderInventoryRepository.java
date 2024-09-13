package com.modulith.micro.order.typeconverter;

import com.modulith.micro.order.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Long> {

    @Query(nativeQuery = true,value = "SELECT SUM(oi.total_qty_price) from order_inventory oi where oi.order_id= ?1")
    long orderIdAmount(long orderId);
}
