package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Alex";
		String student2 = "David";
		String student3 = "Nela";
		String student4 = "Bunyamin";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		//

		System.out.println();
		String[] students = { "Ali", "David", "Mehmet", "Bunyamin" };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("----------------------------------");

		for (String student : students) {
			System.out.println(student);
		}

	}

}
