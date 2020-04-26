package com.wilmir.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/converters")
public class RomanNumeralResource {
	
	@GET
	@Path("/d2r/{param}")
	public Response convertToRoman(@PathParam("param") int decimal) {
		String romanNumeral = RomanNumeralApp.convertToRoman(decimal);
		
		String message = decimal + " is equal to " + romanNumeral + " in Roman Numerals"; 
		
		return Response.status(200).entity(message).build();
	}	
	
	
	@GET
	@Path("/r2d/{param}")
	public Response convertToDecimal(@PathParam("param") String roman) {
		int decimalNumber = RomanNumeralApp.convertToDecimal(roman);
		
		String message = roman + " is equal to " + decimalNumber + " in Decimal Number"; 

		return Response.status(200).entity(message).build();
	}

	
	
	@GET
	@Path("/query")
	public Response convertUsingQuery(@QueryParam("roman") String roman, @QueryParam("decimal") int decimal) {
		String message = "";
		int decimalNumber = 0;
		String romanNumeral = "";
		
		
		if(roman != null) {
			decimalNumber = RomanNumeralApp.convertToDecimal(roman);
			
			message += roman + " is equal to " + decimalNumber + " in Decimal Number. "; 

		}
		
		if(decimal != 0) {
			romanNumeral = RomanNumeralApp.convertToRoman(decimal);
			
			message += decimal + " is equal to " + romanNumeral + " in Roman Numeral."; 
		}
		
		return Response.status(200).entity(message).build();
	
	}
	
	
}
