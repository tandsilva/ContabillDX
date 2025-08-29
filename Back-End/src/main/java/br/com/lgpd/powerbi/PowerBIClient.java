package br.com.lgpd.powerbi;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class PowerBIClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String powerBIUrl = "https://api.powerbi.com/beta/e4388205-954b-4a6d-a178-4fc43ba71002/datasets/694eb1fe-65ee-456c-bfcf-69c3785752d2/rows?key=iqD1aPG5toVBQ/oyap0PHKISXYODoaSsD8opwg4mBscc1enDWkJzKaH+CiLAMWEY3kI+LMF76WIhjqv6FuJXsA==";

    public void enviarDados(Map<String, Object> payload) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(payload, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(powerBIUrl, request, String.class);

        System.out.println("Status: " + response.getStatusCode());
        System.out.println("Body: " + response.getBody());

        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("Erro ao enviar dados para o Power BI: " + response.getBody());
        }
    }
}
