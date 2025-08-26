//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_infoInterm complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoInterm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_dia"/&gt;
 *         &lt;element name="hrsTrab" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_hora" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoInterm", propOrder = {
    "dia",
    "hrsTrab"
})
public class TInfoInterm {

    protected byte dia;
    protected String hrsTrab;

    /**
     * Obtém o valor da propriedade dia.
     * 
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Define o valor da propriedade dia.
     * 
     */
    public void setDia(byte value) {
        this.dia = value;
    }

    /**
     * Obtém o valor da propriedade hrsTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrsTrab() {
        return hrsTrab;
    }

    /**
     * Define o valor da propriedade hrsTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrsTrab(String value) {
        this.hrsTrab = value;
    }

}
