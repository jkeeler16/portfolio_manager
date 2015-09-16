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
import com.es.manager.property.use.UseYesNoType;


/**
 * <p>Java class for wastewaterTreatmentPlantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wastewaterTreatmentPlantType"&gt;
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
 *                   &lt;element ref="{}averageInfluentBiologicalOxygenDemand" minOccurs="0"/&gt;
 *                   &lt;element ref="{}averageEffluentBiologicalOxygenDemand" minOccurs="0"/&gt;
 *                   &lt;element ref="{}plantDesignFlowRate"/&gt;
 *                   &lt;element ref="{}fixedFilmTrickleFiltrationProcess" minOccurs="0"/&gt;
 *                   &lt;element ref="{}nutrientRemoval" minOccurs="0"/&gt;
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
@XmlType(name = "wastewaterTreatmentPlantType", propOrder = {

})
public class WastewaterTreatmentPlantType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected WastewaterTreatmentPlantType.UseDetails useDetails;
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
     *     {@link WastewaterTreatmentPlantType.UseDetails }
     *     
     */
    public WastewaterTreatmentPlantType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WastewaterTreatmentPlantType.UseDetails }
     *     
     */
    public void setUseDetails(WastewaterTreatmentPlantType.UseDetails value) {
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
     *         &lt;element ref="{}averageInfluentBiologicalOxygenDemand" minOccurs="0"/&gt;
     *         &lt;element ref="{}averageEffluentBiologicalOxygenDemand" minOccurs="0"/&gt;
     *         &lt;element ref="{}plantDesignFlowRate"/&gt;
     *         &lt;element ref="{}fixedFilmTrickleFiltrationProcess" minOccurs="0"/&gt;
     *         &lt;element ref="{}nutrientRemoval" minOccurs="0"/&gt;
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
        protected UseDecimalType averageInfluentBiologicalOxygenDemand;
        protected UseDecimalType averageEffluentBiologicalOxygenDemand;
        @XmlElement(required = true)
        protected PlantDesignFlowRateType plantDesignFlowRate;
        protected UseYesNoType fixedFilmTrickleFiltrationProcess;
        protected UseYesNoType nutrientRemoval;

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
         * Gets the value of the averageInfluentBiologicalOxygenDemand property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getAverageInfluentBiologicalOxygenDemand() {
            return averageInfluentBiologicalOxygenDemand;
        }

        /**
         * Sets the value of the averageInfluentBiologicalOxygenDemand property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setAverageInfluentBiologicalOxygenDemand(UseDecimalType value) {
            this.averageInfluentBiologicalOxygenDemand = value;
        }

        /**
         * Gets the value of the averageEffluentBiologicalOxygenDemand property.
         * 
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *     
         */
        public UseDecimalType getAverageEffluentBiologicalOxygenDemand() {
            return averageEffluentBiologicalOxygenDemand;
        }

        /**
         * Sets the value of the averageEffluentBiologicalOxygenDemand property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setAverageEffluentBiologicalOxygenDemand(UseDecimalType value) {
            this.averageEffluentBiologicalOxygenDemand = value;
        }

        /**
         * Gets the value of the plantDesignFlowRate property.
         * 
         * @return
         *     possible object is
         *     {@link PlantDesignFlowRateType }
         *     
         */
        public PlantDesignFlowRateType getPlantDesignFlowRate() {
            return plantDesignFlowRate;
        }

        /**
         * Sets the value of the plantDesignFlowRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlantDesignFlowRateType }
         *     
         */
        public void setPlantDesignFlowRate(PlantDesignFlowRateType value) {
            this.plantDesignFlowRate = value;
        }

        /**
         * Gets the value of the fixedFilmTrickleFiltrationProcess property.
         * 
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *     
         */
        public UseYesNoType getFixedFilmTrickleFiltrationProcess() {
            return fixedFilmTrickleFiltrationProcess;
        }

        /**
         * Sets the value of the fixedFilmTrickleFiltrationProcess property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *     
         */
        public void setFixedFilmTrickleFiltrationProcess(UseYesNoType value) {
            this.fixedFilmTrickleFiltrationProcess = value;
        }

        /**
         * Gets the value of the nutrientRemoval property.
         * 
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *     
         */
        public UseYesNoType getNutrientRemoval() {
            return nutrientRemoval;
        }

        /**
         * Sets the value of the nutrientRemoval property.
         * 
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *     
         */
        public void setNutrientRemoval(UseYesNoType value) {
            this.nutrientRemoval = value;
        }

    }

}