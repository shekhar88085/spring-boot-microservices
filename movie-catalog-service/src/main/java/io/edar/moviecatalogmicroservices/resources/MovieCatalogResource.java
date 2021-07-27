package io.edar.moviecatalogmicroservices.resources;

//import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.edar.moviecatalogmicroservices.models.CataLogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CataLogItem> getCatalog(@PathVariable String userId){
	
	return Collections.singletonList(new CataLogItem("Transformer","Test", 4));
	
	}
}
