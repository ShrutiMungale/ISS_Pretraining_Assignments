package oop;

public class Account {
	
	private String name;
	private String email;
	private String password;
	private int acc_no;
	

	public void setName(String name) {
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setAccNo(int acc_no) {
		this.acc_no=acc_no;
	}
	
	
	public int getAccNo() {
		return acc_no;
	}
	

}
