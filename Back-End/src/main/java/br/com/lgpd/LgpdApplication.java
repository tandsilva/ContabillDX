package br.com.lgpd;

import br.com.lgpd.powerbi.PowerBIService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LgpdApplication {

    // Starter da aplicação...
    public static void main(String[] args) {
        SpringApplication.run(LgpdApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(WavefrontProperties.Application.class, args);
        PowerBIService service = context.getBean(PowerBIService.class);
        service.enviarTodasEmpresasParaPowerBIEmLote();
        System.out.println("A cor Eh Verde");
    }
}
