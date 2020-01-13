package aopexam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AnimalConfig {
	@Bean
	public Animal dog() {
		return new Dog();
	}

	@Bean
	public Animal cat() {
		return new Cat();
	}

	@Bean
	public Animal rabbit() {
		return new Rabbit();
	}

	@Bean
	public AnimalCommon anicom() {
		return new AnimalCommon();
	}
}
