//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 12:35:27 AM EDT 
//


package com.es.manager.property.design;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primaryFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="primaryFunctionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Adult Education"/&gt;
 *     &lt;enumeration value="Ambulatory Surgical Center"/&gt;
 *     &lt;enumeration value="Aquarium"/&gt;
 *     &lt;enumeration value="Automobile Dealership"/&gt;
 *     &lt;enumeration value="Bank Branch"/&gt;
 *     &lt;enumeration value="Bar/Nightclub"/&gt;
 *     &lt;enumeration value="Barracks"/&gt;
 *     &lt;enumeration value="Bowling Alley"/&gt;
 *     &lt;enumeration value="Casino"/&gt;
 *     &lt;enumeration value="College/University"/&gt;
 *     &lt;enumeration value="Convenience Store with Gas Station"/&gt;
 *     &lt;enumeration value="Convenience Store without Gas Station"/&gt;
 *     &lt;enumeration value="Convention Center"/&gt;
 *     &lt;enumeration value="Courthouse"/&gt;
 *     &lt;enumeration value="Data Center"/&gt;
 *     &lt;enumeration value="Distribution Center"/&gt;
 *     &lt;enumeration value="Drinking Water Treatment &amp; Distribution"/&gt;
 *     &lt;enumeration value="Enclosed Mall"/&gt;
 *     &lt;enumeration value="Energy/Power Station"/&gt;
 *     &lt;enumeration value="Fast Food Restaurant"/&gt;
 *     &lt;enumeration value="Financial Office"/&gt;
 *     &lt;enumeration value="Fire Station"/&gt;
 *     &lt;enumeration value="Fitness Center/Health Club/Gym"/&gt;
 *     &lt;enumeration value="Food Sales"/&gt;
 *     &lt;enumeration value="Food Service"/&gt;
 *     &lt;enumeration value="Hospital (General Medical &amp; Surgical)"/&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="Ice/Curling Rink"/&gt;
 *     &lt;enumeration value="Indoor Arena"/&gt;
 *     &lt;enumeration value="K-12 School"/&gt;
 *     &lt;enumeration value="Laboratory"/&gt;
 *     &lt;enumeration value="Library"/&gt;
 *     &lt;enumeration value="Lifestyle Center"/&gt;
 *     &lt;enumeration value="Mailing Center/Post Office"/&gt;
 *     &lt;enumeration value="Manufacturing/Industrial Plant"/&gt;
 *     &lt;enumeration value="Medical Office"/&gt;
 *     &lt;enumeration value="Mixed Use Property"/&gt;
 *     &lt;enumeration value="Movie Theater"/&gt;
 *     &lt;enumeration value="Multifamily Housing"/&gt;
 *     &lt;enumeration value="Museum"/&gt;
 *     &lt;enumeration value="Non-Refrigerated Warehouse"/&gt;
 *     &lt;enumeration value="Office"/&gt;
 *     &lt;enumeration value="Other - Education"/&gt;
 *     &lt;enumeration value="Other - Entertainment/Public Assembly"/&gt;
 *     &lt;enumeration value="Other - Lodging/Residential"/&gt;
 *     &lt;enumeration value="Other - Mall"/&gt;
 *     &lt;enumeration value="Other - Public Services"/&gt;
 *     &lt;enumeration value="Other - Recreation"/&gt;
 *     &lt;enumeration value="Other - Restaurant/Bar"/&gt;
 *     &lt;enumeration value="Other - Services"/&gt;
 *     &lt;enumeration value="Other - Stadium"/&gt;
 *     &lt;enumeration value="Other - Technology/Science"/&gt;
 *     &lt;enumeration value="Other - Utility"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Other/Specialty Hospital"/&gt;
 *     &lt;enumeration value="Outpatient Rehabilitation/Physical Therapy"/&gt;
 *     &lt;enumeration value="Parking"/&gt;
 *     &lt;enumeration value="Performing Arts"/&gt;
 *     &lt;enumeration value="Personal Services (Health/Beauty, Dry Cleaning, etc)"/&gt;
 *     &lt;enumeration value="Police Station"/&gt;
 *     &lt;enumeration value="Pre-school/Daycare"/&gt;
 *     &lt;enumeration value="Prison/Incarceration"/&gt;
 *     &lt;enumeration value="Race Track"/&gt;
 *     &lt;enumeration value="Refrigerated Warehouse"/&gt;
 *     &lt;enumeration value="Repair Services (Vehicle, Shoe, Locksmith, etc)"/&gt;
 *     &lt;enumeration value="Residence Hall/Dormitory"/&gt;
 *     &lt;enumeration value="Restaurant"/&gt;
 *     &lt;enumeration value="Retail Store"/&gt;
 *     &lt;enumeration value="Roller Rink"/&gt;
 *     &lt;enumeration value="Self-Storage Facility"/&gt;
 *     &lt;enumeration value="Senior Care Community"/&gt;
 *     &lt;enumeration value="Single Family Home"/&gt;
 *     &lt;enumeration value="Social/Meeting Hall"/&gt;
 *     &lt;enumeration value="Stadium (Closed)"/&gt;
 *     &lt;enumeration value="Stadium (Open)"/&gt;
 *     &lt;enumeration value="Strip Mall"/&gt;
 *     &lt;enumeration value="Supermarket/Grocery Store"/&gt;
 *     &lt;enumeration value="Swimming Pool"/&gt;
 *     &lt;enumeration value="Transportation Terminal/Station"/&gt;
 *     &lt;enumeration value="Urgent Care/Clinic/Other Outpatient"/&gt;
 *     &lt;enumeration value="Veterinary Office"/&gt;
 *     &lt;enumeration value="Vocational School"/&gt;
 *     &lt;enumeration value="Wastewater Treatment Plant"/&gt;
 *     &lt;enumeration value="Wholesale Club/Supercenter"/&gt;
 *     &lt;enumeration value="Worship Facility"/&gt;
 *     &lt;enumeration value="Zoo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "primaryFunctionType")
@XmlEnum
public enum PrimaryFunctionType {

    @XmlEnumValue("Adult Education")
    ADULT_EDUCATION("Adult Education"),
    @XmlEnumValue("Ambulatory Surgical Center")
    AMBULATORY_SURGICAL_CENTER("Ambulatory Surgical Center"),
    @XmlEnumValue("Aquarium")
    AQUARIUM("Aquarium"),
    @XmlEnumValue("Automobile Dealership")
    AUTOMOBILE_DEALERSHIP("Automobile Dealership"),
    @XmlEnumValue("Bank Branch")
    BANK_BRANCH("Bank Branch"),
    @XmlEnumValue("Bar/Nightclub")
    BAR_NIGHTCLUB("Bar/Nightclub"),
    @XmlEnumValue("Barracks")
    BARRACKS("Barracks"),
    @XmlEnumValue("Bowling Alley")
    BOWLING_ALLEY("Bowling Alley"),
    @XmlEnumValue("Casino")
    CASINO("Casino"),
    @XmlEnumValue("College/University")
    COLLEGE_UNIVERSITY("College/University"),
    @XmlEnumValue("Convenience Store with Gas Station")
    CONVENIENCE_STORE_WITH_GAS_STATION("Convenience Store with Gas Station"),
    @XmlEnumValue("Convenience Store without Gas Station")
    CONVENIENCE_STORE_WITHOUT_GAS_STATION("Convenience Store without Gas Station"),
    @XmlEnumValue("Convention Center")
    CONVENTION_CENTER("Convention Center"),
    @XmlEnumValue("Courthouse")
    COURTHOUSE("Courthouse"),
    @XmlEnumValue("Data Center")
    DATA_CENTER("Data Center"),
    @XmlEnumValue("Distribution Center")
    DISTRIBUTION_CENTER("Distribution Center"),
    @XmlEnumValue("Drinking Water Treatment & Distribution")
    DRINKING_WATER_TREATMENT_DISTRIBUTION("Drinking Water Treatment & Distribution"),
    @XmlEnumValue("Enclosed Mall")
    ENCLOSED_MALL("Enclosed Mall"),
    @XmlEnumValue("Energy/Power Station")
    ENERGY_POWER_STATION("Energy/Power Station"),
    @XmlEnumValue("Fast Food Restaurant")
    FAST_FOOD_RESTAURANT("Fast Food Restaurant"),
    @XmlEnumValue("Financial Office")
    FINANCIAL_OFFICE("Financial Office"),
    @XmlEnumValue("Fire Station")
    FIRE_STATION("Fire Station"),
    @XmlEnumValue("Fitness Center/Health Club/Gym")
    FITNESS_CENTER_HEALTH_CLUB_GYM("Fitness Center/Health Club/Gym"),
    @XmlEnumValue("Food Sales")
    FOOD_SALES("Food Sales"),
    @XmlEnumValue("Food Service")
    FOOD_SERVICE("Food Service"),
    @XmlEnumValue("Hospital (General Medical & Surgical)")
    HOSPITAL_GENERAL_MEDICAL_SURGICAL("Hospital (General Medical & Surgical)"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Ice/Curling Rink")
    ICE_CURLING_RINK("Ice/Curling Rink"),
    @XmlEnumValue("Indoor Arena")
    INDOOR_ARENA("Indoor Arena"),
    @XmlEnumValue("K-12 School")
    K_12_SCHOOL("K-12 School"),
    @XmlEnumValue("Laboratory")
    LABORATORY("Laboratory"),
    @XmlEnumValue("Library")
    LIBRARY("Library"),
    @XmlEnumValue("Lifestyle Center")
    LIFESTYLE_CENTER("Lifestyle Center"),
    @XmlEnumValue("Mailing Center/Post Office")
    MAILING_CENTER_POST_OFFICE("Mailing Center/Post Office"),
    @XmlEnumValue("Manufacturing/Industrial Plant")
    MANUFACTURING_INDUSTRIAL_PLANT("Manufacturing/Industrial Plant"),
    @XmlEnumValue("Medical Office")
    MEDICAL_OFFICE("Medical Office"),
    @XmlEnumValue("Mixed Use Property")
    MIXED_USE_PROPERTY("Mixed Use Property"),
    @XmlEnumValue("Movie Theater")
    MOVIE_THEATER("Movie Theater"),
    @XmlEnumValue("Multifamily Housing")
    MULTIFAMILY_HOUSING("Multifamily Housing"),
    @XmlEnumValue("Museum")
    MUSEUM("Museum"),
    @XmlEnumValue("Non-Refrigerated Warehouse")
    NON_REFRIGERATED_WAREHOUSE("Non-Refrigerated Warehouse"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Other - Education")
    OTHER_EDUCATION("Other - Education"),
    @XmlEnumValue("Other - Entertainment/Public Assembly")
    OTHER_ENTERTAINMENT_PUBLIC_ASSEMBLY("Other - Entertainment/Public Assembly"),
    @XmlEnumValue("Other - Lodging/Residential")
    OTHER_LODGING_RESIDENTIAL("Other - Lodging/Residential"),
    @XmlEnumValue("Other - Mall")
    OTHER_MALL("Other - Mall"),
    @XmlEnumValue("Other - Public Services")
    OTHER_PUBLIC_SERVICES("Other - Public Services"),
    @XmlEnumValue("Other - Recreation")
    OTHER_RECREATION("Other - Recreation"),
    @XmlEnumValue("Other - Restaurant/Bar")
    OTHER_RESTAURANT_BAR("Other - Restaurant/Bar"),
    @XmlEnumValue("Other - Services")
    OTHER_SERVICES("Other - Services"),
    @XmlEnumValue("Other - Stadium")
    OTHER_STADIUM("Other - Stadium"),
    @XmlEnumValue("Other - Technology/Science")
    OTHER_TECHNOLOGY_SCIENCE("Other - Technology/Science"),
    @XmlEnumValue("Other - Utility")
    OTHER_UTILITY("Other - Utility"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Other/Specialty Hospital")
    OTHER_SPECIALTY_HOSPITAL("Other/Specialty Hospital"),
    @XmlEnumValue("Outpatient Rehabilitation/Physical Therapy")
    OUTPATIENT_REHABILITATION_PHYSICAL_THERAPY("Outpatient Rehabilitation/Physical Therapy"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("Performing Arts")
    PERFORMING_ARTS("Performing Arts"),
    @XmlEnumValue("Personal Services (Health/Beauty, Dry Cleaning, etc)")
    PERSONAL_SERVICES_HEALTH_BEAUTY_DRY_CLEANING_ETC("Personal Services (Health/Beauty, Dry Cleaning, etc)"),
    @XmlEnumValue("Police Station")
    POLICE_STATION("Police Station"),
    @XmlEnumValue("Pre-school/Daycare")
    PRE_SCHOOL_DAYCARE("Pre-school/Daycare"),
    @XmlEnumValue("Prison/Incarceration")
    PRISON_INCARCERATION("Prison/Incarceration"),
    @XmlEnumValue("Race Track")
    RACE_TRACK("Race Track"),
    @XmlEnumValue("Refrigerated Warehouse")
    REFRIGERATED_WAREHOUSE("Refrigerated Warehouse"),
    @XmlEnumValue("Repair Services (Vehicle, Shoe, Locksmith, etc)")
    REPAIR_SERVICES_VEHICLE_SHOE_LOCKSMITH_ETC("Repair Services (Vehicle, Shoe, Locksmith, etc)"),
    @XmlEnumValue("Residence Hall/Dormitory")
    RESIDENCE_HALL_DORMITORY("Residence Hall/Dormitory"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Retail Store")
    RETAIL_STORE("Retail Store"),
    @XmlEnumValue("Roller Rink")
    ROLLER_RINK("Roller Rink"),
    @XmlEnumValue("Self-Storage Facility")
    SELF_STORAGE_FACILITY("Self-Storage Facility"),
    @XmlEnumValue("Senior Care Community")
    SENIOR_CARE_COMMUNITY("Senior Care Community"),
    @XmlEnumValue("Single Family Home")
    SINGLE_FAMILY_HOME("Single Family Home"),
    @XmlEnumValue("Social/Meeting Hall")
    SOCIAL_MEETING_HALL("Social/Meeting Hall"),
    @XmlEnumValue("Stadium (Closed)")
    STADIUM_CLOSED("Stadium (Closed)"),
    @XmlEnumValue("Stadium (Open)")
    STADIUM_OPEN("Stadium (Open)"),
    @XmlEnumValue("Strip Mall")
    STRIP_MALL("Strip Mall"),
    @XmlEnumValue("Supermarket/Grocery Store")
    SUPERMARKET_GROCERY_STORE("Supermarket/Grocery Store"),
    @XmlEnumValue("Swimming Pool")
    SWIMMING_POOL("Swimming Pool"),
    @XmlEnumValue("Transportation Terminal/Station")
    TRANSPORTATION_TERMINAL_STATION("Transportation Terminal/Station"),
    @XmlEnumValue("Urgent Care/Clinic/Other Outpatient")
    URGENT_CARE_CLINIC_OTHER_OUTPATIENT("Urgent Care/Clinic/Other Outpatient"),
    @XmlEnumValue("Veterinary Office")
    VETERINARY_OFFICE("Veterinary Office"),
    @XmlEnumValue("Vocational School")
    VOCATIONAL_SCHOOL("Vocational School"),
    @XmlEnumValue("Wastewater Treatment Plant")
    WASTEWATER_TREATMENT_PLANT("Wastewater Treatment Plant"),
    @XmlEnumValue("Wholesale Club/Supercenter")
    WHOLESALE_CLUB_SUPERCENTER("Wholesale Club/Supercenter"),
    @XmlEnumValue("Worship Facility")
    WORSHIP_FACILITY("Worship Facility"),
    @XmlEnumValue("Zoo")
    ZOO("Zoo");
    private final String value;

    PrimaryFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimaryFunctionType fromValue(String v) {
        for (PrimaryFunctionType c: PrimaryFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
