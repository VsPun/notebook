package com.phyton;

import java.io.IOException;
import java.util.Properties;

import org.python.util.PythonInterpreter;

import ch.qos.logback.classic.Logger;

import org.python.core.*;

public class PytonExecutor {

	private Logger log;

	public String execute(String code) throws IOException {

		PythonInterpreter interpreter = null;

		try {
			Properties p = new Properties();
			p.setProperty("python.path", "C:\\Users\\laila\\.m2\\repository\\org\\python\\jython\\2.7.0");
			p.setProperty("python.home", "C:\\Users\\laila\\.m2\\repository\\org\\python\\jython\\2.7.0");
			p.setProperty("python.prefix", "C:\\Users\\laila\\.m2\\repository\\org\\python\\jython\\2.7.0");
			PythonInterpreter.initialize(System.getProperties(), p, new String[] {});
			interpreter = new PythonInterpreter();

			interpreter.exec(code);
			interpreter.close();
			System.out.println("val : " + code);
			return "2";

		} catch (Exception ex) {
			log.error("Exception while creating python interpreter: " + ex.toString());
		}

		return "2"; 
	}

}
