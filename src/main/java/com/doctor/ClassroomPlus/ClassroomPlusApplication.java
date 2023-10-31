package com.doctor.ClassroomPlus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ClassroomPlusApplication {

	public static void main(String[] args) {
//		try {
//			SpringApplication.run(ClassroomPlusApplication.class, args);
//		}catch(Exception e){
//			System.out.println("Got error here");
//			log.info(e.getMessage());
//		}

		SpringApplication.run(ClassroomPlusApplication.class, args);
	}

}
