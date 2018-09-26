package com.example.redisDemo.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

	@Setter @Getter private Integer id;
	@Setter @Getter private String username;
	@Setter @Getter private String password;
	@Setter @Getter private String nickname;
	
}
