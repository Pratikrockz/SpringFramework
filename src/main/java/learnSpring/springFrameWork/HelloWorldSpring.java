package learnSpring.springFrameWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
	public static void main(String[] args) {
		var Context = new AnnotationConfigApplicationContext(HelloWorldSpringConfiguration.class);

		System.out.println(Context.getBean("name"));
		System.out.println(Context.getBean("age"));
		System.out.println(Context.getBean("person"));
		System.out.println(Context.getBean("address"));

	}
}

// In case of use spring frame work we need to create a configuration file and we need a context file to invoke it
// if we need any method to run it ll create within configuration file and that ll use bean in spring;
// if we want to see that or call that method from configuration file use getBean method;