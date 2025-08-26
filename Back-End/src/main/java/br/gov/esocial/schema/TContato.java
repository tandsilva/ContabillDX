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
 * <p>Classe Java de T_contato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_contato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fonePrinc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="8"/&gt;
 *               &lt;maxLength value="13"/&gt;
 *               &lt;pattern value=".*[^\s].*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="emailPrinc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="6"/&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;pattern value=".*[^\s].*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "T_contato", propOrder = {
    "fonePrinc",
    "emailPrinc"
})
public class TContato {

    protected String fonePrinc;
    protected String emailPrinc;

    /**
     * Obtém o valor da propriedade fonePrinc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonePrinc() {
        return fonePrinc;
    }

    /**
     * Define o valor da propriedade fonePrinc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonePrinc(String value) {
        this.fonePrinc = value;
    }

    /**
     * Obtém o valor da propriedade emailPrinc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPrinc() {
        return emailPrinc;
    }

    /**
     * Define o valor da propriedade emailPrinc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPrinc(String value) {
        this.emailPrinc = value;
    }

}
