package secondEx;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList<Movie> listofMovies= new ArrayList<Movie>();
		listofMovies.add(new Movie("Inferno",10.0, 2018));
		listofMovies.add(new Movie("WonderWoman", 7.0, 2017));
		listofMovies.add(new Movie("IT", 8.0, 2016));
		
		Collections.sort(listofMovies, Movie.ratingCompare);
		System.out.println("sorting according to rating :\n");
		for(Movie m: listofMovies)
		{
			System.out.println(m.getName()+ " : "+ m.getYear()+ " : "+ m.getRating());
		}
		
		Collections.sort(listofMovies, Movie.yearCompare);
		System.out.println("sorting according to year :\n");
		for(Movie m:listofMovies )
		{
			System.out.println(m.getName()+ " : " + m.getRating()+ " : "+ m.getYear());
		}
	}

}
