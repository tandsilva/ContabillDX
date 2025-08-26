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
 * CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais casos)
 * 
 * <p>Classe Java de T_endereco_exterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_endereco_exterior"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paisResid" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_pais"/&gt;
 *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_dscLograd"/&gt;
 *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrLograd"/&gt;
 *         &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_complemento" minOccurs="0"/&gt;
 *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_bairro" minOccurs="0"/&gt;
 *         &lt;element name="nmCid"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;pattern value=".*[^\s].*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codPostal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_endereco_exterior", propOrder = {
    "paisResid",
    "dscLograd",
    "nrLograd",
    "complemento",
    "bairro",
    "nmCid",
    "codPostal"
})
public class TEnderecoExterior {

    @XmlElement(required = true)
    protected String paisResid;
    @XmlElement(required = true)
    protected String dscLograd;
    @XmlElement(required = true)
    protected String nrLograd;
    protected String complemento;
    protected String bairro;
    @XmlElement(required = true)
    protected String nmCid;
    protected String codPostal;

    /**
     * Obtém o valor da propriedade paisResid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResid() {
        return paisResid;
    }

    /**
     * Define o valor da propriedade paisResid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResid(String value) {
        this.paisResid = value;
    }

    /**
     * Obtém o valor da propriedade dscLograd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscLograd() {
        return dscLograd;
    }

    /**
     * Define o valor da propriedade dscLograd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscLograd(String value) {
        this.dscLograd = value;
    }

    /**
     * Obtém o valor da propriedade nrLograd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrLograd() {
        return nrLograd;
    }

    /**
     * Define o valor da propriedade nrLograd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrLograd(String value) {
        this.nrLograd = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade nmCid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmCid() {
        return nmCid;
    }

    /**
     * Define o valor da propriedade nmCid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmCid(String value) {
        this.nmCid = value;
    }

    /**
     * Obtém o valor da propriedade codPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define o valor da propriedade codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

}
