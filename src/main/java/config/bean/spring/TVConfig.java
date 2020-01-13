package config.bean.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TVConfig {

	@Bean
	public TV sstv() {
		return new SamsungTV();
	}

	@Bean
	public TV lgtv() {
		return new LGTV();
	}
}
