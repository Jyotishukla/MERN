package model;

import java.util.Date;

public class Payment {
	
private int payment_id;
private int order_id;
private int payment_method_id;
private double payment_amount;
private Date payment_date;
private String check_number;
private String credit_card;
private int credit_card_number;
private String card_holder_name;
private Date creditcard_exp_date;
private String creditcard_auth_num;
public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getPayment_method_id() {
	return payment_method_id;
}
public void setPayment_method_id(int payment_method_id) {
	this.payment_method_id = payment_method_id;
}
public double getPayment_amount() {
	return payment_amount;
}
public void setPayment_amount(double payment_amount) {
	this.payment_amount = payment_amount;
}
public Date getPayment_date() {
	return payment_date;
}
public void setPayment_date(Date payment_date) {
	this.payment_date = payment_date;
}
public String getCheck_number() {
	return check_number;
}
public void setCheck_number(String check_number) {
	this.check_number = check_number;
}
public String getCredit_card() {
	return credit_card;
}
public void setCredit_card(String credit_card) {
	this.credit_card = credit_card;
}
public int getCredit_card_number() {
	return credit_card_number;
}
public void setCredit_card_number(int credit_card_number) {
	this.credit_card_number = credit_card_number;
}
public String getCard_holder_name() {
	return card_holder_name;
}
public void setCard_holder_name(String card_holder_name) {
	this.card_holder_name = card_holder_name;
}
public Date getCreditcard_exp_date() {
	return creditcard_exp_date;
}
public void setCreditcard_exp_date(Date creditcard_exp_date) {
	this.creditcard_exp_date = creditcard_exp_date;
}
public String getCreditcard_auth_num() {
	return creditcard_auth_num;
}
public void setCreditcard_auth_num(String creaditcard_auth_num) {
	this.creditcard_auth_num = creditcard_auth_num;
}

}

