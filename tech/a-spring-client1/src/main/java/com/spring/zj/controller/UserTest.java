package com.spring.zj.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	public User u = new User();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetName() {
		 u.getName();
	}

	@Test
	public void testSetName() {
		u.setName("zhangsan");
	}

}
