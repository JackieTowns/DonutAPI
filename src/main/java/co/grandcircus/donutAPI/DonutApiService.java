package co.grandcircus.donutAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutAPI.model.DonutDetailsResponse;
import co.grandcircus.donutAPI.model.DonutResponse;

@Component
public class DonutApiService {

	private RestTemplate restTemplate;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public DonutResponse getDonut() {

		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";

		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);

		return response;
	}


	public DonutDetailsResponse donutDetails(@RequestParam("id") Long id) {
		// https://grandcircusco.github.io/demo-apis/donuts/1.json
	  
	  
	  String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id +".json";
	  
		DonutDetailsResponse response = restTemplate.getForObject(url, DonutDetailsResponse.class);
	  
	  return response; 
	  }

}