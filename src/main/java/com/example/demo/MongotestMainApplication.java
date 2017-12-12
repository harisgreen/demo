package com.example.demo;


import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.aggregation.ConditionalOperators;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SpringBootApplication
@EnableMongoAuditing
@EnableJSONDoc
public class MongotestMainApplication extends Error  implements Serializable {
	protected String name = "Fred";  // Noncompliant
	protected void setName(String name) throws InterruptedException {  // Noncompliant
		Thread.sleep(5);
	}
	Thread r =new Thread() {
		int p;
		@Override
		public void run() {
			while(true)
				System.out.println("a");
		}
	};

	private int red = 0;
	private int green = 0;
	private int blue = 0;
	int matrix1[][];   // Noncompliant
	int[] matrix[];
	public int getRed() {
		return red;
	}

	public static void main(String[] args) {

		Integer i = 1000;
		 Calendar calendar = Calendar.getInstance();
		BigDecimal m ;
		int i56 = 42;
		for (i = 0; i < 10; i56++) {  // Noncompliant
			System.out.println("hello");
		}

		String color = "blue";
		String name = "ishmael";

		List<String> strings = new ArrayList<String>();
		strings.add(color);
		strings.add(name);



		if (strings.indexOf(color) > 0) {  // Noncompliant
			System.out.println("is here");
		}
		if (name.indexOf("ish") > 0) { // Noncompliant
			System.out.println("is here");
		}
		if (name.indexOf("hma") > 2) { // Noncompliant
			System.out.println("is here");
		}

		double d = Double.longBitsToDouble(i56);
		System.out.println("hello");
		while (i > 1) {
			i--;
			if (1 == 1) {
				if (2 == 2) {
					if (3 == 3) {
						if (4 == 4) {

							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}else{
							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}
					}
				}
			}
		}


		while (i > 1) {
			i--;
			if (1 == 1) {
				if (2 == 2) {
					if (3 == 3) {
						if (4 == 4) {

							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}else{
							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}
					}
				}
			}
		}


		while (i > 1) {
			i--;
			if (1 == 1) {
				if (2 == 2) {
					if (3 == 3) {
						if (4 == 4) {

							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}else{
							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}
					}
				}
			}
		}


		while (i > 1) {
			i--;
			if (1 == 1) {
				if (2 == 2) {
					if (3 == 3) {
						if (4 == 4) {

							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}else{
							for(int ii = 0; ii < i ;ii++){
								System.out.println(ii + "is here");
							}
						}
					}
				}
			}
		}


		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
					}
				}
			}
		}

		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
					}
				}
			}
		}


		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
					}
				}
			}
		}


		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
					}
				}
			}
		}


		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
						String message = "hello world";
						System.out.println(message.toString());
					}
				}
			}
		}


		if (1 == 1) {
			if (2 == 2) {
				if (3 == 3) {
					if (4 == 4) {
						System.out.println( "we are here");

					}else{
						System.out.println( "we are not here");
					}
				}
			}
		}

		SpringApplication.run(MongotestMainApplication.class, args);
	}
}
