package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsdeliver.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	@Query("SELECT DISTINCT ord FROM Order ord JOIN FETCH ord.products WHERE ord.status = 0 ORDER BY ord.moment ASC")
	List<Order> findOrdersWithProducts();

}
