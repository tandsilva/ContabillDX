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
 * CONDICAO_GRUPO: O (se {}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 = [9253]); N (nos demais casos)
 * 
 * <p>Classe Java de T_descFolha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_descFolha"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpDesc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="instFinanc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nrDoc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="15"/&gt;
 *               &lt;pattern value="[A-Za-z0-9][-_A-Za-z0-9/.//]{0,13}[A-Za-z0-9]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_observacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_descFolha", propOrder = {
    "tpDesc",
    "instFinanc",
    "nrDoc",
    "observacao"
})
public class TDescFolha {

    protected byte tpDesc;
    @XmlElement(required = true)
    protected String instFinanc;
    @XmlElement(required = true)
    protected String nrDoc;
    protected String observacao;

    /**
     * Obtém o valor da propriedade tpDesc.
     * 
     */
    public byte getTpDesc() {
        return tpDesc;
    }

    /**
     * Define o valor da propriedade tpDesc.
     * 
     */
    public void setTpDesc(byte value) {
        this.tpDesc = value;
    }

    /**
     * Obtém o valor da propriedade instFinanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstFinanc() {
        return instFinanc;
    }

    /**
     * Define o valor da propriedade instFinanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstFinanc(String value) {
        this.instFinanc = value;
    }

    /**
     * Obtém o valor da propriedade nrDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrDoc() {
        return nrDoc;
    }

    /**
     * Define o valor da propriedade nrDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrDoc(String value) {
        this.nrDoc = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
