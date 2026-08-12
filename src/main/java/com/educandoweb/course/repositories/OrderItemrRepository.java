package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemrRepository extends JpaRepository<OrderItem, Long> {

}