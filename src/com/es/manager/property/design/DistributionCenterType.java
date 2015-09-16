//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 12:35:27 AM EDT 
//


package com.es.manager.property.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.es.manager.common.LogType;
import com.es.manager.property.use.UseDecimalType;


/**
 * <p>Java class for distributionCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distributionCenterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{}propertyUseNameType"/&gt;
 *         &lt;element name="useDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element ref="{}totalGrossFloorArea"/&gt;
 *                   &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/&gt;
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/&gt;
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "distributionCenterType", propOrder = {

})
public class DistributionCenterType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected DistributionCenterType.UseDetails useDetails;
    protected LogType audit;

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
     * Gets the value of the useDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionCenterType.UseDetails }
     *     
     */
    public DistributionCenterType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionCenterType.UseDetails }
     *     
     */
    public void setUseDetails(DistributionCenterType.UseDetails value) {
        this.useDetails = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element ref="{}totalGrossFloorArea"/&gt;
     *         &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/&gt;
     *         &lt;element ref="{}percentHeated" minOccurs="0"/&gt;
     *         &lt;element ref="{}percentCooled" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class UseDetails {

        @XmlElement(required = true)
        protected GrossFloorAreaType totalGrossFloorArea;
        protected UseDecimalType weeklyOperatingHours;
        protected UseDecimalType numberOfWorkers;
        protected UseDecimalType numberOfWalkInRefrigerationUnits;
        protected PercentHeatedType percentHeated;
        protected PercentCooledType percentCooled;

        /**
         * Gets the value of the totalGrossFloorArea property.
         * 
         * @return
         *     possible object is
         *     {@link GrossFloorAreaType }
         *     
         */
        public GrossFloorAreaType getTotalGrossFloorArea() {
            return totalGrossFloorArea;
        }

        /**
         * Sets the value of the totalGrossFloorArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrossFloorAreaType }
         *     
         */
        public void setTotalGrossFloorArea(GrossFloorAreaType value) {
            this.totalGrossFloorArea = value;
        }

        /**
         * Gets the value of the weeklyOperatingHours property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getWeeklyOperatingHours() {
            return weeklyOperatingHours;
        }

        /**
         * Sets the value of the weeklyOperatingHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setWeeklyOperatingHours(UseDecimalType value) {
            this.weeklyOperatingHours = value;
        }

        /**
         * Gets the value of the numberOfWorkers property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfWorkers() {
            return numberOfWorkers;
        }

        /**
         * Sets the value of the numberOfWorkers property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfWorkers(UseDecimalType value) {
            this.numberOfWorkers = value;
        }

        /**
         * Gets the value of the numberOfWalkInRefrigerationUnits property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfWalkInRefrigerationUnits() {
            return numberOfWalkInRefrigerationUnits;
        }

        /**
         * Sets the value of the numberOfWalkInRefrigerationUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfWalkInRefrigerationUnits(UseDecimalType value) {
            this.numberOfWalkInRefrigerationUnits = value;
        }

        /**
         * Gets the value of the percentHeated property.
         * 
         * @return
         *     possible object is
         *     {@link PercentHeatedType }
         *     
         */
        public PercentHeatedType getPercentHeated() {
            return percentHeated;
        }

        /**
         * Sets the value of the percentHeated property.
         * 
         * @param value
         *     allowed object is
         *     {@link PercentHeatedType }
         *     
         */
        public void setPercentHeated(PercentHeatedType value) {
            this.percentHeated = value;
        }

        /**
         * Gets the value of the percentCooled property.
         * 
         * @return
         *     possible object is
         *     {@link PercentCooledType }
         *     
         */
        public PercentCooledType getPercentCooled() {
            return percentCooled;
        }

        /**
         * Sets the value of the percentCooled property.
         * 
         * @param value
         *     allowed object is
         *     {@link PercentCooledType }
         *     
         */
        public void setPercentCooled(PercentCooledType value) {
            this.percentCooled = value;
        }

    }

}
