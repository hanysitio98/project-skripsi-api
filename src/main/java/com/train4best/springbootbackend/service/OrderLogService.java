package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.OrderLog;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.OrderLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderLogService {

    @Autowired
    private OrderLogRepository orderLogRepository;

    public OrderLog findById(String id) {
        return orderLogRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("OrderLog dengan id" + id + " tidak ditemukan"));
    }

    public List<OrderLog> findAll() {

        return orderLogRepository.findAll();
    }

    public OrderLog create(OrderLog orderLog) {
        orderLog.setId(UUID.randomUUID().toString());
        return  orderLogRepository.save(orderLog);
    }

    public OrderLog edit(OrderLog orderLog) {
        return orderLogRepository.save(orderLog);
    }

    public void deleteById(String id) {
        orderLogRepository.deleteById(id);
    }
}
