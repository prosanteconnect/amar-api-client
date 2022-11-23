package fr.ans.psc.amar.api;

import fr.ans.psc.amar.ApiClient;
import fr.ans.psc.amar.model.ContactInfo;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-01T09:34:49.260Z[GMT]")@Component("fr.ans.psc.amar.api.ContactInfoApiApi")
public class ContactInfoApi {
    private ApiClient apiClient;

    public ContactInfoApi() {
        this(new ApiClient());
    }

    @Autowired
    public ContactInfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the email of a user
     * 
     * <p><b>204</b> - User email deleted
     * <p><b>400</b> - Invalid data provided (the provided National ID is probably not correctly url encoded)
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User deleteEmail(String nationalId) throws RestClientException {
        return deleteEmailWithHttpInfo(nationalId).getBody();
    }

    /**
     * Delete the email of a user
     * 
     * <p><b>204</b> - User email deleted
     * <p><b>400</b> - Invalid data provided (the provided National ID is probably not correctly url encoded)
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> deleteEmailWithHttpInfo(String nationalId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling deleteEmail");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user/contact_info/email").build().toUriString();
        
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
     * Delete the phone of a user
     * 
     * <p><b>204</b> - User phone number deleted
     * <p><b>400</b> - Invalid data provided (the provided National ID is probably not correctly url encoded)
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User deletePhone(String nationalId) throws RestClientException {
        return deletePhoneWithHttpInfo(nationalId).getBody();
    }

    /**
     * Delete the phone of a user
     * 
     * <p><b>204</b> - User phone number deleted
     * <p><b>400</b> - Invalid data provided (the provided National ID is probably not correctly url encoded)
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> deletePhoneWithHttpInfo(String nationalId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling deletePhone");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user/contact_info/phone").build().toUriString();
        
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
     * Update a user contact information (phone number and/or email)
     * 
     * <p><b>200</b> - The update has been done
     * <p><b>400</b> - Invalid data provided for the update or provided National ID not correctly url encoded
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param body  (required)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User updateContactInfo(ContactInfo body, String nationalId) throws RestClientException {
        return updateContactInfoWithHttpInfo(body, nationalId).getBody();
    }

    /**
     * Update a user contact information (phone number and/or email)
     * 
     * <p><b>200</b> - The update has been done
     * <p><b>400</b> - Invalid data provided for the update or provided National ID not correctly url encoded
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - User not found for provided national id
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Some data associated with the national id in the RASS LDAP are unparsable
     * @param body  (required)
     * @param nationalId National ID of the user ; must be urlencoded (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> updateContactInfoWithHttpInfo(ContactInfo body, String nationalId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateContactInfo");
        }
        // verify the required parameter 'nationalId' is set
        if (nationalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nationalId' when calling updateContactInfo");
        }
        String path = UriComponentsBuilder.fromPath("/ing/rass/user/contact_info").build().toUriString();
        
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
