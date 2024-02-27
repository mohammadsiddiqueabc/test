//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.27 at 07:04:38 PM GST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SYM_FT_FUNDS_HELD_OUTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYM_FT_FUNDS_HELD_OUTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER_OUT" type="{}SA_HEADER_OUTType"/>
 *         &lt;element name="ACCT_NO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="START_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="END_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESTRAINT_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLEDGED_AMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CCY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NARRATIVE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORCE_FUNDS_HELD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="REFERENCE_NO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOURCE_MODULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAST_CHANGE_OFFICER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FH_OPERATION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FH_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FT_FH_CREDIT_ACCT_OUT" type="{}FT_FH_CREDIT_ACCT_COLL_OUTType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYM_FT_FUNDS_HELD_OUTType", propOrder = {
    "headerout",
    "acctno",
    "startdate",
    "enddate",
    "restrainttype",
    "pledgedamt",
    "ccy",
    "narrative",
    "forcefundsheld",
    "referenceno",
    "sourcemodule",
    "lastchangeofficer",
    "fhoperation",
    "fhseqno",
    "status",
    "ftfhcreditacctout"
})
public class SYMFTFUNDSHELDOUTType {

    @XmlElement(name = "HEADER_OUT", required = true)
    protected SAHEADEROUTType headerout;
    @XmlElement(name = "ACCT_NO")
    protected String acctno;
    @XmlElement(name = "START_DATE")
    protected String startdate;
    @XmlElement(name = "END_DATE")
    protected String enddate;
    @XmlElement(name = "RESTRAINT_TYPE")
    protected String restrainttype;
    @XmlElement(name = "PLEDGED_AMT")
    protected Double pledgedamt;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "NARRATIVE")
    protected String narrative;
    @XmlElement(name = "FORCE_FUNDS_HELD")
    protected String forcefundsheld;
    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "SOURCE_MODULE")
    protected String sourcemodule;
    @XmlElement(name = "LAST_CHANGE_OFFICER")
    protected String lastchangeofficer;
    @XmlElement(name = "FH_OPERATION")
    protected String fhoperation;
    @XmlElement(name = "FH_SEQ_NO")
    protected Double fhseqno;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "FT_FH_CREDIT_ACCT_OUT")
    protected FTFHCREDITACCTCOLLOUTType ftfhcreditacctout;

    /**
     * Gets the value of the headerout property.
     * 
     * @return
     *     possible object is
     *     {@link SAHEADEROUTType }
     *     
     */
    public SAHEADEROUTType getHEADEROUT() {
        return headerout;
    }

    /**
     * Sets the value of the headerout property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAHEADEROUTType }
     *     
     */
    public void setHEADEROUT(SAHEADEROUTType value) {
        this.headerout = value;
    }

    /**
     * Gets the value of the acctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTNO() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTNO(String value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTDATE(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDATE(String value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the restrainttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTRAINTTYPE() {
        return restrainttype;
    }

    /**
     * Sets the value of the restrainttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTRAINTTYPE(String value) {
        this.restrainttype = value;
    }

    /**
     * Gets the value of the pledgedamt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPLEDGEDAMT() {
        return pledgedamt;
    }

    /**
     * Sets the value of the pledgedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPLEDGEDAMT(Double value) {
        this.pledgedamt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNARRATIVE() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNARRATIVE(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the forcefundsheld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORCEFUNDSHELD() {
        return forcefundsheld;
    }

    /**
     * Sets the value of the forcefundsheld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORCEFUNDSHELD(String value) {
        this.forcefundsheld = value;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the sourcemodule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEMODULE() {
        return sourcemodule;
    }

    /**
     * Sets the value of the sourcemodule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEMODULE(String value) {
        this.sourcemodule = value;
    }

    /**
     * Gets the value of the lastchangeofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTCHANGEOFFICER() {
        return lastchangeofficer;
    }

    /**
     * Sets the value of the lastchangeofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTCHANGEOFFICER(String value) {
        this.lastchangeofficer = value;
    }

    /**
     * Gets the value of the fhoperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFHOPERATION() {
        return fhoperation;
    }

    /**
     * Sets the value of the fhoperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFHOPERATION(String value) {
        this.fhoperation = value;
    }

    /**
     * Gets the value of the fhseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFHSEQNO() {
        return fhseqno;
    }

    /**
     * Sets the value of the fhseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFHSEQNO(Double value) {
        this.fhseqno = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the ftfhcreditacctout property.
     * 
     * @return
     *     possible object is
     *     {@link FTFHCREDITACCTCOLLOUTType }
     *     
     */
    public FTFHCREDITACCTCOLLOUTType getFTFHCREDITACCTOUT() {
        return ftfhcreditacctout;
    }

    /**
     * Sets the value of the ftfhcreditacctout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTFHCREDITACCTCOLLOUTType }
     *     
     */
    public void setFTFHCREDITACCTOUT(FTFHCREDITACCTCOLLOUTType value) {
        this.ftfhcreditacctout = value;
    }

}
