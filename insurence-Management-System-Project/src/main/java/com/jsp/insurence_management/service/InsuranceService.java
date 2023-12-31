package com.jsp.insurence_management.service;

import java.sql.SQLException;

import java.util.ArrayList;

import com.jsp.insurence_management.dao.InsuranceDAO;
import com.jsp.insurence_management.dto.HealthInsurance;
import com.jsp.insurence_management.dto.Policy;
import com.jsp.insurence_management.dto.VehicleInsurance;



public class InsuranceService {
	InsuranceDAO insuranceDAO = new InsuranceDAO();

	public int registerHealthInsurancePolicy(HealthInsurance healthInsurance) throws ClassNotFoundException, SQLException 
	{
		return insuranceDAO.registerHealthInsurancePolicy(healthInsurance);
	}

	public int registerVehicleInsurancePolicy(VehicleInsurance vehicleInsurance) throws ClassNotFoundException, SQLException {
		return insuranceDAO.registerVehicleInsurancePolicy(vehicleInsurance);
	}

	public VehicleInsurance updatePolicyDetails(int policyReferenceNumber,String paymentMode, String paymentFrequency) throws Exception {
		return insuranceDAO.updatePolicyDetails(policyReferenceNumber,paymentMode,paymentFrequency);
	}
	
	public VehicleInsurance viewPolicy(int policyReferenceNumber) throws Exception {
		return insuranceDAO.viewPolicy(policyReferenceNumber);
	}

	public ArrayList<Policy> allPolicies() throws SQLException{
		return insuranceDAO.allPolicies();
	}

	public boolean[] terminatePolicy(String[] policyIdlist) throws Exception {
		return insuranceDAO.terminatePolicy(policyIdlist);
	}
	
	public ArrayList<VehicleInsurance> viewPoliciesToDelete(int customerId,String otype) throws SQLException{
		return insuranceDAO.viewPoliciesToDelete(customerId,otype);
	}
	
	public String viewPolicyType(int policyId) throws Exception{
		return insuranceDAO.viewPolicyType(policyId);
	}
	
	public boolean checkPolicyId(int custId, int policyId) throws Exception{
		return insuranceDAO.checkPolicyId(custId,policyId);
	}
}
