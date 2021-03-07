package com.akm.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.akm.models.RestUrlResponse;

public interface RestUrlResponseRepository  extends CrudRepository  <RestUrlResponse,String>  
{
	
	@Query("SELECT  rur  FROM REST_URL_RESPONSE rur WHERE  URL =:url ")
	public RestUrlResponse find(@Param("url") String url);

}
