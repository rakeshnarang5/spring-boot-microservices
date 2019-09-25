package resources;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import models.CatalogItem;

@RestController
public class MovieCatalogResource {
	
	public List<CatalogItem> getCatalog(String userId){
		return null;
	}

}
