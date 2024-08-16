package com.example.xsltTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XsltTestApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(XsltTestApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		System.out.println("APP START");
		//new utilClass().utilMethod();
		//XmlConverter.convert();
		XmlConverter.callFromXslt();
		System.out.println("APP FINISH");

	}

}
