package model.entities;

import java.util.Date;
import java.util.Objects;

public class Seller extends Department {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double basaSalary;

	public Seller(Integer id, String name, String email, Date birthDate, Double basaSalary) {
		super(id, name);
		this.email = email;
		this.birthDate = birthDate;
		this.basaSalary = basaSalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBasaSalary() {
		return basaSalary;
	}

	public void setBasaSalary(Double basaSalary) {
		this.basaSalary = basaSalary;
	}

	@Override
	public String toString() {
		return "Seller [email=" + email + ", birthDate=" + birthDate + ", basaSalary=" + basaSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(basaSalary, birthDate, email);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(basaSalary, other.basaSalary) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(email, other.email);
	}

}
