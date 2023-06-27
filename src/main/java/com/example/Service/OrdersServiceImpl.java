package com.example.Service;

import com.example.Repository.OrdersRepository;
import com.example.entity.Customer;
import com.example.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{

    OrdersRepository ordersRepository;
    @Autowired
    public void setOrdersRepository(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders saveOrders(Orders orders)
    {
        return ordersRepository.save(orders);
    }
}
