package project.foodmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication()
public class FoodmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodmapApplication.class, args);
	}

}
