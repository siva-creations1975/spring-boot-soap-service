//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.13 at 04:26:38 PM BST 
//


package org.datacontract.schemas._2004._07.integrationservicelayer_services_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mileage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mileage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mileage", propOrder = {
    "mileage",
    "estimate"
})
public class Mileage {

    protected int mileage;
    protected boolean estimate;

    /**
     * Gets the value of the mileage property.
     * 
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     */
    public void setMileage(int value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the estimate property.
     * 
     */
    public boolean isEstimate() {
        return estimate;
    }

    /**
     * Sets the value of the estimate property.
     * 
     */
    public void setEstimate(boolean value) {
        this.estimate = value;
    }

}