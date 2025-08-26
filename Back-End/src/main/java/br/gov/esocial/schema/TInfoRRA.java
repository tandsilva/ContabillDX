//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {indRRA}(../indRRA) = [S]); N (nos demais casos)
 * 
 * <p>Classe Java de T_infoRRA complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoRRA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpProc_1_2"/&gt;
 *         &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/&gt;
 *         &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_descRRA"/&gt;
 *         &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_qtdMesesRRA"/&gt;
 *         &lt;element name="despProcJud" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario"/&gt;
 *                   &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ideAdv" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpInsc_1_2"/&gt;
 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrInsc_11_14"/&gt;
 *                   &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/&gt;
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
@XmlType(name = "T_infoRRA", propOrder = {
    "tpProcRRA",
    "nrProcRRA",
    "descRRA",
    "qtdMesesRRA",
    "despProcJud",
    "ideAdv"
})
public class TInfoRRA {

    protected byte tpProcRRA;
    protected String nrProcRRA;
    @XmlElement(required = true)
    protected String descRRA;
    @XmlElement(required = true)
    protected BigDecimal qtdMesesRRA;
    protected TInfoRRA.DespProcJud despProcJud;
    protected List<TInfoRRA.IdeAdv> ideAdv;

    /**
     * Obtém o valor da propriedade tpProcRRA.
     * 
     */
    public byte getTpProcRRA() {
        return tpProcRRA;
    }

    /**
     * Define o valor da propriedade tpProcRRA.
     * 
     */
    public void setTpProcRRA(byte value) {
        this.tpProcRRA = value;
    }

    /**
     * Obtém o valor da propriedade nrProcRRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcRRA() {
        return nrProcRRA;
    }

    /**
     * Define o valor da propriedade nrProcRRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcRRA(String value) {
        this.nrProcRRA = value;
    }

    /**
     * Obtém o valor da propriedade descRRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRRA() {
        return descRRA;
    }

    /**
     * Define o valor da propriedade descRRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRRA(String value) {
        this.descRRA = value;
    }

    /**
     * Obtém o valor da propriedade qtdMesesRRA.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdMesesRRA() {
        return qtdMesesRRA;
    }

    /**
     * Define o valor da propriedade qtdMesesRRA.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdMesesRRA(BigDecimal value) {
        this.qtdMesesRRA = value;
    }

    /**
     * Obtém o valor da propriedade despProcJud.
     * 
     * @return
     *     possible object is
     *     {@link TInfoRRA.DespProcJud }
     *     
     */
    public TInfoRRA.DespProcJud getDespProcJud() {
        return despProcJud;
    }

    /**
     * Define o valor da propriedade despProcJud.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoRRA.DespProcJud }
     *     
     */
    public void setDespProcJud(TInfoRRA.DespProcJud value) {
        this.despProcJud = value;
    }

    /**
     * Gets the value of the ideAdv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideAdv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeAdv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInfoRRA.IdeAdv }
     * 
     * 
     */
    public List<TInfoRRA.IdeAdv> getIdeAdv() {
        if (ideAdv == null) {
            ideAdv = new ArrayList<TInfoRRA.IdeAdv>();
        }
        return this.ideAdv;
    }


    /**
     * CONDICAO_GRUPO: OC
     * 
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario"/&gt;
     *         &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario"/&gt;
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
        "vlrDespCustas",
        "vlrDespAdvogados"
    })
    public static class DespProcJud {

        @XmlElement(required = true)
        protected BigDecimal vlrDespCustas;
        @XmlElement(required = true)
        protected BigDecimal vlrDespAdvogados;

        /**
         * Obtém o valor da propriedade vlrDespCustas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrDespCustas() {
            return vlrDespCustas;
        }

        /**
         * Define o valor da propriedade vlrDespCustas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrDespCustas(BigDecimal value) {
            this.vlrDespCustas = value;
        }

        /**
         * Obtém o valor da propriedade vlrDespAdvogados.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrDespAdvogados() {
            return vlrDespAdvogados;
        }

        /**
         * Define o valor da propriedade vlrDespAdvogados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrDespAdvogados(BigDecimal value) {
            this.vlrDespAdvogados = value;
        }

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
     *         &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/&gt;
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
        "vlrAdv"
    })
    public static class IdeAdv {

        protected byte tpInsc;
        @XmlElement(required = true)
        protected String nrInsc;
        protected BigDecimal vlrAdv;

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
         * Obtém o valor da propriedade vlrAdv.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrAdv() {
            return vlrAdv;
        }

        /**
         * Define o valor da propriedade vlrAdv.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrAdv(BigDecimal value) {
            this.vlrAdv = value;
        }

    }

}
