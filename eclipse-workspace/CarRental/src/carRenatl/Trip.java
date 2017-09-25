package carRenatl;

public class Trip {
String fromCity;
String toCity;

public String getFromCity() {
	return fromCity;
}
public void setFromCity(String fromCity) {
	this.fromCity = fromCity;
}
public String getToCity() {
	return toCity;
}
public void setToCity(String toCity) {
	this.toCity = toCity;
}
public Trip(String fromCity, String toCity) {
	super();
	this.fromCity = fromCity;
	this.toCity = toCity;
}

}
