package dao;

import java.util.List;

import model.EmpJob;

public interface IEmpJobDao {
	
	List<EmpJob> getAllEmpJobs();
	void addEmpJob(EmpJob emp);
	EmpJob getEmpJobById(int id);
	void updateEmpJob(EmpJob emp);
	void deleteEmpJob(int id);
}
