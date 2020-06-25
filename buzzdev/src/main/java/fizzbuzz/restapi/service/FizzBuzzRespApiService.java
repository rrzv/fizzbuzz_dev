package fizzbuzz.restapi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import alfresco.variation.impl.FizzBuzzImpl;
import fizzbuzz.dto.FizzBuzz;

@Path("/fizzbuzz")
public class FizzBuzzRespApiService {
	
	FizzBuzzImpl fizzBuzzImpl = new FizzBuzzImpl();
	
	@GET
	@Path("/{range}")
	@Produces(MediaType.APPLICATION_JSON)
	public StringBuffer getCategories(@PathParam("range") String range) {
		String[] parts = range.split("-");
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(Integer.valueOf(parts[0]).intValue());
		fizzBuzz.setSuperiorLimit(Integer.valueOf(parts[1]).intValue());
		

		return fizzBuzzImpl.generateFizzBuzzString(fizzBuzz);
	}

}
