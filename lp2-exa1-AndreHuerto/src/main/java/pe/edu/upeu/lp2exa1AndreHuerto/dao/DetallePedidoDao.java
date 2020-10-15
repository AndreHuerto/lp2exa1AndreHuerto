package pe.edu.upeu.lp2exa1AndreHuerto.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1AndreHuerto.entity.DetallePedido;

public interface DetallePedidoDao {
	DetallePedido read(int id);
    List<Map<String,Object>> readAll();
}
