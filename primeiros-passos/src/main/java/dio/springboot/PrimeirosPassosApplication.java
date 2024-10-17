package dio.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);		
		}

		@Bean
		public CommandLineRunner run(ConversorJson conversor) throws Exception{
			return args -> {
				String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"Sao Paulo\"}";
				ViaCepResponse response = conversor.converter(json);
				System.out.println("Dados do CEP: " + response);

			};
	}
	@Bean
	public Gson gson(){
		return new Gson();
	}

}
