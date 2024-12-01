package com.cromxt.space.clients;


import com.cromxt.space.clients.response.UserDetailsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class UserHttpClient {
    private final RestClient restClient;
    private final String BASE_URL;
    private final String API_KEY;

    public UserHttpClient(
            RestClient restClient,
            Environment environment,
            ObjectMapper objectMapper
    ) {
        this.restClient = restClient;
        this.BASE_URL = String.format(
                "http://%s:%s/cromxt/service/",
                environment.getProperty("SPACE_SERVICE.USER_SERVICE_HOST"),
                environment.getProperty("SPACE_SERVICE.USER_SERVICE_PORT")
        );
        this.API_KEY = environment.getProperty("SPACE_SERVICE.USER_SERVICE_API_KEY");
    }


    public UserDetailsResponse getUserDetails(String cromxtUsername) {
        return restClient.get()
                .uri(BASE_URL + cromxtUsername)
                .header("X-API-KEY", API_KEY)
                .retrieve()
                .onStatus(
                        httpStatus -> httpStatus.value() != 200,
                        (request, response) -> {
                            if(response.getStatusCode().is4xxClientError()){
                                throw new RuntimeException("Error 400");
                            }
                            if(response.getStatusCode().is5xxServerError()){
                                throw new RuntimeException("Error Value");
                            }
                        }
                )
                .toEntity(UserDetailsResponse.class)
                .getBody();
    }

}
