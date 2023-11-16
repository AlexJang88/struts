package test.struts.action;

import test.struts.interceptor.DAOInterface;
import test.struts.model.TestDAO;

public class HelloAction implements DAOInterface{
	
	private TestDAO dao=null;
	
	public String execute() {
		System.out.println(dao);
		System.out.println(dao.getConnection());
		System.out.println(dao.logincheck());
		return "success";
	}
	public void setDao(TestDAO dao) {
		this.dao=dao;
	}
}
