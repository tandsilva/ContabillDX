//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: OC
 * 
 * <p>Classe Java de T_infoMV complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoMV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_indMV"/&gt;
 *         &lt;element name="remunOutrEmpr" maxOccurs="999"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpInsc_1_2"/&gt;
 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrInsc_11_14"/&gt;
 *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codCategOE"/&gt;
 *                   &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_vlrRemunOE"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoMV", propOrder = {
    "indMV",
    "remunOutrEmpr"
})
public class TInfoMV {

    protected byte indMV;
    @XmlElement(required = true)
    protected List<TInfoMV.RemunOutrEmpr> remunOutrEmpr;

    /**
     * Obtém o valor da propriedade indMV.
     * 
     */
    public byte getIndMV() {
        return indMV;
    }

    /**
     * Define o valor da propriedade indMV.
     * 
     */
    public void setIndMV(byte value) {
        this.indMV = value;
    }

    /**
     * Gets the value of the remunOutrEmpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunOutrEmpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunOutrEmpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInfoMV.RemunOutrEmpr }
     * 
     * 
     */
    public List<TInfoMV.RemunOutrEmpr> getRemunOutrEmpr() {
        if (remunOutrEmpr == null) {
            remunOutrEmpr = new ArrayList<TInfoMV.RemunOutrEmpr>();
        }
        return this.remunOutrEmpr;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpInsc_1_2"/&gt;
     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrInsc_11_14"/&gt;
     *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codCategOE"/&gt;
     *         &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_vlrRemunOE"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpInsc",
        "nrInsc",
        "codCateg",
        "vlrRemunOE"
    })
    public static class RemunOutrEmpr {

        protected byte tpInsc;
        @XmlElement(required = true)
        protected String nrInsc;
        @XmlElement(required = true)
        protected BigInteger codCateg;
        @XmlElement(required = true)
        protected BigDecimal vlrRemunOE;

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

        /**
         * Obtém o valor da propriedade codCateg.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodCateg() {
            return codCateg;
        }

        /**
         * Define o valor da propriedade codCateg.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodCateg(BigInteger value) {
            this.codCateg = value;
        }

        /**
         * Obtém o valor da propriedade vlrRemunOE.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrRemunOE() {
            return vlrRemunOE;
        }

        /**
         * Define o valor da propriedade vlrRemunOE.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrRemunOE(BigDecimal value) {
            this.vlrRemunOE = value;
        }

    }

}
