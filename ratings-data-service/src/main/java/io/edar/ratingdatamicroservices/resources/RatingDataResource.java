package io.edar.ratingdatamicroservices.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.edar.ratingdatamicroservices.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
}
