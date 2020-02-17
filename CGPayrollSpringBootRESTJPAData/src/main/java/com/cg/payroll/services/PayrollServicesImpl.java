package com.cg.payroll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;

import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;



@Component("payrollServices")
public class PayrollServicesImpl implements PayrollServices{

	@Autowired
	private AssociateDAO associateDAO;


	@Override
	public Associate acceptAssociateDetails(Associate associate) {
		associate=associateDAO.save(associate);
		return associate;
	}


	
	/*
	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String department, String designation,
			String pancard, String emailId, int yearlyInvestmentUnder80C, int basicSalary, int epf, int companyPf, int accountNumber, String bankName, String ifscCode) {*/
/*
		Associate associate= new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId,new Salary(basicSalary, epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode));
		associate = associateDAO.save(associate);
		return associate.getAssociateID();
}*/

	@Override
	public Associate calculateNetSalary(int associateId) throws AssociateDetailsNotFoundException {
		Associate associate = getAssociateDetails(associateId);
		int netSalary;
		if (associate == null)
			throw new AssociateDetailsNotFoundException("Associate Details Not Found for Id " + associateId);
		int basicSalary = associate.salary.getBasicSalary();
		int hra = ((associate.salary.getBasicSalary() * 30)/100);
		int conveyenceSalary = (associate.salary.getBasicSalary() * 30/100);
		int otherAllowance = (associate.salary.getBasicSalary() * 25/100);
		int personalAllowance = (associate.salary.getBasicSalary() * 20/100);
		int monthlyGrossSalary = basicSalary + hra + conveyenceSalary + otherAllowance + personalAllowance
				+ associate.salary.getCompanyPf() + associate.salary.getEpf();
		int annualGrossSalary = monthlyGrossSalary * 12;
		int investment = associate.getYearlyInvestmentUnder8oC() + associate.salary.getCompanyPf()
		+ associate.salary.getEpf();
		if (investment >= 1500000)
			investment = 1500000;
		if (annualGrossSalary < 250000)
			netSalary = annualGrossSalary - associate.salary.getEpf() - associate.salary.getCompanyPf();
		else if (annualGrossSalary >= 250000 && annualGrossSalary < 500000)
			netSalary = (int) (annualGrossSalary - ((annualGrossSalary - investment) * 0.1) - associate.salary.getEpf()
					- associate.salary.getCompanyPf());
		else if (annualGrossSalary >= 500000 && annualGrossSalary < 1000000) {
			int t2 = (int) ((annualGrossSalary - 500000) * 0.2);
			int t1 = (int) ((250000 - investment) * 0.1);
			netSalary = annualGrossSalary - t1 - t2 - associate.salary.getCompanyPf() - associate.salary.getEpf();
		} else {
			int t3 = (int) ((annualGrossSalary - 1000000) * 0.3);
			int t2 = 1000000;
			int t1 = (int) ((250000 - investment) * 0.1);
			netSalary = annualGrossSalary - t1 - t2 - t3 - associate.salary.getCompanyPf() - associate.salary.getEpf();
		}
		associate.salary.setGrossSalary(annualGrossSalary);
		associate.salary.setHra(hra);
		associate.salary.setConveyanceAllowance(conveyenceSalary);
		associate.salary.setOtherAllowance(otherAllowance);
		associate.salary.setPersonalAllowance(personalAllowance);
		associate.salary.setMonthlyTax(5000);
		associate.salary.setNetSalary(netSalary);
		associateDAO.save(associate);
		return associate;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailsNotFoundException {
		
		return associateDAO.findById(associateId).orElseThrow(()->  new AssociateDetailsNotFoundException("Associate Details Not found for ID. : "+associateId));
				
	}

	@Override
	public List<Associate> getAllAssociateDetails() {

		return associateDAO.findAll();
	
	}



	@Override
	public boolean removeAssociateDetails(int associateId) throws AssociateDetailsNotFoundException {
		associateDAO.delete(getAssociateDetails(associateId));
		return true;
	}



	


}

