package com.atguigu.spring.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityTest {
	public static void main(String[] args) {
		// 1.创建BCryptPasswordEncoder对象
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		// 2.准备明文字符串
		String rawPassword = "123456";
		
		// 3.加密
		String encode = passwordEncoder.encode(rawPassword);
		System.out.println(encode);
	}
}

class EncodeTest {
	public static void main(String[] args) {
		// 1.准备明文字符串
		String rawPassword = "123456";
		
		// 2.准备密文字符串
		String encodedPassword = "$2a$10$6EMBhPmWCfeiNPKOse2gCOA8GNcNlXtq8eeMsitF.IY4Yg8Ij2lp2";
		
		// 3.创建BCryptPasswordEncoder对象
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		// 4.比较
		boolean matchRescult = passwordEncoder.matches(rawPassword, encodedPassword);
		System.out.println(matchRescult ? "一致" : "不一致");
	}
}
