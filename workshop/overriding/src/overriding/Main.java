package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = { new TeacherCreditManager(),new  FarmerCredirManager() };

		
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			System.out.println(baseKrediManager.calculate(100));
		}
		
		

	}

}
