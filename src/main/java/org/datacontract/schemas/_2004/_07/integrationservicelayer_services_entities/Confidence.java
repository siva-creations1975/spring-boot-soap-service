//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.13 at 04:26:38 PM BST 
//


package org.datacontract.schemas._2004._07.integrationservicelayer_services_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Confidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Confidence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Confidence", propOrder = {
    "marker",
    "lower",
    "upper"
})
public class Confidence {

    @XmlElement(required = true)
    protected String marker;
    protected int lower;
    protected int upper;

    /**
     * Gets the value of the marker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarker() {
        return marker;
    }

    /**
     * Sets the value of the marker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarker(String value) {
        this.marker = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     */
    public int getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     */
    public void setLower(int value) {
        this.lower = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     */
    public int getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     */
    public void setUpper(int value) {
        this.upper = value;
    }

}
