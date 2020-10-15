package pe.edu.upeu.lp2exa1AndreHuerto.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1AndreHuerto.entity.Usuario;

public interface UsuarioDao {
	public Usuario read(String nomuser);
    Usuario read(int id);
    List<Map<String,Object>> readAll();
}
