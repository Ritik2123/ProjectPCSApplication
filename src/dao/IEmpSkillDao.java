package dao;

import java.util.List;

import model.EmpSkill;

public interface IEmpSkillDao {

	List<EmpSkill> getAllEmpSkills();
	void addEmpSkill(EmpSkill emps);
	EmpSkill getEmpSkillById(int id);
	void updateEmpSkill(int id);
	void deleteEmpSkill(int id);
}
