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
 * CHAVE_GRUPO: {tpInsc}, {nrInsc}
 * 
 * <p>Classe Java de T_ideEmpregador_exclusao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEmpregador_exclusao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpInsc_1_2"/&gt;
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrInsc_8_11_14"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEmpregador_exclusao", propOrder = {
    "tpInsc",
    "nrInsc"
})
public class TIdeEmpregadorExclusao {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Define o valor da propriedade nrInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

}
