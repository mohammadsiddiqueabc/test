//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.21 at 04:05:40 AM GST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FT_CHARGES_CC_COLLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FT_CHARGES_CC_COLLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FT_CHARGES_CC_T" type="{}FT_CHARGES_CC_TType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FT_CHARGES_CC_COLLType", propOrder = {
    "ftchargescct"
})
public class FTCHARGESCCCOLLType {

    @XmlElement(name = "FT_CHARGES_CC_T")
    protected List<FTCHARGESCCTType> ftchargescct;

    /**
     * Gets the value of the ftchargescct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftchargescct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFTCHARGESCCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTCHARGESCCTType }
     * 
     * 
     */
    public List<FTCHARGESCCTType> getFTCHARGESCCT() {
        if (ftchargescct == null) {
            ftchargescct = new ArrayList<FTCHARGESCCTType>();
        }
        return this.ftchargescct;
    }

}
