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
 * <p>Java class for SA_BUGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SA_BUGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERROR_NO" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ERROR_MSG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERROR_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PROCESS_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OSUSER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUDSID" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RUN_DATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MODULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="48"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLIENT_INFO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SYSTEM_PHASE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DEBUG_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALL_STACK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERROR_STACK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
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
@XmlType(name = "SA_BUGType", propOrder = {
    "errorno",
    "errormsg",
    "errordate",
    "processname",
    "osuser",
    "audsid",
    "rundate",
    "module",
    "action",
    "clientinfo",
    "systemphase",
    "debuginfo",
    "callstack",
    "errorstack"
})
public class SABUGType {

    @XmlElement(name = "ERROR_NO")
    protected double errorno;
    @XmlElement(name = "ERROR_MSG", required = true)
    protected String errormsg;
    @XmlElement(name = "ERROR_DATE")
    protected String errordate;
    @XmlElement(name = "PROCESS_NAME")
    protected String processname;
    @XmlElement(name = "OSUSER")
    protected String osuser;
    @XmlElement(name = "AUDSID")
    protected Double audsid;
    @XmlElement(name = "RUN_DATE")
    protected String rundate;
    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "CLIENT_INFO")
    protected String clientinfo;
    @XmlElement(name = "SYSTEM_PHASE")
    protected String systemphase;
    @XmlElement(name = "DEBUG_INFO")
    protected String debuginfo;
    @XmlElement(name = "CALL_STACK")
    protected String callstack;
    @XmlElement(name = "ERROR_STACK")
    protected String errorstack;

    /**
     * Gets the value of the errorno property.
     * 
     */
    public double getERRORNO() {
        return errorno;
    }

    /**
     * Sets the value of the errorno property.
     * 
     */
    public void setERRORNO(double value) {
        this.errorno = value;
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

    /**
     * Gets the value of the errordate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORDATE() {
        return errordate;
    }

    /**
     * Sets the value of the errordate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORDATE(String value) {
        this.errordate = value;
    }

    /**
     * Gets the value of the processname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSNAME() {
        return processname;
    }

    /**
     * Sets the value of the processname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSNAME(String value) {
        this.processname = value;
    }

    /**
     * Gets the value of the osuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSUSER() {
        return osuser;
    }

    /**
     * Sets the value of the osuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSUSER(String value) {
        this.osuser = value;
    }

    /**
     * Gets the value of the audsid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAUDSID() {
        return audsid;
    }

    /**
     * Sets the value of the audsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAUDSID(Double value) {
        this.audsid = value;
    }

    /**
     * Gets the value of the rundate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUNDATE() {
        return rundate;
    }

    /**
     * Sets the value of the rundate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUNDATE(String value) {
        this.rundate = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the clientinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTINFO() {
        return clientinfo;
    }

    /**
     * Sets the value of the clientinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTINFO(String value) {
        this.clientinfo = value;
    }

    /**
     * Gets the value of the systemphase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMPHASE() {
        return systemphase;
    }

    /**
     * Sets the value of the systemphase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMPHASE(String value) {
        this.systemphase = value;
    }

    /**
     * Gets the value of the debuginfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBUGINFO() {
        return debuginfo;
    }

    /**
     * Sets the value of the debuginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBUGINFO(String value) {
        this.debuginfo = value;
    }

    /**
     * Gets the value of the callstack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLSTACK() {
        return callstack;
    }

    /**
     * Sets the value of the callstack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLSTACK(String value) {
        this.callstack = value;
    }

    /**
     * Gets the value of the errorstack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORSTACK() {
        return errorstack;
    }

    /**
     * Sets the value of the errorstack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORSTACK(String value) {
        this.errorstack = value;
    }

}
