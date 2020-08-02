package com.dwp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.dwp.geouser.UsersController;


@SpringBootTest
class UsersAroundLonProjApplicationTests {

	@Test
	void contextLoads() {
		try {
			//List<User> ss = UsersController.getUsersAroundLon();
			//assertEquals(ss.size(), 230);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
