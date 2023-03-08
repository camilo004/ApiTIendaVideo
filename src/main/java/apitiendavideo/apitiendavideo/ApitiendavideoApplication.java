package apitiendavideo.apitiendavideo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import apitiendavideo.apitiendavideo.servicios.IPaisServicio;
import apitiendavideo.apitiendavideo.servicios.PaisServicio;

@SpringBootApplication
public class ApitiendavideoApplication {
	@Autowired
	static
	IPaisServicio servicio = new PaisServicio();

	public static void main(String[] args) {
		SpringApplication.run(ApitiendavideoApplication.class, args);


	}

}
