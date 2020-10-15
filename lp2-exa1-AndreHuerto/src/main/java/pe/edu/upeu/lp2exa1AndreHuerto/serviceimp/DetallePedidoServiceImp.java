package pe.edu.upeu.lp2exa1AndreHuerto.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1AndreHuerto.dao.DetallePedidoDao;

import pe.edu.upeu.lp2exa1AndreHuerto.service.DetallePedidoService;
@Service
public class DetallePedidoServiceImp implements DetallePedidoService{
	@Autowired
	private DetallePedidoDao detallepedidoDao;
		@Override
		public List<Map<String, Object>> readAll() {
			// TODO Auto-generated method stub
			return detallepedidoDao.readAll();
		}
}
