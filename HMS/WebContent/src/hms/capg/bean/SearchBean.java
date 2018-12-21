package hms.capg.bean;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class SearchBean {
	@NotNull
    @Size(min=1,max=20)
    private String city;

public SearchBean(String city) {
	super();
	this.city = city;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "SearchHotelBean [city=" + city + "]";
}

}
