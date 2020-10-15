package pe.edu.upeu.lp2exa1AndreHuerto.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1AndreHuerto.entity.Usuario;
import pe.edu.upeu.lp2exa1AndreHuerto.security.JwtUtil;
import pe.edu.upeu.lp2exa1AndreHuerto.service.DetallePedidoService;

@RestController

public class DatellePedidoController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@Autowired
	private DetallePedidoService detallepedidoservice;
@GetMapping("/lista")
public List<Map<String, Object>>listar(){
	return detallepedidoservice.readAll();
	             
}

@GetMapping("/")
public String mensaje() {
	return "Bienvenido Al sistema de ventas :)";
}


@PostMapping("/authenticate")
public String generateToken(@RequestBody Usuario authRequest) throws Exception {
    try {
    	System.out.println(authRequest.getNomuser());
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
    } catch (Exception ex) {
        throw new Exception("Error: "+ex);
    }
return jwtUtil.generateToken(authRequest.getNomuser());
}
}
