package br.com.lgpd.powerbi;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PowerBIScheduler {

    private final PowerBIService powerBIService;

    public PowerBIScheduler(PowerBIService powerBIService) {
        this.powerBIService = powerBIService;
    }

    @Scheduled(fixedRate = 60000) // a cada 60s
    public void enviarPeriodicamente()   {
        powerBIService.enviarTodasEmpresasParaPowerBIEmLote();
    }
}
