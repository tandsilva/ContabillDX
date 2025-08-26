//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TS_tpAcConv_FGTS.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv_FGTS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
