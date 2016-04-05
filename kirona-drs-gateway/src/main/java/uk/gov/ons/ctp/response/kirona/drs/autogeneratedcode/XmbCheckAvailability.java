
package uk.gov.ons.ctp.response.kirona.drs.autogeneratedcode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xmbCheckAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmbCheckAvailability">
 *   &lt;complexContent>
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}command">
 *       &lt;sequence>
 *         &lt;element name="canSelectOtherOrders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="checkAvailType" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}checkAvailTypeType" minOccurs="0"/>
 *         &lt;element name="newBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onlyBestSlots" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}onlyBestSlotsValue" minOccurs="0"/>
 *         &lt;element name="otherOrderPattern" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}orderPattern" minOccurs="0"/>
 *         &lt;element name="periodBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="periodEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resourceIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theOrder" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}order" minOccurs="0"/>
 *         &lt;element name="theResourceIDContracts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmbCheckAvailability", propOrder = {
    "canSelectOtherOrders",
    "checkAvailType",
    "newBooking",
    "onlyBestSlots",
    "otherOrderPattern",
    "periodBegin",
    "periodEnd",
    "resourceIDs",
    "sessionId",
    "theOrder",
    "theResourceIDContracts"
})
public class XmbCheckAvailability
    extends Command
{

    protected boolean canSelectOtherOrders;
    protected CheckAvailTypeType checkAvailType;
    @XmlElement(defaultValue = "true")
    protected boolean newBooking;
    protected OnlyBestSlotsValue onlyBestSlots;
    protected OrderPattern otherOrderPattern;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodBegin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodEnd;
    protected List<String> resourceIDs;
    @XmlElement(required = true)
    protected String sessionId;
    protected Order theOrder;
    protected List<String> theResourceIDContracts;

    /**
     * Gets the value of the canSelectOtherOrders property.
     * 
     */
    public boolean isCanSelectOtherOrders() {
        return canSelectOtherOrders;
    }

    /**
     * Sets the value of the canSelectOtherOrders property.
     * 
     */
    public void setCanSelectOtherOrders(boolean value) {
        this.canSelectOtherOrders = value;
    }

    /**
     * Gets the value of the checkAvailType property.
     * 
     * @return
     *     possible object is
     *     {@link CheckAvailTypeType }
     *     
     */
    public CheckAvailTypeType getCheckAvailType() {
        return checkAvailType;
    }

    /**
     * Sets the value of the checkAvailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckAvailTypeType }
     *     
     */
    public void setCheckAvailType(CheckAvailTypeType value) {
        this.checkAvailType = value;
    }

    /**
     * Gets the value of the newBooking property.
     * 
     */
    public boolean isNewBooking() {
        return newBooking;
    }

    /**
     * Sets the value of the newBooking property.
     * 
     */
    public void setNewBooking(boolean value) {
        this.newBooking = value;
    }

    /**
     * Gets the value of the onlyBestSlots property.
     * 
     * @return
     *     possible object is
     *     {@link OnlyBestSlotsValue }
     *     
     */
    public OnlyBestSlotsValue getOnlyBestSlots() {
        return onlyBestSlots;
    }

    /**
     * Sets the value of the onlyBestSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlyBestSlotsValue }
     *     
     */
    public void setOnlyBestSlots(OnlyBestSlotsValue value) {
        this.onlyBestSlots = value;
    }

    /**
     * Gets the value of the otherOrderPattern property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPattern }
     *     
     */
    public OrderPattern getOtherOrderPattern() {
        return otherOrderPattern;
    }

    /**
     * Sets the value of the otherOrderPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPattern }
     *     
     */
    public void setOtherOrderPattern(OrderPattern value) {
        this.otherOrderPattern = value;
    }

    /**
     * Gets the value of the periodBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodBegin() {
        return periodBegin;
    }

    /**
     * Sets the value of the periodBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodBegin(XMLGregorianCalendar value) {
        this.periodBegin = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the resourceIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResourceIDs() {
        if (resourceIDs == null) {
            resourceIDs = new ArrayList<String>();
        }
        return this.resourceIDs;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the theOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getTheOrder() {
        return theOrder;
    }

    /**
     * Sets the value of the theOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setTheOrder(Order value) {
        this.theOrder = value;
    }

    /**
     * Gets the value of the theResourceIDContracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theResourceIDContracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheResourceIDContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTheResourceIDContracts() {
        if (theResourceIDContracts == null) {
            theResourceIDContracts = new ArrayList<String>();
        }
        return this.theResourceIDContracts;
    }

}
