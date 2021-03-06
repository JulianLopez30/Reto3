// Categoria, Mensaje, Reservacion, Cliente, Farm
//1. Modelo o Entidad
//2. Interfaces 
//3. Repositorio
//4. Servicios
//5. Controlador o Web 



package tutoria.domingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"tutoria.domingo.modelo"})


public class DomingoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomingoApplication.class, args);
	}

}
