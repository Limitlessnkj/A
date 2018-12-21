package hms.capg.bean;

import java.sql.Date;

public class BookingBean {
	String name;
	Date from;
	Date to;
	int numOfRooms;
	String contactNo;
	String paymentOptions;
	@Override
	public String toString() {
		return "BookingBean [name=" + name + ", from=" + from + ", to=" + to + ", numOfRooms=" + numOfRooms
				+ ", contactNo=" + contactNo + ", paymentOptions=" + paymentOptions + "]";
	}
	public BookingBean(String name, Date from, Date to, int numOfRooms, String contactNo, String paymentOptions) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
		this.numOfRooms = numOfRooms;
		this.contactNo = contactNo;
		this.paymentOptions = paymentOptions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(String paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	public BookingBean() {
		super();
	}
	
	
	
}

