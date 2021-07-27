package io.edar.moviecatalogmicroservices.models;

public class Movie {

	private String name;
	private String movieId;
	
	
	
	public Movie() {
		//super();
	}

	public Movie(String name, String movieId) {
		super();
		this.name = name;
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	
	
}
