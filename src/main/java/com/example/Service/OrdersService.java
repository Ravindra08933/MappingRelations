package com.example.Service;

import com.example.entity.Customer;
import com.example.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersService  {
    public Orders saveOrders(Orders orders);

}
