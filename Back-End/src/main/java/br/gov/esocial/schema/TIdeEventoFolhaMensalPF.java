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
 * CHAVE_GRUPO: {perApur*}, {indGuia*}
 * 
 * <p>Classe Java de T_ideEvento_folha_mensal_PF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEvento_folha_mensal_PF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indRetif" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_indRetif"/&gt;
 *         &lt;element name="nrRecibo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrRecibo" minOccurs="0"/&gt;
 *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_perApur_mensal"/&gt;
 *         &lt;element name="indGuia" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_indGuia" minOccurs="0"/&gt;
 *         &lt;element name="tpAmb" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpAmb"/&gt;
 *         &lt;element name="procEmi" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_procEmi_PF"/&gt;
 *         &lt;element name="verProc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_verProc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEvento_folha_mensal_PF", propOrder = {
    "indRetif",
    "nrRecibo",
    "perApur",
    "indGuia",
    "tpAmb",
    "procEmi",
    "verProc"
})
public class TIdeEventoFolhaMensalPF {

    protected byte indRetif;
    protected String nrRecibo;
    @XmlElement(required = true)
    protected String perApur;
    protected Byte indGuia;
    protected byte tpAmb;
    protected byte procEmi;
    @XmlElement(required = true)
    protected String verProc;

    /**
     * Obtém o valor da propriedade indRetif.
     * 
     */
    public byte getIndRetif() {
        return indRetif;
    }

    /**
     * Define o valor da propriedade indRetif.
     * 
     */
    public void setIndRetif(byte value) {
        this.indRetif = value;
    }

    /**
     * Obtém o valor da propriedade nrRecibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRecibo() {
        return nrRecibo;
    }

    /**
     * Define o valor da propriedade nrRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRecibo(String value) {
        this.nrRecibo = value;
    }

    /**
     * Obtém o valor da propriedade perApur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Define o valor da propriedade perApur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerApur(String value) {
        this.perApur = value;
    }

    /**
     * Obtém o valor da propriedade indGuia.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndGuia() {
        return indGuia;
    }

    /**
     * Define o valor da propriedade indGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndGuia(Byte value) {
        this.indGuia = value;
    }

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     */
    public byte getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     */
    public void setTpAmb(byte value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade procEmi.
     * 
     */
    public byte getProcEmi() {
        return procEmi;
    }

    /**
     * Define o valor da propriedade procEmi.
     * 
     */
    public void setProcEmi(byte value) {
        this.procEmi = value;
    }

    /**
     * Obtém o valor da propriedade verProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerProc() {
        return verProc;
    }

    /**
     * Define o valor da propriedade verProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerProc(String value) {
        this.verProc = value;
    }

}
