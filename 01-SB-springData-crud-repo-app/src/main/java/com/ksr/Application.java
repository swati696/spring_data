package com.ksr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ksr.entity.Contact;
import com.ksr.repo.ContactRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ContactRepo crepo = ctxt.getBean(ContactRepo.class);
		//System.out.println("class:Nam:" +crepo.getClass().getName());
		Contact c = new Contact();
		c.setContactId("100");
		c.setContactName("swati");
		c.setContactNumber(788999999);
		crepo.save(c);
		c.setContactId("101");
		c.setContactName("ksr");
		c.setContactNumber(99099999);
		crepo.save(c);
		

		
	}

}
