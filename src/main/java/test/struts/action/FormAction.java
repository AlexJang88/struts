package test.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.struts.model.TestDTO;


//prepare , modelDriven
public class FormAction implements Preparable, ModelDriven{
	
	private HttpServletRequest request=null;
	private HttpServletResponse response=null;
	private HttpSession session=null;
	private TestDTO dto = null;
	
	public String execute() {
		
		return "success";
	}
	
	public String pro() {
		System.out.println(dto.getName());
		System.out.println(dto.getNumber());
		request= ServletActionContext.getRequest();
		request.getParameter("name");
		session=request.getSession();
		return "success";
	}
	
	@Override
	public Object getModel() {
		return dto;
	}
	@Override
	public void prepare() throws Exception {
		dto = new TestDTO();
	}
	
}
