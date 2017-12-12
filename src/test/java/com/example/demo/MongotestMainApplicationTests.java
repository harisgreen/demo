package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongotestMainApplicationTests {

	@Test
	public void contextLoads() {
		int i56 = 42;


	}

	@Test
	public void contextLoads2() {

		int matrix1[][];   // Noncompliant
		int[] matrix[];
	}


	@Test
	public void contextLoads3() {
		int i56 = 42;
		double d = Double.longBitsToDouble(i56);
		System.out.println("hello");
		int i = 52;
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
	}

	@Test
	public void contextLoads4() {

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
	}

}
