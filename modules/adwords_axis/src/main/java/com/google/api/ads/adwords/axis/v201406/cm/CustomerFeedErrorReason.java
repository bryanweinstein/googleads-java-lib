/**
 * CustomerFeedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public class CustomerFeedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerFeedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = "FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _INVALID_ID = "INVALID_ID";
    public static final java.lang.String _CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED = "CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED";
    public static final java.lang.String _CANNOT_MODIFY_REMOVED_CUSTOMER_FEED = "CANNOT_MODIFY_REMOVED_CUSTOMER_FEED";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPES = "INVALID_PLACEHOLDER_TYPES";
    public static final java.lang.String _MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = "MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED = "PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CustomerFeedErrorReason FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE = new CustomerFeedErrorReason(_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE);
    public static final CustomerFeedErrorReason INVALID_ID = new CustomerFeedErrorReason(_INVALID_ID);
    public static final CustomerFeedErrorReason CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED = new CustomerFeedErrorReason(_CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED);
    public static final CustomerFeedErrorReason CANNOT_MODIFY_REMOVED_CUSTOMER_FEED = new CustomerFeedErrorReason(_CANNOT_MODIFY_REMOVED_CUSTOMER_FEED);
    public static final CustomerFeedErrorReason INVALID_PLACEHOLDER_TYPES = new CustomerFeedErrorReason(_INVALID_PLACEHOLDER_TYPES);
    public static final CustomerFeedErrorReason MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE = new CustomerFeedErrorReason(_MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE);
    public static final CustomerFeedErrorReason PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED = new CustomerFeedErrorReason(_PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED);
    public static final CustomerFeedErrorReason UNKNOWN = new CustomerFeedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CustomerFeedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerFeedErrorReason enumeration = (CustomerFeedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerFeedErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerFeedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "CustomerFeedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
