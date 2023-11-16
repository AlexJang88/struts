package test.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.model.TestDAO;

public class DAOInterceptor implements Interceptor{
	
	private TestDAO dao =null;
	
	@Override
	public void init() {
		dao=new TestDAO();
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
//		System.out.println(arg0.getAction());
//		arg0.invoke();
//		System.out.println(arg0.getResult());
//		System.out.println(arg0.getResultCode());
//		arg0.setResultCode("ok");
//		System.out.println(arg0.getResultCode());
		
		Object obj= arg0.getAction();
		if(obj instanceof DAOInterface) {
			DAOInterface di=(DAOInterface) obj;
			di.setDao(dao);
		}
		
		
		arg0.invoke();
		return null;
	}
	
	
	@Override
	public void destroy() {
		
	}

	
	

		
}
