package com.phyton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.stream.Stream;

@Controller
public class NoteBookServerController {

	/**
	 * +
	 * 
	 * @param text
	 * @param model
	 * @return
	 */
	@GetMapping("/execute")
	public String executing(@RequestBody Stream<String> text,
			Model model) {
		//model.addAttribute("name", text);

		/*
		 text
		 	.map(x -> x.split(":"))
		 	.map(x -> x[1].split("%python"))
		 	.filter(x -> x.length> 2)
		 	.forEach(x-> System.out.println(x[0]+ "-----" + x[1]));
				

		text.close();
		*/

		return "noteBook";
	}

}
