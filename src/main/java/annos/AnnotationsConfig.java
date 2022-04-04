package annos;

import org.springframework.stereotype.context.annotation.Bean;
import org.springframework.context.annotation.configuration;
@Configuration
public class AnnotationsConfig {
	@Bean
public Bike getVehicle() {
	return new Bike;
}
}
