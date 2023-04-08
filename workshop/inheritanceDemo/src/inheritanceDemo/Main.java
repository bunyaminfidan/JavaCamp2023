package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		TeacherCreditManager teacherCreditManager =  new TeacherCreditManager();
		AgricultureCredit agricultureCredit = new AgricultureCredit();
		
		KrediUI creditUI = new KrediUI();
		creditUI.CalculateCredi(teacherCreditManager);
		
			
			

	}

}
