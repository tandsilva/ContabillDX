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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de T_infoEstagiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoEstagiario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="natEstagio"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="O"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nivEstagio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="8"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="areaAtuacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_texto_100" minOccurs="0"/&gt;
 *         &lt;element name="nrApol" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codigo_esocial" minOccurs="0"/&gt;
 *         &lt;element name="dtPrevTerm" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="instEnsino"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cnpjInstEnsino" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj" minOccurs="0"/&gt;
 *                   &lt;element name="nmRazao" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_texto_100" minOccurs="0"/&gt;
 *                   &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_dscLograd" minOccurs="0"/&gt;
 *                   &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrLograd" minOccurs="0"/&gt;
 *                   &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_bairro" minOccurs="0"/&gt;
 *                   &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cep" minOccurs="0"/&gt;
 *                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codMunic" minOccurs="0"/&gt;
 *                   &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_uf" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ageIntegracao" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cnpjAgntInteg" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supervisorEstagio" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cpfSupervisor" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cpf"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "T_infoEstagiario", propOrder = {
    "natEstagio",
    "nivEstagio",
    "areaAtuacao",
    "nrApol",
    "dtPrevTerm",
    "instEnsino",
    "ageIntegracao",
    "supervisorEstagio"
})
public class TInfoEstagiario {

    @XmlElement(required = true)
    protected String natEstagio;
    protected Byte nivEstagio;
    protected String areaAtuacao;
    protected String nrApol;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtPrevTerm;
    @XmlElement(required = true)
    protected TInfoEstagiario.InstEnsino instEnsino;
    protected TInfoEstagiario.AgeIntegracao ageIntegracao;
    protected TInfoEstagiario.SupervisorEstagio supervisorEstagio;

    /**
     * Obtém o valor da propriedade natEstagio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatEstagio() {
        return natEstagio;
    }

    /**
     * Define o valor da propriedade natEstagio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatEstagio(String value) {
        this.natEstagio = value;
    }

    /**
     * Obtém o valor da propriedade nivEstagio.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNivEstagio() {
        return nivEstagio;
    }

    /**
     * Define o valor da propriedade nivEstagio.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNivEstagio(Byte value) {
        this.nivEstagio = value;
    }

    /**
     * Obtém o valor da propriedade areaAtuacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define o valor da propriedade areaAtuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaAtuacao(String value) {
        this.areaAtuacao = value;
    }

    /**
     * Obtém o valor da propriedade nrApol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrApol() {
        return nrApol;
    }

    /**
     * Define o valor da propriedade nrApol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrApol(String value) {
        this.nrApol = value;
    }

    /**
     * Obtém o valor da propriedade dtPrevTerm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrevTerm() {
        return dtPrevTerm;
    }

    /**
     * Define o valor da propriedade dtPrevTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPrevTerm(XMLGregorianCalendar value) {
        this.dtPrevTerm = value;
    }

    /**
     * Obtém o valor da propriedade instEnsino.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.InstEnsino }
     *     
     */
    public TInfoEstagiario.InstEnsino getInstEnsino() {
        return instEnsino;
    }

    /**
     * Define o valor da propriedade instEnsino.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.InstEnsino }
     *     
     */
    public void setInstEnsino(TInfoEstagiario.InstEnsino value) {
        this.instEnsino = value;
    }

    /**
     * Obtém o valor da propriedade ageIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.AgeIntegracao }
     *     
     */
    public TInfoEstagiario.AgeIntegracao getAgeIntegracao() {
        return ageIntegracao;
    }

    /**
     * Define o valor da propriedade ageIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.AgeIntegracao }
     *     
     */
    public void setAgeIntegracao(TInfoEstagiario.AgeIntegracao value) {
        this.ageIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade supervisorEstagio.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.SupervisorEstagio }
     *     
     */
    public TInfoEstagiario.SupervisorEstagio getSupervisorEstagio() {
        return supervisorEstagio;
    }

    /**
     * Define o valor da propriedade supervisorEstagio.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.SupervisorEstagio }
     *     
     */
    public void setSupervisorEstagio(TInfoEstagiario.SupervisorEstagio value) {
        this.supervisorEstagio = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="cnpjAgntInteg" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cnpjAgntInteg"
    })
    public static class AgeIntegracao {

        @XmlElement(required = true)
        protected String cnpjAgntInteg;

        /**
         * Obtém o valor da propriedade cnpjAgntInteg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjAgntInteg() {
            return cnpjAgntInteg;
        }

        /**
         * Define o valor da propriedade cnpjAgntInteg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjAgntInteg(String value) {
            this.cnpjAgntInteg = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="cnpjInstEnsino" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj" minOccurs="0"/&gt;
     *         &lt;element name="nmRazao" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_texto_100" minOccurs="0"/&gt;
     *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_dscLograd" minOccurs="0"/&gt;
     *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_nrLograd" minOccurs="0"/&gt;
     *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_bairro" minOccurs="0"/&gt;
     *         &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cep" minOccurs="0"/&gt;
     *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_codMunic" minOccurs="0"/&gt;
     *         &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_uf" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cnpjInstEnsino",
        "nmRazao",
        "dscLograd",
        "nrLograd",
        "bairro",
        "cep",
        "codMunic",
        "uf"
    })
    public static class InstEnsino {

        protected String cnpjInstEnsino;
        protected String nmRazao;
        protected String dscLograd;
        protected String nrLograd;
        protected String bairro;
        protected String cep;
        protected BigInteger codMunic;
        @XmlSchemaType(name = "string")
        protected TSUf uf;

        /**
         * Obtém o valor da propriedade cnpjInstEnsino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjInstEnsino() {
            return cnpjInstEnsino;
        }

        /**
         * Define o valor da propriedade cnpjInstEnsino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjInstEnsino(String value) {
            this.cnpjInstEnsino = value;
        }

        /**
         * Obtém o valor da propriedade nmRazao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmRazao() {
            return nmRazao;
        }

        /**
         * Define o valor da propriedade nmRazao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmRazao(String value) {
            this.nmRazao = value;
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
         * Obtém o valor da propriedade cep.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCep() {
            return cep;
        }

        /**
         * Define o valor da propriedade cep.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCep(String value) {
            this.cep = value;
        }

        /**
         * Obtém o valor da propriedade codMunic.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodMunic() {
            return codMunic;
        }

        /**
         * Define o valor da propriedade codMunic.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodMunic(BigInteger value) {
            this.codMunic = value;
        }

        /**
         * Obtém o valor da propriedade uf.
         * 
         * @return
         *     possible object is
         *     {@link TSUf }
         *     
         */
        public TSUf getUf() {
            return uf;
        }

        /**
         * Define o valor da propriedade uf.
         * 
         * @param value
         *     allowed object is
         *     {@link TSUf }
         *     
         */
        public void setUf(TSUf value) {
            this.uf = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="cpfSupervisor" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cpf"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cpfSupervisor"
    })
    public static class SupervisorEstagio {

        @XmlElement(required = true)
        protected String cpfSupervisor;

        /**
         * Obtém o valor da propriedade cpfSupervisor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfSupervisor() {
            return cpfSupervisor;
        }

        /**
         * Define o valor da propriedade cpfSupervisor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfSupervisor(String value) {
            this.cpfSupervisor = value;
        }

    }

}
