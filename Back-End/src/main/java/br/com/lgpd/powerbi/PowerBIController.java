    package br.com.lgpd.powerbi;


    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class PowerBIController {

        private final PowerBIService powerBIService;

        public PowerBIController(PowerBIService powerBIService) {
            this.powerBIService = powerBIService;
        }

        // Endpoint para enviar todas as empresas para o Power BI
        @GetMapping("/powerbi/enviar")
        public String enviarEmpresas() {
            powerBIService.enviarTodasEmpresasParaPowerBIEmLote();
            return "Envio iniciado!";
        }
    }
