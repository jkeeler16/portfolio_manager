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
import com.es.manager.property.use.UseIntegerType;
import com.es.manager.property.use.UseYesNoType;


/**
 * <p>Java class for multifamilyHousingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multifamilyHousingType"&gt;
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
 *                   &lt;element ref="{}numberOfResidentialLivingUnits" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfBedrooms" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsMidRiseSetting" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfLaundryHookupsInAllUnits" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfLaundryHookupsInCommonArea" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsLowRiseSetting" minOccurs="0"/&gt;
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/&gt;
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/&gt;
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsHighRiseSetting" minOccurs="0"/&gt;
 *                   &lt;element ref="{}residentPopulation" minOccurs="0"/&gt;
 *                   &lt;element ref="{}governmentSubsidizedHousing" minOccurs="0"/&gt;
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
@XmlType(name = "multifamilyHousingType", propOrder = {

})
public class MultifamilyHousingType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected MultifamilyHousingType.UseDetails useDetails;
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
     *     {@link MultifamilyHousingType.UseDetails }
     *     
     */
    public MultifamilyHousingType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultifamilyHousingType.UseDetails }
     *     
     */
    public void setUseDetails(MultifamilyHousingType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfResidentialLivingUnits" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfBedrooms" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfResidentialLivingUnitsMidRiseSetting" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfLaundryHookupsInAllUnits" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfLaundryHookupsInCommonArea" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfResidentialLivingUnitsLowRiseSetting" minOccurs="0"/&gt;
     *         &lt;element ref="{}percentHeated" minOccurs="0"/&gt;
     *         &lt;element ref="{}percentCooled" minOccurs="0"/&gt;
     *         &lt;element ref="{}numberOfResidentialLivingUnitsHighRiseSetting" minOccurs="0"/&gt;
     *         &lt;element ref="{}residentPopulation" minOccurs="0"/&gt;
     *         &lt;element ref="{}governmentSubsidizedHousing" minOccurs="0"/&gt;
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
        protected UseDecimalType numberOfResidentialLivingUnits;
        protected UseDecimalType numberOfBedrooms;
        protected UseDecimalType numberOfResidentialLivingUnitsMidRiseSetting;
        protected UseIntegerType numberOfLaundryHookupsInAllUnits;
        protected UseIntegerType numberOfLaundryHookupsInCommonArea;
        protected UseDecimalType numberOfResidentialLivingUnitsLowRiseSetting;
        protected PercentHeatedType percentHeated;
        protected PercentCooledType percentCooled;
        protected UseDecimalType numberOfResidentialLivingUnitsHighRiseSetting;
        protected ResidentPopulationType residentPopulation;
        protected UseYesNoType governmentSubsidizedHousing;

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
         * Gets the value of the numberOfResidentialLivingUnits property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfResidentialLivingUnits() {
            return numberOfResidentialLivingUnits;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfResidentialLivingUnits(UseDecimalType value) {
            this.numberOfResidentialLivingUnits = value;
        }

        /**
         * Gets the value of the numberOfBedrooms property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfBedrooms() {
            return numberOfBedrooms;
        }

        /**
         * Sets the value of the numberOfBedrooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfBedrooms(UseDecimalType value) {
            this.numberOfBedrooms = value;
        }

        /**
         * Gets the value of the numberOfResidentialLivingUnitsMidRiseSetting property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsMidRiseSetting() {
            return numberOfResidentialLivingUnitsMidRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsMidRiseSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfResidentialLivingUnitsMidRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsMidRiseSetting = value;
        }

        /**
         * Gets the value of the numberOfLaundryHookupsInAllUnits property.
         * 
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *     
         */
        public UseIntegerType getNumberOfLaundryHookupsInAllUnits() {
            return numberOfLaundryHookupsInAllUnits;
        }

        /**
         * Sets the value of the numberOfLaundryHookupsInAllUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *     
         */
        public void setNumberOfLaundryHookupsInAllUnits(UseIntegerType value) {
            this.numberOfLaundryHookupsInAllUnits = value;
        }

        /**
         * Gets the value of the numberOfLaundryHookupsInCommonArea property.
         * 
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *     
         */
        public UseIntegerType getNumberOfLaundryHookupsInCommonArea() {
            return numberOfLaundryHookupsInCommonArea;
        }

        /**
         * Sets the value of the numberOfLaundryHookupsInCommonArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *     
         */
        public void setNumberOfLaundryHookupsInCommonArea(UseIntegerType value) {
            this.numberOfLaundryHookupsInCommonArea = value;
        }

        /**
         * Gets the value of the numberOfResidentialLivingUnitsLowRiseSetting property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsLowRiseSetting() {
            return numberOfResidentialLivingUnitsLowRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsLowRiseSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfResidentialLivingUnitsLowRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsLowRiseSetting = value;
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

        /**
         * Gets the value of the numberOfResidentialLivingUnitsHighRiseSetting property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsHighRiseSetting() {
            return numberOfResidentialLivingUnitsHighRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsHighRiseSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfResidentialLivingUnitsHighRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsHighRiseSetting = value;
        }

        /**
         * Gets the value of the residentPopulation property.
         * 
         * @return
         *     possible object is
         *     {@link ResidentPopulationType }
         *     
         */
        public ResidentPopulationType getResidentPopulation() {
            return residentPopulation;
        }

        /**
         * Sets the value of the residentPopulation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentPopulationType }
         *     
         */
        public void setResidentPopulation(ResidentPopulationType value) {
            this.residentPopulation = value;
        }

        /**
         * Gets the value of the governmentSubsidizedHousing property.
         * 
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *     
         */
        public UseYesNoType getGovernmentSubsidizedHousing() {
            return governmentSubsidizedHousing;
        }

        /**
         * Sets the value of the governmentSubsidizedHousing property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *     
         */
        public void setGovernmentSubsidizedHousing(UseYesNoType value) {
            this.governmentSubsidizedHousing = value;
        }

    }

}
