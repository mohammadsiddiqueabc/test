//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.27 at 07:01:48 PM GST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FT_FH_CREDIT_ACCT_TType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FT_FH_CREDIT_ACCT_TType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ACCT_NO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "FT_FH_CREDIT_ACCT_TType", propOrder = {
    "position",
    "acctno"
})
public class FTFHCREDITACCTTType {

    @XmlElement(name = "POSITION")
    protected double position;
    @XmlElement(name = "ACCT_NO", required = true)
    protected String acctno;

    /**
     * Gets the value of the position property.
     * 
     */
    public double getPOSITION() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPOSITION(double value) {
        this.position = value;
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

}