package com.chrisbolton.chrisbolton_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@SpringBootApplication
@RestController
public class ChrisboltonServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ChrisboltonServiceApplication.class, args);
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(path="/blogs")
	public @ResponseBody Iterable<ChrisBolton> getAllUsers() {
		System.out.println("GET BLOGS");
		List<ChrisBolton> result = jdbcTemplate.query(
                "SELECT * FROM blog",
                (rs, rowNum) -> new ChrisBolton(rs.getString("author"), 
                								   rs.getString("title"), 
                								   rs.getString("content"), 
                								   rs.getDate("date"))
        );

        return result;
	}
	
}
