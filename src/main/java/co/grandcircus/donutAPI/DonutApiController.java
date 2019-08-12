package co.grandcircus.donutAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.donutAPI.model.DonutResponse;

@Controller
public class DonutApiController {

	@Autowired
	private DonutApiService apiService;

	/*
	 * @RequestMapping("/") public ModelAndView index() { return new
	 * ModelAndView("index", "donut", apiService.donut());
	 * 
	 * }
	 */

	@RequestMapping("/")
	public ModelAndView index() {
		DonutResponse response = apiService.getDonut();
		System.out.println(response);
		System.out.println(response.getResults());
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("donut", response.getResults());
		mv.addObject("count", response.getCount());
		return mv;
	}

	@RequestMapping("/donut-results")
	public ModelAndView donutResults(@RequestParam("id") Long id) {

		return new ModelAndView("donut-results", "details", apiService.donutDetails(id));

	}
}


