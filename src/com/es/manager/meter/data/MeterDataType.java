//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 12:22:11 AM EDT 
//


package com.es.manager.meter.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.es.manager.common.LinksType;


/**
 * A service type used for getting and receiving meter consumption data
 * 
 * <p>Java class for meterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}meterConsumption" maxOccurs="120" minOccurs="0"/&gt;
 *         &lt;element ref="{}meterDelivery" maxOccurs="120" minOccurs="0"/&gt;
 *         &lt;element name="links" type="{}linksType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterDataType", propOrder = {
    "meterConsumption",
    "meterDelivery",
    "links"
})
@XmlRootElement(name="meterData")
public class MeterDataType {

    protected List<MeterConsumptionType> meterConsumption;
    protected List<MeterDeliveryType> meterDelivery;
    protected LinksType links;

    /**
     * Gets the value of the meterConsumption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterConsumption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterConsumption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterConsumptionType }
     * 
     * 
     */
    public List<MeterConsumptionType> getMeterConsumption() {
        if (meterConsumption == null) {
            meterConsumption = new ArrayList<MeterConsumptionType>();
        }
        return this.meterConsumption;
    }

    /**
     * Gets the value of the meterDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterDeliveryType }
     * 
     * 
     */
    public List<MeterDeliveryType> getMeterDelivery() {
        if (meterDelivery == null) {
            meterDelivery = new ArrayList<MeterDeliveryType>();
        }
        return this.meterDelivery;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link LinksType }
     *     
     */
    public LinksType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinksType }
     *     
     */
    public void setLinks(LinksType value) {
        this.links = value;
    }

}
