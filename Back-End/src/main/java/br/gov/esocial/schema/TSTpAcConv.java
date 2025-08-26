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
 * <p>Classe Java de TS_tpAcConv.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv")
@XmlEnum
public enum TSTpAcConv {


    /**
     * Acordo Coletivo de Trabalho
     * 
     */
    A,

    /**
     * Legislação federal, estadual, municipal ou distrital
     * 
     */
    B,

    /**
     * Convenção Coletiva de Trabalho
     * 
     */
    C,

    /**
     * Sentença normativa - Dissídio
     * 
     */
    D,

    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Outras verbas de natureza salarial ou não salarial devidas após o desligamento
     * 
     */
    F,

    /**
     * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
     * 
     */
    G,

    /**
     * Declaração de base de cálculo de FGTS anterior ao início do FGTS Digital
     * 
     */
    H,

    /**
     * Sentença judicial (exceto reclamatória trabalhista)
     * 
     */
    I,

    /**
     * Parcelas complementares conhecidas após o fechamento da folha
     * 
     */
    J;

    public String value() {
        return name();
    }

    public static TSTpAcConv fromValue(String v) {
        return valueOf(v);
    }

}
