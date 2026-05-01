package learnSpring.springFrameWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String firstLine, String city) {
}

@Configuration

public class HelloWorldSpringConfiguration {

	@Bean
	public String name() {
		return "pratik";
	};

	@Bean

	public int age() {
		return 26;
	};

	@Bean

	public Person person() {
		return new Person("xyz", 21);

	}

	@Bean
	public Address address() {
		return new Address("abc", "kolkata");
	}

}
