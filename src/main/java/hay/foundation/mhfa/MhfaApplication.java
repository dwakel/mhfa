package hay.foundation.mhfa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" , "io.swagger.configuration"})
public class MhfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhfaApplication.class, args);
	}

}

//class ExitException extends RuntimeException implements ExitCodeGenerator {
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	public int getExitCode() {
//		return 10;
//	}
//
//}
