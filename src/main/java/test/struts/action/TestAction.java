package test.struts.action;

public class TestAction {
	public String execute() {
		System.out.println("===TestAction===");
		return "success";
	}
	public String action() {
		System.out.println("===TestAction===");
		return "ok";
	}
}
