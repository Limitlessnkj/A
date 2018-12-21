package hms.capg.bean;

public class HotelBean {
	
    private String name;
	private String member;
	private int price;
	private int rooms;
	private String transport;
	private double rating;
	public HotelBean(String name, String member, int price, int rooms, double rating,String transport) {
		super();
		this.name = name;
		this.member = member;
		this.price = price;
		this.rooms = rooms;
		this.transport = transport;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "HotelBean [name=" + name + ", member=" + member + ", price=" + price + ", rooms=" + rooms
				+ ", transport=" + transport + ", rating=" + rating + "]";
	}
	
}