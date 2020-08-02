package com.dwp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.dwp.client.api.DefaultApi;
import com.dwp.client.invoker.ApiClient;

@Configuration
public class UsersAroundLonProjConfig {
    @Bean
    public DefaultApi defaultApi() {
        return new DefaultApi(apiClient());
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Bean
    public ApiClient apiClient() {
    	ApiClient thisApiClient = new ApiClient(restTemplate());
    	thisApiClient.setBasePath("https://bpdts-test-app.herokuapp.com");
        return thisApiClient;
    }
}
