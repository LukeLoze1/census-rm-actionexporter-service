
package uk.gov.ons.ctp.response.kirona.drs.autogeneratedcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://autogenerated.OTWebServiceApi.xmbrace.com/}entity">
 *       &lt;sequence>
 *         &lt;element name="bookingCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingCodeSORCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemNumberWithinBooking" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="primaryOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardMinuteValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingCode", propOrder = {
    "bookingCodeDescription",
    "bookingCodeSORCode",
    "bookingId",
    "comments",
    "itemNumberWithinBooking",
    "itemValue",
    "orderId",
    "primaryOrderNumber",
    "quantity",
    "reference",
    "standardMinuteValue",
    "trade"
})
public class BookingCode
    extends Entity
{

    protected String bookingCodeDescription;
    @XmlElement(required = true)
    protected String bookingCodeSORCode;
    protected int bookingId;
    protected String comments;
    @XmlElement(required = true)
    protected String itemNumberWithinBooking;
    protected String itemValue;
    protected int orderId;
    @XmlElement(required = true)
    protected String primaryOrderNumber;
    @XmlElement(required = true)
    protected String quantity;
    protected String reference;
    protected String standardMinuteValue;
    protected String trade;

    /**
     * Gets the value of the bookingCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCodeDescription() {
        return bookingCodeDescription;
    }

    /**
     * Sets the value of the bookingCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCodeDescription(String value) {
        this.bookingCodeDescription = value;
    }

    /**
     * Gets the value of the bookingCodeSORCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCodeSORCode() {
        return bookingCodeSORCode;
    }

    /**
     * Sets the value of the bookingCodeSORCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCodeSORCode(String value) {
        this.bookingCodeSORCode = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the itemNumberWithinBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumberWithinBooking() {
        return itemNumberWithinBooking;
    }

    /**
     * Sets the value of the itemNumberWithinBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumberWithinBooking(String value) {
        this.itemNumberWithinBooking = value;
    }

    /**
     * Gets the value of the itemValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * Sets the value of the itemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemValue(String value) {
        this.itemValue = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the primaryOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrderNumber() {
        return primaryOrderNumber;
    }

    /**
     * Sets the value of the primaryOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrderNumber(String value) {
        this.primaryOrderNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the standardMinuteValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardMinuteValue() {
        return standardMinuteValue;
    }

    /**
     * Sets the value of the standardMinuteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardMinuteValue(String value) {
        this.standardMinuteValue = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrade(String value) {
        this.trade = value;
    }

}
