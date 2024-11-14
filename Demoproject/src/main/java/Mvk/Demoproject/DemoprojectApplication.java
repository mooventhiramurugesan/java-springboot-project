package Mvk.Demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoprojectApplication 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext con = SpringApplication.run(DemoprojectApplication.class, args);

		Network str = con.getBean(Network.class);
		str.network();
	}
}
