package pe.edu.upeu.lp2exa1AndreHuerto.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1AndreHuerto.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1AndreHuerto.entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public Usuario read(String nomuser) {
		String sql = "select * from usuario where nomuser = ?";
		return jdbctemplate.queryForObject(sql, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));

	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
