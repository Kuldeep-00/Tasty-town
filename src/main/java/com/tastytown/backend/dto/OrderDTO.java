package com.tastytown.backend.dto;
import java.time.LocalDateTime;
import java.util.List;

public record OrderDTO( 
     String orderCode,
     List<OrderItemDTO> orderItems,
     double totalAmount,
     String OrderStatus,
     LocalDateTime orderDateTime,
     String contactInfo,
     String addressInfo)
     {

     }

