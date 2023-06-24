package com.jsp.insurence_management.service;

import java.sql.SQLException;

import com.jsp.insurence_management.dao.LogInDAO;
import com.jsp.insurence_management.dto.Officer;




public class LogInService {
	
	public String checkLoginService(Officer officer) throws SQLException, ClassNotFoundException
	{
		String type=LogInDAO.checkLogin(officer);
		return type;
	}

}
