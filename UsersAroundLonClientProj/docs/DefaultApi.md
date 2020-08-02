# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](DefaultApi.md#getUsers) | **GET** /city/{city}/users | 
[**getUsers_0**](DefaultApi.md#getUsers_0) | **GET** /instructions | 
[**getUsers_1**](DefaultApi.md#getUsers_1) | **GET** /user/{id} | 
[**getUsers_2**](DefaultApi.md#getUsers_2) | **GET** /users | 


<a name="getUsers"></a>
# **getUsers**
> getUsers(city)



### Example
```java
// Import classes:
//import com.dwp.client.invoker.ApiException;
//import com.dwp.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String city = "city_example"; // String | 
try {
    apiInstance.getUsers(city);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsers_0"></a>
# **getUsers_0**
> getUsers_0()



### Example
```java
// Import classes:
//import com.dwp.client.invoker.ApiException;
//import com.dwp.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.getUsers_0();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsers_0");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsers_1"></a>
# **getUsers_1**
> getUsers_1(id)



### Example
```java
// Import classes:
//import com.dwp.client.invoker.ApiException;
//import com.dwp.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.getUsers_1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsers_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsers_2"></a>
# **getUsers_2**
> getUsers_2()



### Example
```java
// Import classes:
//import com.dwp.client.invoker.ApiException;
//import com.dwp.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.getUsers_2();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsers_2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

