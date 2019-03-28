package com.phyton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.python.util.PythonInterpreter;
import org.springframework.util.StringUtils;

import ch.qos.logback.classic.Logger;

import org.python.core.*;

public class PytonExecutor {

	private Logger log;
	public String variable;

	public String execute(String code) throws IOException {

		PyObject x = null;
		try {
			PythonInterpreter interp = new PythonInterpreter();
			System.out.println("****** Python code process Started *******");
			if (code.contains("print")) {
				// remove print
				String executedCode = StringUtils.replace(code, "print", " ");
				if (variable == null) {
					interp.set("a", new PyInteger(0));
					interp.exec("a= " + executedCode);
					x = interp.get("a");
				} else {
					interp.set("a", new PyInteger(Integer.parseInt(variable)));
					interp.exec("print a ");
					interp.exec("a=" + executedCode);
					x = interp.get("a");

				}

				System.out.println("****** Python code ended  *****************");
				interp.close();
			} else if (code.contains("=")) {
				setVariable(code);
				return "";
			}

		} catch (Exception ex) {
			log.error("Exception while creating python interpreter: " + ex.toString());
		}

		return x.toString();
	}

	public void setVariable(String var) {

		this.variable = var;

	}

}
