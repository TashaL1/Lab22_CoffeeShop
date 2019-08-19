package co.grandcircus.lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@RequestMapping("/coffee")

	public ModelAndView coffee() {
		ModelAndView mv = new ModelAndView("index", "modelName", "Welcome to Coffee Shop!!");
		return mv;
	}
}
