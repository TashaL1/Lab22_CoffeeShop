package co.grandcircus.lab22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PersonController {
	@Autowired
	private Person registeredPerson;

	@RequestMapping("register")

	
	
	
	public ModelAndView personPage() {
		ModelAndView mv = new ModelAndView("registration", "modelName", "Hello World!");
		Person p = new Person("Jane", "Doe", "jdoe@gmail.com", "313-555-1212", "");
		mv.addObject("personA", p);
		System.out.println();
		return mv;

	}
	@RequestMapping("submit-person")
	public ModelAndView submitForm(Person person) {

	
		return new ModelAndView("person-confirm", "personinfo", person);
	}
}
