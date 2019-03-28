package com.python.controller;

import java.io.IOException;

import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phyton.PytonExecutor;
import com.python.model.CodeSnippet;

@RestController
public class NoteBookServerController {
	
	private PytonExecutor pytonExecutor= new PytonExecutor();
	
	
	
	@PostMapping("/execute")
	public String executing(@RequestBody CodeSnippet code,
			Model model) {
	
		String text=code.getCode();
		if(StringUtils.startsWithIgnoreCase(text,"%python")) {
			try {
				return pytonExecutor.execute(text.replace("%python", ""));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		

		return code.getCode();
	}

}
