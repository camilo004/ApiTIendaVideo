package apitiendavideo.apitiendavideo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import apitiendavideo.apitiendavideo.Seguridad.FiltroSeguridad;
import apitiendavideo.apitiendavideo.interfaces.IPaisServicio;
import apitiendavideo.apitiendavideo.servicios.PaisServicio;

@SpringBootApplication
public class ApitiendavideoApplication {
	@Autowired
	static
	IPaisServicio servicio = new PaisServicio();

	public static void main(String[] args) {
		SpringApplication.run(ApitiendavideoApplication.class, args);


	}
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter{

		@Override
		protected void configure(HttpSecurity http) throws Exception{
			http.csrf().disable()
			.addFilterAfter(new FiltroSeguridad(), UsernamePasswordAuthenticationFilter.class)
			.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/usuarios/login").permitAll()
			.anyRequest().authenticated();
		}
	}

}
