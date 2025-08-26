//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {cpfBenef*}, {nrBeneficio*}
 * 
 * <p>Classe Java de T_ideBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideBeneficio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cpf"/&gt;
 *         &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrBeneficio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideBeneficio", propOrder = {
    "cpfBenef",
    "nrBeneficio"
})
public class TIdeBeneficio {

    @XmlElement(required = true)
    protected String cpfBenef;
    @XmlElement(required = true)
    protected String nrBeneficio;

    /**
     * Obtém o valor da propriedade cpfBenef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfBenef() {
        return cpfBenef;
    }

    /**
     * Define o valor da propriedade cpfBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfBenef(String value) {
        this.cpfBenef = value;
    }

    /**
     * Obtém o valor da propriedade nrBeneficio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrBeneficio() {
        return nrBeneficio;
    }

    /**
     * Define o valor da propriedade nrBeneficio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrBeneficio(String value) {
        this.nrBeneficio = value;
    }

}
