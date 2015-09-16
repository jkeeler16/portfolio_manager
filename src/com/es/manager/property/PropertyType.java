//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 12:02:34 AM EDT 
//


package com.es.manager.property;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.es.manager.common.AddressType;
import com.es.manager.common.AgencyType;
import com.es.manager.common.LogType;
import com.es.manager.common.ShareLevelType;
import com.es.manager.property.design.GrossFloorAreaType;
import com.es.manager.property.design.PrimaryFunctionType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyType", propOrder = {

})
@XmlRootElement(name="property")
public class PropertyType {

    protected String name;
    @XmlSchemaType(name = "string")
    protected ConstructionStatusType constructionStatus;
    @XmlSchemaType(name = "string")
    protected PrimaryFunctionType primaryFunction;
    protected GrossFloorAreaType grossFloorArea;
    protected Integer yearBuilt;
    protected AddressType address;
    protected Integer numberOfBuildings;
    protected boolean isFederalProperty;
    protected String federalOwner;
    protected AgencyType agency;
    protected String agencyDepartmentRegion;
    protected String federalCampus;
    protected int occupancyPercentage;
    protected String notes;
    @XmlSchemaType(name = "string")
    protected ShareLevelType accessLevel;
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
     * Gets the value of the constructionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionStatusType }
     *     
     */
    public ConstructionStatusType getConstructionStatus() {
        return constructionStatus;
    }

    /**
     * Sets the value of the constructionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionStatusType }
     *     
     */
    public void setConstructionStatus(ConstructionStatusType value) {
        this.constructionStatus = value;
    }

    /**
     * Gets the value of the primaryFunction property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryFunctionType }
     *     
     */
    public PrimaryFunctionType getPrimaryFunction() {
        return primaryFunction;
    }

    /**
     * Sets the value of the primaryFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryFunctionType }
     *     
     */
    public void setPrimaryFunction(PrimaryFunctionType value) {
        this.primaryFunction = value;
    }

    /**
     * Gets the value of the grossFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link GrossFloorAreaType }
     *     
     */
    public GrossFloorAreaType getGrossFloorArea() {
        return grossFloorArea;
    }

    /**
     * Sets the value of the grossFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossFloorAreaType }
     *     
     */
    public void setGrossFloorArea(GrossFloorAreaType value) {
        this.grossFloorArea = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBuilt(Integer value) {
        this.yearBuilt = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the numberOfBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBuildings() {
        return numberOfBuildings;
    }

    /**
     * Sets the value of the numberOfBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBuildings(Integer value) {
        this.numberOfBuildings = value;
    }

    /**
     * Gets the value of the isFederalProperty property.
     * 
     */
    public boolean isIsFederalProperty() {
        return isFederalProperty;
    }

    /**
     * Sets the value of the isFederalProperty property.
     * 
     */
    public void setIsFederalProperty(boolean value) {
        this.isFederalProperty = value;
    }

    /**
     * Gets the value of the federalOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalOwner() {
        return federalOwner;
    }

    /**
     * Sets the value of the federalOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalOwner(String value) {
        this.federalOwner = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyType }
     *     
     */
    public AgencyType getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyType }
     *     
     */
    public void setAgency(AgencyType value) {
        this.agency = value;
    }

    /**
     * Gets the value of the agencyDepartmentRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyDepartmentRegion() {
        return agencyDepartmentRegion;
    }

    /**
     * Sets the value of the agencyDepartmentRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyDepartmentRegion(String value) {
        this.agencyDepartmentRegion = value;
    }

    /**
     * Gets the value of the federalCampus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalCampus() {
        return federalCampus;
    }

    /**
     * Sets the value of the federalCampus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalCampus(String value) {
        this.federalCampus = value;
    }

    /**
     * Gets the value of the occupancyPercentage property.
     * 
     */
    public int getOccupancyPercentage() {
        return occupancyPercentage;
    }

    /**
     * Sets the value of the occupancyPercentage property.
     * 
     */
    public void setOccupancyPercentage(int value) {
        this.occupancyPercentage = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
