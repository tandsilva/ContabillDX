//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0.1 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.08.26 às 06:47:28 PM UTC 
//


package br.gov.esocial.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: OC
 * 
 * <p>Classe Java de T_procJudTrab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_procJudTrab"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpTrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_tpTrib"/&gt;
 *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrProcJud_1"/&gt;
 *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codSusp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_procJudTrab", propOrder = {
    "tpTrib",
    "nrProcJud",
    "codSusp"
})
public class TProcJudTrab {

    protected byte tpTrib;
    @XmlElement(required = true)
    protected String nrProcJud;
    @XmlElement(required = true)
    protected BigInteger codSusp;

    /**
     * Obtém o valor da propriedade tpTrib.
     * 
     */
    public byte getTpTrib() {
        return tpTrib;
    }

    /**
     * Define o valor da propriedade tpTrib.
     * 
     */
    public void setTpTrib(byte value) {
        this.tpTrib = value;
    }

    /**
     * Obtém o valor da propriedade nrProcJud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcJud() {
        return nrProcJud;
    }

    /**
     * Define o valor da propriedade nrProcJud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcJud(String value) {
        this.nrProcJud = value;
    }

    /**
     * Obtém o valor da propriedade codSusp.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodSusp() {
        return codSusp;
    }

    /**
     * Define o valor da propriedade codSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodSusp(BigInteger value) {
        this.codSusp = value;
    }

}
