//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 11:59:11 PM EDT 
//


package com.es.manager.association;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyMeterAssocAndConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyMeterAssocAndConfigType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="meters" type="{}meterListType"/&gt;
 *         &lt;element ref="{}propertyRepresentation"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyMeterAssocAndConfigType", propOrder = {

})
public class EnergyMeterAssocAndConfigType {

    @XmlElement(required = true)
    protected MeterListType meters;
    @XmlElement(required = true)
    protected PropertyRepresentation propertyRepresentation;

    /**
     * Gets the value of the meters property.
     * 
     * @return
     *     possible object is
     *     {@link MeterListType }
     *     
     */
    public MeterListType getMeters() {
        return meters;
    }

    /**
     * Sets the value of the meters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterListType }
     *     
     */
    public void setMeters(MeterListType value) {
        this.meters = value;
    }

    /**
     * Gets the value of the propertyRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRepresentation }
     *     
     */
    public PropertyRepresentation getPropertyRepresentation() {
        return propertyRepresentation;
    }

    /**
     * Sets the value of the propertyRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRepresentation }
     *     
     */
    public void setPropertyRepresentation(PropertyRepresentation value) {
        this.propertyRepresentation = value;
    }

}
