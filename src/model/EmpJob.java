package model;

public class EmpJob {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	private String password;
	private String role;
	private String gender;
	private String active;
	
	//Default Constructor
	
	public EmpJob() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor method will all fields
	
	public EmpJob(int employeeId, String firstName, String lastName, String email, String userId, String password,
			String role, String gender, String active) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.gender = gender;
		this.active = active;
	}
	
	//parameterized constructor method without EmployeeId and active fields
	
	public EmpJob(String firstName, String lastName, String email, String userId, String password, String role,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.gender = gender;
	}
	
	//getter and setter methods
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "EmpJob [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", userId=" + userId + ", password=" + password + ", role=" + role + ", gender=" + gender
				+ ", active=" + active + "]";
	}
	
	
}
