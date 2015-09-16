//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 12:21:55 AM EDT 
//


package com.es.manager.meter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.es.manager.common.LogType;
import com.es.manager.common.ShareLevelType;


/**
 * A service type used for representing a meter
 * 
 * <p>Java class for meterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{}typeOfMeter"/&gt;
 *         &lt;element name="name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="metered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ccf (hundred cubic feet)"/&gt;
 *               &lt;enumeration value="cf (cubic feet)"/&gt;
 *               &lt;enumeration value="cGal (hundred gallons) (UK)"/&gt;
 *               &lt;enumeration value="cGal (hundred gallons) (US)"/&gt;
 *               &lt;enumeration value="Cubic Meters per Day"/&gt;
 *               &lt;enumeration value="cm (Cubic meters)"/&gt;
 *               &lt;enumeration value="Cords"/&gt;
 *               &lt;enumeration value="Gallons (UK)"/&gt;
 *               &lt;enumeration value="Gallons (US)"/&gt;
 *               &lt;enumeration value="GJ"/&gt;
 *               &lt;enumeration value="kBtu (thousand Btu)"/&gt;
 *               &lt;enumeration value="kcf (thousand cubic feet)"/&gt;
 *               &lt;enumeration value="Kcm (Thousand Cubic meters)"/&gt;
 *               &lt;enumeration value="KGal (thousand gallons) (UK)"/&gt;
 *               &lt;enumeration value="KGal (thousand gallons) (US)"/&gt;
 *               &lt;enumeration value="Kilogram"/&gt;
 *               &lt;enumeration value="KLbs. (thousand pounds)"/&gt;
 *               &lt;enumeration value="kWh (thousand Watt-hours)"/&gt;
 *               &lt;enumeration value="Liters"/&gt;
 *               &lt;enumeration value="MBtu (million Btu)"/&gt;
 *               &lt;enumeration value="MCF(million cubic feet)"/&gt;
 *               &lt;enumeration value="mg/l (milligrams per liter)"/&gt;
 *               &lt;enumeration value="MGal (million gallons) (UK)"/&gt;
 *               &lt;enumeration value="MGal (million gallons) (US)"/&gt;
 *               &lt;enumeration value="Million Gallons per Day"/&gt;
 *               &lt;enumeration value="MLbs. (million pounds)"/&gt;
 *               &lt;enumeration value="MWh (million Watt-hours)"/&gt;
 *               &lt;enumeration value="pounds"/&gt;
 *               &lt;enumeration value="Pounds per year"/&gt;
 *               &lt;enumeration value="therms"/&gt;
 *               &lt;enumeration value="ton hours"/&gt;
 *               &lt;enumeration value="Tonnes (metric)"/&gt;
 *               &lt;enumeration value="tons"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="firstBillDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="inUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inactiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="otherDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accessLevel" type="{}shareLevelType" minOccurs="0"/&gt;
 *         &lt;element name="audit" type="{}logType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterType", propOrder = {

})
@XmlRootElement(name="meter")
public class MeterType {

    protected Long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfMeter type;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = "true")
    protected Boolean metered;
    @XmlElement(required = true)
    protected String unitOfMeasure;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstBillDate;
    protected boolean inUse;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;
    protected String otherDescription;
    @XmlSchemaType(name = "string")
    protected ShareLevelType accessLevel;
    protected LogType audit;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMeter }
     *     
     */
    public TypeOfMeter getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMeter }
     *     
     */
    public void setType(TypeOfMeter value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the metered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetered() {
        return metered;
    }

    /**
     * Sets the value of the metered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetered(Boolean value) {
        this.metered = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the firstBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstBillDate() {
        return firstBillDate;
    }

    /**
     * Sets the value of the firstBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstBillDate(XMLGregorianCalendar value) {
        this.firstBillDate = value;
    }

    /**
     * Gets the value of the inUse property.
     * 
     */
    public boolean isInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     * 
     */
    public void setInUse(boolean value) {
        this.inUse = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInactiveDate(XMLGregorianCalendar value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the otherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    /**
     * Sets the value of the otherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDescription(String value) {
        this.otherDescription = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareLevelType }
     *     
     */
    public ShareLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareLevelType }
     *     
     */
    public void setAccessLevel(ShareLevelType value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link LogType }
     *     
     */
    public LogType getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogType }
     *     
     */
    public void setAudit(LogType value) {
        this.audit = value;
    }

}
