//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:51 AM BRT 
//


package OUT.S2500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_infoIntermProcTrab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoIntermProcTrab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_dia"/>
 *         &lt;element name="hrsTrab" type="{http://www.esocial.gov.br/schema/evt/evtProcTrab/v_S_01_03_00}TS_hora" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoIntermProcTrab", propOrder = {
    "dia",
    "hrsTrab"
})
public class TInfoIntermProcTrab {

    protected byte dia;
    protected String hrsTrab;

    /**
     * Obtém o valor da propriedade dia.
     * 
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Define o valor da propriedade dia.
     * 
     */
    public void setDia(byte value) {
        this.dia = value;
    }

    /**
     * Obtém o valor da propriedade hrsTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrsTrab() {
        return hrsTrab;
    }

    /**
     * Define o valor da propriedade hrsTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrsTrab(String value) {
        this.hrsTrab = value;
    }

}
