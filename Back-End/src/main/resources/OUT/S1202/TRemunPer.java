//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:56 AM BRT 
//


package OUT.S1202;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_remunPer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_remunPer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_03_00}TS_matricula" minOccurs="0"/>
 *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_03_00}T_itensRemun_rpps_descFolha" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_remunPer", propOrder = {
    "matricula",
    "itensRemun"
})
public class TRemunPer {

    protected String matricula;
    @XmlElement(required = true)
    protected List<TItensRemunRppsDescFolha> itensRemun;

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
     * Gets the value of the itensRemun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensRemun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TItensRemunRppsDescFolha }
     * 
     * 
     */
    public List<TItensRemunRppsDescFolha> getItensRemun() {
        if (itensRemun == null) {
            itensRemun = new ArrayList<TItensRemunRppsDescFolha>();
        }
        return this.itensRemun;
    }

}
