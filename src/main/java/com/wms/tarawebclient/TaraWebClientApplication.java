package com.wms.tarawebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TaraWebClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaraWebClientApplication.class, args);
  }

  @Bean
  public WebClient webClient(ClientRegistrationRepository clientRegistrationRepository, OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository) {
    final ServletOAuth2AuthorizedClientExchangeFilterFunction function = new ServletOAuth2AuthorizedClientExchangeFilterFunction(
        clientRegistrationRepository, oAuth2AuthorizedClientRepository);
    function.setDefaultOAuth2AuthorizedClient(true);
    return WebClient.builder().apply(function.oauth2Configuration()).build();
  }

}
