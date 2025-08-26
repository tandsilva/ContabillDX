//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:38:02 AM BRT 
//


package OUT.S5501;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TS_tpAcConv_FGTS.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv_FGTS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv_FGTS")
@XmlEnum
public enum TSTpAcConvFGTS {


    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Declaração de base de cálculo de FGTS anterior ao início do FGTS Digital
     * 
     */
    H,

    /**
     * Sentença judicial (exceto reclamatória trabalhista)
     * 
     */
    I;

    public String value() {
        return name();
    }

    public static TSTpAcConvFGTS fromValue(String v) {
        return valueOf(v);
    }

}
