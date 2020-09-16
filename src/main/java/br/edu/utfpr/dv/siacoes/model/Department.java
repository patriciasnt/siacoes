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


	public boolean isActive() {
		return active;
	}


}
