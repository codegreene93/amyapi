package com.wilmir.demorest;

	import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

	@Path("/Weather")
	public class WeatherResource {
		@GET
		@Path("/data/{param}")
		public Response GetWeatherInfo(@PathParam("param") String city) {
		String URL = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&mode=json&appid=a2df73559f8e89191ef06e873608b9c4";
		Client weather = ClientBuilder.newClient();
		Response result = weather.target(URL).request().get();
		return result;
		}
		
		@GET
		@Path("/query")
		public Response QueryGetWeatherInfo(@QueryParam("city") String city) {
			String URL = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&mode=json&appid=a2df73559f8e89191ef06e873608b9c4";
			Client weather = ClientBuilder.newClient();
			Response result = weather.target(URL).request().get();
			return result;
		}
		
	}



