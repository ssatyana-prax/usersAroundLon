package com.dwp.geouser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwp.client.api.DefaultApi;
import com.dwp.client.api.User;


@RestController
public class UsersController {
	@Autowired 
	private DefaultApi defaultApi;
	
	@GetMapping(value="/users")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Object> getUsersAroundLon() throws Exception
	{
		ResponseEntity<User> users = defaultApi.getUsers_1WithHttpInfo("London");
		
		return (List<Object>) users;
	}
	//private List<User> usersNearCity; //*#* why static

	/*@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<User> getUsersAroundLon() throws Exception //*#*
	{
		
		
		usersNearCity = new ArrayList<User>();
		Object users = defaultApi.getUsers("London"); 
		//Get users in London
		String londonUsersStr = "";
		String allUsersStr = "";
		
		System.out.println(wsURLForLondonStr);

		URL wsURLForLondon = new URL("https://bpdts-test-app.herokuapp.com/city/London/users");
		HttpURLConnection lonConn = (HttpURLConnection) wsURLForLondon.openConnection(); lonConn.setRequestMethod("GET");
		lonConn.connect(); 
		int responseCode = lonConn.getResponseCode();
		if(responseCode != 200) {
				 
		} 
		else { 
			Scanner lonScanner = new Scanner(wsURLForLondon.openStream());
			while(lonScanner.hasNext())
				londonUsersStr+=lonScanner.nextLine();
			lonScanner.close();//*#*
		}

		ObjectMapper londonMapper = new ObjectMapper();
		JsonNode londonJSONNode = londonMapper.readTree(londonUsersStr);
		User[] londonUsersArray = londonMapper.convertValue(londonJSONNode, User[].class);
		System.out.println(Arrays.toString(londonUsersArray));
		
		//Get other users within 50 miles of London
		String otherUsersStr = "";
		URL wsURLForOtherUsers = new URL("https://bpdts-test-app.herokuapp.com/users");
		HttpURLConnection otherUsersConn = (HttpURLConnection) wsURLForOtherUsers.openConnection(); otherUsersConn.setRequestMethod("GET");
		otherUsersConn.connect(); 
		int otherUsersresponseCode = otherUsersConn.getResponseCode();
		if(otherUsersresponseCode != 200) {
				 
		} 
		else { 
			Scanner otherUsersScanner = new Scanner(wsURLForOtherUsers.openStream());
			while(otherUsersScanner.hasNext())
				otherUsersStr+=otherUsersScanner.nextLine();
			otherUsersScanner.close();//*#*
		}
		
		ObjectMapper otherUsersMapper = new ObjectMapper();
		JsonNode otherUsersJSONNode = londonMapper.readTree(otherUsersStr);
		User[] otherUsersArray = londonMapper.convertValue(otherUsersJSONNode, User[].class);
		System.out.println(Arrays.toString(otherUsersArray));

		//Check there are no duplicates between then two groups
		//Check the group to return and sort by distance from London before returning
				

		
		return usersNearCity;
	}*/
}
