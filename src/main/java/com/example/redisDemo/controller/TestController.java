package com.example.redisDemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;

@RestController
public class TestController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	 private RedisTemplate<String,Object> redisTemplate;
	    
	
//	public static String example() {
//	    val example = new ArrayList<String>();
//	    example.add("Hello, World!");
//	    val foo = example.get(0);
//	    return foo.toLowerCase();
//	  }
//	  
//	  public static void example2() {
//	    val map = new HashMap<Integer, String>();
//	    map.put(0, "zero");
//	    map.put(5, "five");
//	    for (val entry : map.entrySet()) {
//	      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
//	    }
//	  }
	
	  @RequestMapping("/test")
	public void test(){
//		User user = new User();
//		System.out.println(user);
//		
//		System.out.println(example());
//		example2();
//		
//		@Cleanup InputStream inputStream = new FileInputStream(args[0]);
//			
//		try (BufferedReader br =
//	                  new BufferedReader(new FileReader(""))) {
//	        br.readLine();
//	    }
		ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hello", "redis");
        System.out.println("useRedisDao = " + valueOperations.get("hello"));

	}
}
