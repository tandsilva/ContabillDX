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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Grupo de informações do nascimento do trabalhador.
 * 
 * <p>Classe Java de T_nascimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_nascimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="paisNascto" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_pais"/&gt;
 *         &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_paisNac"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_nascimento", propOrder = {
    "dtNascto",
    "paisNascto",
    "paisNac"
})
public class TNascimento {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtNascto;
    @XmlElement(required = true)
    protected String paisNascto;
    @XmlElement(required = true)
    protected String paisNac;

    /**
     * Obtém o valor da propriedade dtNascto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNascto() {
        return dtNascto;
    }

    /**
     * Define o valor da propriedade dtNascto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNascto(XMLGregorianCalendar value) {
        this.dtNascto = value;
    }

    /**
     * Obtém o valor da propriedade paisNascto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNascto() {
        return paisNascto;
    }

    /**
     * Define o valor da propriedade paisNascto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNascto(String value) {
        this.paisNascto = value;
    }

    /**
     * Obtém o valor da propriedade paisNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNac() {
        return paisNac;
    }

    /**
     * Define o valor da propriedade paisNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNac(String value) {
        this.paisNac = value;
    }

}
