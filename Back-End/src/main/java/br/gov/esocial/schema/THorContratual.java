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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_horContratual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_horContratual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qtdHrsSem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxInclusive value="99.99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tpJornada"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *               &lt;enumeration value="6"/&gt;
 *               &lt;enumeration value="7"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tmpParc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tmpParc"/&gt;
 *         &lt;element name="horNoturno" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_sim_nao" minOccurs="0"/&gt;
 *         &lt;element name="dscJorn" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_texto_999"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_horContratual", propOrder = {
    "qtdHrsSem",
    "tpJornada",
    "tmpParc",
    "horNoturno",
    "dscJorn"
})
public class THorContratual {

    protected BigDecimal qtdHrsSem;
    protected byte tpJornada;
    protected byte tmpParc;
    @XmlSchemaType(name = "string")
    protected TSSimNao horNoturno;
    @XmlElement(required = true)
    protected String dscJorn;

    /**
     * Obtém o valor da propriedade qtdHrsSem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdHrsSem() {
        return qtdHrsSem;
    }

    /**
     * Define o valor da propriedade qtdHrsSem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdHrsSem(BigDecimal value) {
        this.qtdHrsSem = value;
    }

    /**
     * Obtém o valor da propriedade tpJornada.
     * 
     */
    public byte getTpJornada() {
        return tpJornada;
    }

    /**
     * Define o valor da propriedade tpJornada.
     * 
     */
    public void setTpJornada(byte value) {
        this.tpJornada = value;
    }

    /**
     * Obtém o valor da propriedade tmpParc.
     * 
     */
    public byte getTmpParc() {
        return tmpParc;
    }

    /**
     * Define o valor da propriedade tmpParc.
     * 
     */
    public void setTmpParc(byte value) {
        this.tmpParc = value;
    }

    /**
     * Obtém o valor da propriedade horNoturno.
     * 
     * @return
     *     possible object is
     *     {@link TSSimNao }
     *     
     */
    public TSSimNao getHorNoturno() {
        return horNoturno;
    }

    /**
     * Define o valor da propriedade horNoturno.
     * 
     * @param value
     *     allowed object is
     *     {@link TSSimNao }
     *     
     */
    public void setHorNoturno(TSSimNao value) {
        this.horNoturno = value;
    }

    /**
     * Obtém o valor da propriedade dscJorn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscJorn() {
        return dscJorn;
    }

    /**
     * Define o valor da propriedade dscJorn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscJorn(String value) {
        this.dscJorn = value;
    }

}
