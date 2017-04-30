/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Customer  implements java.io.Serializable {
    private int address_id;

    private java.lang.String alternate_contactname;

    private java.lang.String billing_address;

    private java.lang.String buisness_name;

    private int cell_number;

    private java.lang.String company_name;

    private java.lang.String contact_name;

    private int customer_id;

    private java.lang.String customer_title;

    private java.lang.String customer_type;

    private java.util.Calendar date_entered;

    private java.lang.String email_address;

    private int fax_number;

    private int other_number;

    private int phone_no;

    public Customer() {
    }

    public Customer(
           int address_id,
           java.lang.String alternate_contactname,
           java.lang.String billing_address,
           java.lang.String buisness_name,
           int cell_number,
           java.lang.String company_name,
           java.lang.String contact_name,
           int customer_id,
           java.lang.String customer_title,
           java.lang.String customer_type,
           java.util.Calendar date_entered,
           java.lang.String email_address,
           int fax_number,
           int other_number,
           int phone_no) {
           this.address_id = address_id;
           this.alternate_contactname = alternate_contactname;
           this.billing_address = billing_address;
           this.buisness_name = buisness_name;
           this.cell_number = cell_number;
           this.company_name = company_name;
           this.contact_name = contact_name;
           this.customer_id = customer_id;
           this.customer_title = customer_title;
           this.customer_type = customer_type;
           this.date_entered = date_entered;
           this.email_address = email_address;
           this.fax_number = fax_number;
           this.other_number = other_number;
           this.phone_no = phone_no;
    }


    /**
     * Gets the address_id value for this Customer.
     * 
     * @return address_id
     */
    public int getAddress_id() {
        return address_id;
    }


    /**
     * Sets the address_id value for this Customer.
     * 
     * @param address_id
     */
    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }


    /**
     * Gets the alternate_contactname value for this Customer.
     * 
     * @return alternate_contactname
     */
    public java.lang.String getAlternate_contactname() {
        return alternate_contactname;
    }


    /**
     * Sets the alternate_contactname value for this Customer.
     * 
     * @param alternate_contactname
     */
    public void setAlternate_contactname(java.lang.String alternate_contactname) {
        this.alternate_contactname = alternate_contactname;
    }


    /**
     * Gets the billing_address value for this Customer.
     * 
     * @return billing_address
     */
    public java.lang.String getBilling_address() {
        return billing_address;
    }


    /**
     * Sets the billing_address value for this Customer.
     * 
     * @param billing_address
     */
    public void setBilling_address(java.lang.String billing_address) {
        this.billing_address = billing_address;
    }


    /**
     * Gets the buisness_name value for this Customer.
     * 
     * @return buisness_name
     */
    public java.lang.String getBuisness_name() {
        return buisness_name;
    }


    /**
     * Sets the buisness_name value for this Customer.
     * 
     * @param buisness_name
     */
    public void setBuisness_name(java.lang.String buisness_name) {
        this.buisness_name = buisness_name;
    }


    /**
     * Gets the cell_number value for this Customer.
     * 
     * @return cell_number
     */
    public int getCell_number() {
        return cell_number;
    }


    /**
     * Sets the cell_number value for this Customer.
     * 
     * @param cell_number
     */
    public void setCell_number(int cell_number) {
        this.cell_number = cell_number;
    }


    /**
     * Gets the company_name value for this Customer.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this Customer.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the contact_name value for this Customer.
     * 
     * @return contact_name
     */
    public java.lang.String getContact_name() {
        return contact_name;
    }


    /**
     * Sets the contact_name value for this Customer.
     * 
     * @param contact_name
     */
    public void setContact_name(java.lang.String contact_name) {
        this.contact_name = contact_name;
    }


    /**
     * Gets the customer_id value for this Customer.
     * 
     * @return customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this Customer.
     * 
     * @param customer_id
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the customer_title value for this Customer.
     * 
     * @return customer_title
     */
    public java.lang.String getCustomer_title() {
        return customer_title;
    }


    /**
     * Sets the customer_title value for this Customer.
     * 
     * @param customer_title
     */
    public void setCustomer_title(java.lang.String customer_title) {
        this.customer_title = customer_title;
    }


    /**
     * Gets the customer_type value for this Customer.
     * 
     * @return customer_type
     */
    public java.lang.String getCustomer_type() {
        return customer_type;
    }


    /**
     * Sets the customer_type value for this Customer.
     * 
     * @param customer_type
     */
    public void setCustomer_type(java.lang.String customer_type) {
        this.customer_type = customer_type;
    }


    /**
     * Gets the date_entered value for this Customer.
     * 
     * @return date_entered
     */
    public java.util.Calendar getDate_entered() {
        return date_entered;
    }


    /**
     * Sets the date_entered value for this Customer.
     * 
     * @param date_entered
     */
    public void setDate_entered(java.util.Calendar date_entered) {
        this.date_entered = date_entered;
    }


    /**
     * Gets the email_address value for this Customer.
     * 
     * @return email_address
     */
    public java.lang.String getEmail_address() {
        return email_address;
    }


    /**
     * Sets the email_address value for this Customer.
     * 
     * @param email_address
     */
    public void setEmail_address(java.lang.String email_address) {
        this.email_address = email_address;
    }


    /**
     * Gets the fax_number value for this Customer.
     * 
     * @return fax_number
     */
    public int getFax_number() {
        return fax_number;
    }


    /**
     * Sets the fax_number value for this Customer.
     * 
     * @param fax_number
     */
    public void setFax_number(int fax_number) {
        this.fax_number = fax_number;
    }


    /**
     * Gets the other_number value for this Customer.
     * 
     * @return other_number
     */
    public int getOther_number() {
        return other_number;
    }


    /**
     * Sets the other_number value for this Customer.
     * 
     * @param other_number
     */
    public void setOther_number(int other_number) {
        this.other_number = other_number;
    }


    /**
     * Gets the phone_no value for this Customer.
     * 
     * @return phone_no
     */
    public int getPhone_no() {
        return phone_no;
    }


    /**
     * Sets the phone_no value for this Customer.
     * 
     * @param phone_no
     */
    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.address_id == other.getAddress_id() &&
            ((this.alternate_contactname==null && other.getAlternate_contactname()==null) || 
             (this.alternate_contactname!=null &&
              this.alternate_contactname.equals(other.getAlternate_contactname()))) &&
            ((this.billing_address==null && other.getBilling_address()==null) || 
             (this.billing_address!=null &&
              this.billing_address.equals(other.getBilling_address()))) &&
            ((this.buisness_name==null && other.getBuisness_name()==null) || 
             (this.buisness_name!=null &&
              this.buisness_name.equals(other.getBuisness_name()))) &&
            this.cell_number == other.getCell_number() &&
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
            ((this.contact_name==null && other.getContact_name()==null) || 
             (this.contact_name!=null &&
              this.contact_name.equals(other.getContact_name()))) &&
            this.customer_id == other.getCustomer_id() &&
            ((this.customer_title==null && other.getCustomer_title()==null) || 
             (this.customer_title!=null &&
              this.customer_title.equals(other.getCustomer_title()))) &&
            ((this.customer_type==null && other.getCustomer_type()==null) || 
             (this.customer_type!=null &&
              this.customer_type.equals(other.getCustomer_type()))) &&
            ((this.date_entered==null && other.getDate_entered()==null) || 
             (this.date_entered!=null &&
              this.date_entered.equals(other.getDate_entered()))) &&
            ((this.email_address==null && other.getEmail_address()==null) || 
             (this.email_address!=null &&
              this.email_address.equals(other.getEmail_address()))) &&
            this.fax_number == other.getFax_number() &&
            this.other_number == other.getOther_number() &&
            this.phone_no == other.getPhone_no();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAddress_id();
        if (getAlternate_contactname() != null) {
            _hashCode += getAlternate_contactname().hashCode();
        }
        if (getBilling_address() != null) {
            _hashCode += getBilling_address().hashCode();
        }
        if (getBuisness_name() != null) {
            _hashCode += getBuisness_name().hashCode();
        }
        _hashCode += getCell_number();
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
        }
        if (getContact_name() != null) {
            _hashCode += getContact_name().hashCode();
        }
        _hashCode += getCustomer_id();
        if (getCustomer_title() != null) {
            _hashCode += getCustomer_title().hashCode();
        }
        if (getCustomer_type() != null) {
            _hashCode += getCustomer_type().hashCode();
        }
        if (getDate_entered() != null) {
            _hashCode += getDate_entered().hashCode();
        }
        if (getEmail_address() != null) {
            _hashCode += getEmail_address().hashCode();
        }
        _hashCode += getFax_number();
        _hashCode += getOther_number();
        _hashCode += getPhone_no();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws/", "customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternate_contactname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternate_contactname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buisness_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buisness_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cell_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cell_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_entered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_entered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "other_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
