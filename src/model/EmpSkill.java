package model;

public class EmpSkill {
	private int esId;
	private int employeeId;
	private int skillId;
	private int experience;
	
	//Default Constructor
	
	public EmpSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor method will all fields
	
	public EmpSkill(int esId, int employeeId, int skillId, int experience) {
		super();
		this.esId = esId;
		this.employeeId = employeeId;
		this.skillId = skillId;
		this.experience = experience;
	}
	
	//parameterized constructor method without EmployeeId field
	
	public EmpSkill(int employeeId, int skillId, int experience) {
		super();
		this.employeeId = employeeId;
		this.skillId = skillId;
		this.experience = experience;
	}
	
	//getter and setter methods
	
	public int getEsId() {
		return esId;
	}
	public void setEsId(int esId) {
		this.esId = esId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	//to string
	
	@Override
	public String toString() {
		return "EmpSkill [esId=" + esId + ", employeeId=" + employeeId + ", skillId=" + skillId + ", experience="
				+ experience + "]";
	}
	

}
