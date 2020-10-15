package pe.edu.upeu.lp2exa1AndreHuerto.entity;

public class Usuario {
	private int idusuario;
	private String nomuser;
	private String clave;
	private int idpersona;
	public Usuario() {
		super();
	}
	public Usuario(int idusuario, String nomuser, String clave, int idpersona) {
		super();
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.clave = clave;
		this.idpersona = idpersona;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	
}
