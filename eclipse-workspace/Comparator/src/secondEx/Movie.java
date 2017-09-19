package secondEx;

import java.util.Comparator;

public class Movie {
String name;
double rating;
int year;
public Movie(String name, double rating, int year) {
	super();
	this.name = name;
	this.rating = rating;
	this.year = year;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

public static Comparator<Movie> ratingCompare=new Comparator<Movie>()
{
	public int compare(Movie m1, Movie m2)
	{
		return  (int) (m1.getRating()-m2.getRating());
	}
};

public static Comparator<Movie> yearCompare= new Comparator<Movie>()
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getYear()-m2.getYear();
		
	}
};

}
