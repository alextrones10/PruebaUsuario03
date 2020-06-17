package com.proyecto.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "id_usu")
	private int id_usu;
	
	@Column(name = "pass_usu")
	private String pass_usu;
	
	@Column(name = "tdoc_usu")
	private String tdoc_usu;
	
	@Column(name = "celu_usu")
	private String celu_usu;
	
	@Column(name = "naci_usu")
	private String naci_usu;
	
	@Column(name = "dept_usu")
	private String dept_usu;
	
	@Column(name = "prov_usu")
	private String prov_usu;
	
	@Column(name = "dist_usu")
	private String dist_usu;
	
	@Column(name = "dire_usu")
	private String dire_usu;

	public int getId_usu() {
		return id_usu;
	}

	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}

	public String getPass_usu() {
		return pass_usu;
	}

	public void setPass_usu(String pass_usu) {
		this.pass_usu = pass_usu;
	}

	public String getTdoc_usu() {
		return tdoc_usu;
	}

	public void setTdoc_usu(String tdoc_usu) {
		this.tdoc_usu = tdoc_usu;
	}

	public String getCelu_usu() {
		return celu_usu;
	}

	public void setCelu_usu(String celu_usu) {
		this.celu_usu = celu_usu;
	}

	public String getNaci_usu() {
		return naci_usu;
	}

	public void setNaci_usu(String naci_usu) {
		this.naci_usu = naci_usu;
	}

	public String getDept_usu() {
		return dept_usu;
	}

	public void setDept_usu(String dept_usu) {
		this.dept_usu = dept_usu;
	}

	public String getProv_usu() {
		return prov_usu;
	}

	public void setProv_usu(String prov_usu) {
		this.prov_usu = prov_usu;
	}

	public String getDist_usu() {
		return dist_usu;
	}

	public void setDist_usu(String dist_usu) {
		this.dist_usu = dist_usu;
	}

	public String getDire_usu() {
		return dire_usu;
	}

	public void setDire_usu(String dire_usu) {
		this.dire_usu = dire_usu;
	}

	
	
	
}
