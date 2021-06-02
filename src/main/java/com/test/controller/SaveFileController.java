package com.test.controller;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sujith Ramanathan
 *
 */

@RestController
@RequestMapping("/save")
public class SaveFileController {
	
	private static final Logger logger = Logger.getLogger(SaveFileController.class); 
	
	@GetMapping("/file")
	public String hi(@RequestParam String data) {
		logger.debug("Data :: "+data);
		saveToFile(data);
		return "Hiiii";
	}
	
	private void saveToFile(String data) {
		String fileName = String.valueOf(System.currentTimeMillis()).concat(".txt");
		logger.debug("FileName :: "+fileName);
		File file = new File("/tmp/api/".concat(fileName));
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(data);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
