//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.21 at 04:06:32 AM GST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SYM_FT_TRANSFER_CC_OUTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYM_FT_TRANSFER_CC_OUTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER_OUT" type="{}SA_HEADER_OUTType"/>
 *         &lt;element name="REF_NO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAN_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAN_DESC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATE_UPDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPOT_RATE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TRAN_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DR_VALUE_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DR_CCY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DR_AVAIL_BAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DR_LEDGER_BAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CR_CCY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CR_AVAIL_BAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CR_LEDGER_BAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DR_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CR_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ERROR_MSG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYM_FT_TRANSFER_CC_OUTType", propOrder = {
    "headerout",
    "refno",
    "trantype",
    "trandesc",
    "dateupdate",
    "spotrate",
    "transtatus",
    "drvaluedate",
    "dramount",
    "drccy",
    "dravailbal",
    "drledgerbal",
    "cramount",
    "crccy",
    "cravailbal",
    "crledgerbal",
    "drtotalamount",
    "crtotalamount",
    "errorcode",
    "errormsg"
})
public class SYMFTTRANSFERCCOUTType {

    @XmlElement(name = "HEADER_OUT", required = true)
    protected SAHEADEROUTType headerout;
    @XmlElement(name = "REF_NO")
    protected String refno;
    @XmlElement(name = "TRAN_TYPE")
    protected String trantype;
    @XmlElement(name = "TRAN_DESC")
    protected String trandesc;
    @XmlElement(name = "DATE_UPDATE")
    protected String dateupdate;
    @XmlElement(name = "SPOT_RATE")
    protected Double spotrate;
    @XmlElement(name = "TRAN_STATUS")
    protected String transtatus;
    @XmlElement(name = "DR_VALUE_DATE")
    protected String drvaluedate;
    @XmlElement(name = "DR_AMOUNT")
    protected Double dramount;
    @XmlElement(name = "DR_CCY")
    protected String drccy;
    @XmlElement(name = "DR_AVAIL_BAL")
    protected Double dravailbal;
    @XmlElement(name = "DR_LEDGER_BAL")
    protected Double drledgerbal;
    @XmlElement(name = "CR_AMOUNT")
    protected Double cramount;
    @XmlElement(name = "CR_CCY")
    protected String crccy;
    @XmlElement(name = "CR_AVAIL_BAL")
    protected Double cravailbal;
    @XmlElement(name = "CR_LEDGER_BAL")
    protected Double crledgerbal;
    @XmlElement(name = "DR_TOTAL_AMOUNT")
    protected Double drtotalamount;
    @XmlElement(name = "CR_TOTAL_AMOUNT")
    protected Double crtotalamount;
    @XmlElement(name = "ERROR_CODE")
    protected Double errorcode;
    @XmlElement(name = "ERROR_MSG")
    protected String errormsg;

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
     * Gets the value of the refno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFNO() {
        return refno;
    }

    /**
     * Sets the value of the refno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFNO(String value) {
        this.refno = value;
    }

    /**
     * Gets the value of the trantype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANTYPE() {
        return trantype;
    }

    /**
     * Sets the value of the trantype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANTYPE(String value) {
        this.trantype = value;
    }

    /**
     * Gets the value of the trandesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANDESC() {
        return trandesc;
    }

    /**
     * Sets the value of the trandesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANDESC(String value) {
        this.trandesc = value;
    }

    /**
     * Gets the value of the dateupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEUPDATE() {
        return dateupdate;
    }

    /**
     * Sets the value of the dateupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEUPDATE(String value) {
        this.dateupdate = value;
    }

    /**
     * Gets the value of the spotrate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSPOTRATE() {
        return spotrate;
    }

    /**
     * Sets the value of the spotrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSPOTRATE(Double value) {
        this.spotrate = value;
    }

    /**
     * Gets the value of the transtatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSTATUS() {
        return transtatus;
    }

    /**
     * Sets the value of the transtatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSTATUS(String value) {
        this.transtatus = value;
    }

    /**
     * Gets the value of the drvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRVALUEDATE() {
        return drvaluedate;
    }

    /**
     * Sets the value of the drvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRVALUEDATE(String value) {
        this.drvaluedate = value;
    }

    /**
     * Gets the value of the dramount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDRAMOUNT() {
        return dramount;
    }

    /**
     * Sets the value of the dramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDRAMOUNT(Double value) {
        this.dramount = value;
    }

    /**
     * Gets the value of the drccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCCY() {
        return drccy;
    }

    /**
     * Sets the value of the drccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCCY(String value) {
        this.drccy = value;
    }

    /**
     * Gets the value of the dravailbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDRAVAILBAL() {
        return dravailbal;
    }

    /**
     * Sets the value of the dravailbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDRAVAILBAL(Double value) {
        this.dravailbal = value;
    }

    /**
     * Gets the value of the drledgerbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDRLEDGERBAL() {
        return drledgerbal;
    }

    /**
     * Sets the value of the drledgerbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDRLEDGERBAL(Double value) {
        this.drledgerbal = value;
    }

    /**
     * Gets the value of the cramount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCRAMOUNT() {
        return cramount;
    }

    /**
     * Sets the value of the cramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCRAMOUNT(Double value) {
        this.cramount = value;
    }

    /**
     * Gets the value of the crccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCCY() {
        return crccy;
    }

    /**
     * Sets the value of the crccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCCY(String value) {
        this.crccy = value;
    }

    /**
     * Gets the value of the cravailbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCRAVAILBAL() {
        return cravailbal;
    }

    /**
     * Sets the value of the cravailbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCRAVAILBAL(Double value) {
        this.cravailbal = value;
    }

    /**
     * Gets the value of the crledgerbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCRLEDGERBAL() {
        return crledgerbal;
    }

    /**
     * Sets the value of the crledgerbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCRLEDGERBAL(Double value) {
        this.crledgerbal = value;
    }

    /**
     * Gets the value of the drtotalamount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDRTOTALAMOUNT() {
        return drtotalamount;
    }

    /**
     * Sets the value of the drtotalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDRTOTALAMOUNT(Double value) {
        this.drtotalamount = value;
    }

    /**
     * Gets the value of the crtotalamount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCRTOTALAMOUNT() {
        return crtotalamount;
    }

    /**
     * Sets the value of the crtotalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCRTOTALAMOUNT(Double value) {
        this.crtotalamount = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setERRORCODE(Double value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errormsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORMSG() {
        return errormsg;
    }

    /**
     * Sets the value of the errormsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORMSG(String value) {
        this.errormsg = value;
    }

}
