//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:36 AM BRT 
//


package OUT.S1270;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {cpfTrab*}, {matricula*}, {codCateg*}
 * 
 * <p>Classe Java de T_ideVinculo_sst complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideVinculo_sst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_cpfTrab"/>
 *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_codCateg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideVinculo_sst", propOrder = {
    "cpfTrab",
    "matricula",
    "codCateg"
})
public class TIdeVinculoSst {

    @XmlElement(required = true)
    protected String cpfTrab;
    protected String matricula;
    protected BigInteger codCateg;

    /**
     * Obtém o valor da propriedade cpfTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfTrab() {
        return cpfTrab;
    }

    /**
     * Define o valor da propriedade cpfTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfTrab(String value) {
        this.cpfTrab = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
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

}
