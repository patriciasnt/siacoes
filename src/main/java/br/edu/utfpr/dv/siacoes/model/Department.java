package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
@ToString @AllArgsConstructor

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Getter @Setter private int idDepartment;
	@Getter @Setter private Campus campus;
	@Getter @Setter private String name;
	@Getter @Setter private String fullName;
	@Getter @Setter private transient byte[] logo;
	@Setter private boolean active;
	@Getter @Setter private String site;
	@Getter @Setter private String initials;
	
	public Department(){
		this.setIdDepartment(0);
		this.setCampus(new Campus());
		this.setName("");
		this.setFullName("");
		this.setLogo(null);
		this.setActive(true);
		this.setSite("");
		this.setInitials("");
	}
	
	/*
	public int getIdDepartment() {
		return idDepartment;
	}
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}
	public Campus getCampus() {
		return campus;
	}
	public void setCampus(Campus campus) {
		this.campus = campus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName(){
		return fullName;
	}
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}*/

	public boolean isActive() {
		return active;
	}

	/*
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getSite(){
		return site;
	}
	public void setSite(String site){
		this.site = site;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public String toString(){
		return this.getName();
	}
	*/
}
