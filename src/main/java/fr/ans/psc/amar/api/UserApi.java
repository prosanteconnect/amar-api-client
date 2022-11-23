package fr.ans.psc.amar.api;

import fr.ans.psc.amar.ApiClient;
import fr.ans.psc.amar.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-01T09:34:49.260Z[GMT]")@Component("fr.ans.psc.amar.api.UserApiApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a user
     * 
     * <p><b>201</b> - User created
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - User with this nationalId already exist
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param body  (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User createUser(User body) throws RestClientException {
        return createUserWithHttpInfo(body).getBody();
    }

    /**
     * Create a user
     * 
     * <p><b>201</b> - User created
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - User with this nationalId already exist
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param body  (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> createUserWithHttpInfo(User body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createUser");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete the user
     * 
     * <p><b>204</b> - User deleted
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User deleteUser(String nationalId) throws RestClientException {
        return deleteUserWithHttpInfo(nationalId).getBody();
    }

    /**
     * Delete the user
     * 
     * <p><b>204</b> - User deleted
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> deleteUserWithHttpInfo(String nationalId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling deleteUser");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nationalId", nationalId));

        final String[] accepts = { 
            "application/json", "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a user by her/his national id
     * 
     * <p><b>200</b> - Found the user
     * <p><b>400</b> - National id supplied not correctly url encoded or invalid
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (some data associated with the national id are unparsable, unreachable data base, input data that provoked an exception, database error, etc.)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUser(String nationalId) throws RestClientException {
        return getUserWithHttpInfo(nationalId).getBody();
    }

    /**
     * Get a user by her/his national id
     * 
     * <p><b>200</b> - Found the user
     * <p><b>400</b> - National id supplied not correctly url encoded or invalid
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (some data associated with the national id are unparsable, unreachable data base, input data that provoked an exception, database error, etc.)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserWithHttpInfo(String nationalId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling getUser");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nationalId", nationalId));

        final String[] accepts = { 
            "application/json", "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update the user
     * 
     * <p><b>200</b> - User updated
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param body  (required)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User updateUser(User body, String nationalId) throws RestClientException {
        return updateUserWithHttpInfo(body, nationalId).getBody();
    }

    /**
     * Update the user
     * 
     * <p><b>200</b> - User updated
     * <p><b>400</b> - Required data invalid or absent
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Other problem with the backend (unreachable data base, input data that provoked an exception, database error, etc.)
     * @param body  (required)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> updateUserWithHttpInfo(User body, String nationalId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateUser");
        }
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling updateUser");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nationalId", nationalId));

        final String[] accepts = { 
            "application/json", "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
