package com.chitranshu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.bean.Order;
import com.chitranshu.service.OrderServiceImpl;

@RestController
public class OrderResource {
	
	@Autowired
	OrderServiceImpl orderService;
	
	@PostMapping(path = "/orders",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean saveOder(@RequestBody Order order) {
		return false;
	}
	
	@GetMapping(path = "/orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Order findOrderById(@PathVariable("id") long id) {
		return null;
	}
}
