package test.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.struts.model.TestDTO;


//prepare , modelDriven
public class FormAction implements Preparable, ModelDriven{
	
	private TestDTO dto = null;
	
	public String execute() {
		
		return "success";
	}
	public String pro() {
		System.out.println(dto.getName());
		System.out.println(dto.getNumber());
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
