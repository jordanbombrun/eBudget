package com.ebudget.application;

import com.ebudget.application.model.AppliUser;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Essai date");
        String date = "01/01/2000";
        LocalDate nDate = parseMyDate(date);
        System.out.println(nDate.toString());

        //création user
		//(String lastName, String firstName, String username, String pass, String mail) {
		AppliUser user = new AppliUser("vbb", "jordan", "jax",
				"motdepasse", "toto@gmail.com");



    }

    private static LocalDate parseMyDate(String date) {
        return LocalDate.parse(date, DateTimeFormat.forPattern("DD/MM/YYYY"));
    }
}
