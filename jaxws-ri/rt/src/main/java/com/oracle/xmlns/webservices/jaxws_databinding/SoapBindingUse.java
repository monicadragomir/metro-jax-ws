//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6-SNAPSHOT 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.21 at 10:57:01 AM CET 
//


package com.oracle.xmlns.webservices.jaxws_databinding;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soap-binding-use.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soap-binding-use">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LITERAL"/>
 *     &lt;enumeration value="ENCODED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "soap-binding-use")
@XmlEnum
public enum SoapBindingUse {

    LITERAL,
    ENCODED;

    public String value() {
        return name();
    }

    public static SoapBindingUse fromValue(String v) {
        return valueOf(v);
    }

}