package io.edar.moviecatalogmicroservices.resources;

import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.edar.moviecatalogmicroservices.models.CataLogItem;
import io.edar.moviecatalogmicroservices.models.Movie;
import io.edar.moviecatalogmicroservices.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CataLogItem> getCatalog(@PathVariable String userId){
	
		RestTemplate  restTemplate=new RestTemplate();
		
		
		 List<Rating> ratings= Arrays.asList(
	                new Rating("1234", 3),
	                new Rating("5678", 4)
	        );

		 //getting all rated movie Ids
		 
		return ratings.stream().map(rating -> {
				
		  Movie movie = restTemplate.getForObject("http://localhost:8091/movies/"+ rating.getMovieId(), Movie.class);
			return new CataLogItem(movie.getName(), "Desc", rating.getRating());
			 
		})
		 .collect(Collectors.toList());
	     

	}
}
