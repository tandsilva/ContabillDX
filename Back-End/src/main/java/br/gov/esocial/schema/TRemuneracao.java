//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_remuneracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_remuneracao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_vrSalFx"/&gt;
 *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_undSalFixo"/&gt;
 *         &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_texto_999" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_remuneracao", propOrder = {
    "vrSalFx",
    "undSalFixo",
    "dscSalVar"
})
public class TRemuneracao {

    @XmlElement(required = true)
    protected BigDecimal vrSalFx;
    protected byte undSalFixo;
    protected String dscSalVar;

    /**
     * Obtém o valor da propriedade vrSalFx.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrSalFx() {
        return vrSalFx;
    }

    /**
     * Define o valor da propriedade vrSalFx.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrSalFx(BigDecimal value) {
        this.vrSalFx = value;
    }

    /**
     * Obtém o valor da propriedade undSalFixo.
     * 
     */
    public byte getUndSalFixo() {
        return undSalFixo;
    }

    /**
     * Define o valor da propriedade undSalFixo.
     * 
     */
    public void setUndSalFixo(byte value) {
        this.undSalFixo = value;
    }

    /**
     * Obtém o valor da propriedade dscSalVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscSalVar() {
        return dscSalVar;
    }

    /**
     * Define o valor da propriedade dscSalVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscSalVar(String value) {
        this.dscSalVar = value;
    }

}
