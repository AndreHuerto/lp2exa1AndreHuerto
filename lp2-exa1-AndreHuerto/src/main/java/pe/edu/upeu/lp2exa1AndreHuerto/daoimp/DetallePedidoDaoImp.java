package pe.edu.upeu.lp2exa1AndreHuerto.daoimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1AndreHuerto.dao.DetallePedidoDao;
import pe.edu.upeu.lp2exa1AndreHuerto.entity.DetallePedido;
@Repository
public class DetallePedidoDaoImp implements DetallePedidoDao{
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from detalle_pedido";
		return jdbctemplate.queryForList(sql);
	}
	@Override
	public DetallePedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
