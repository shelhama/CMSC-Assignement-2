
public class PatientDriverApp {
	public static void main (String[] args ) {
		
		Patient patient = new Patient ("Joe ", "Bideenn" , "Sa", "234 taklen Street ", "Mytown","VA", "1234", "777-555-1212", "Bill Santori", "301-987-6755" );
		
		Procedure procedure1 = new Procedure("X-ray", "7/20/2019", "Dr. Jameson", 5500.43 );
	
		
		Procedure procedure2 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);
		
		
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. smith", 1400.75);
		
		displayPatient(patient);
		
		displayProcedure(procedure1);
		System.out.println();
		displayProcedure(procedure2);
		System.out.println();
		displayProcedure(procedure3);
		System.out.println();
		
		double totalCharges = procedure1.charges() + procedure2.charges()+procedure3.charges();
		System.out.printf("Total Charges: $%.2f%n" , totalCharges);
		
		System.out.println("\nStudent Name: Samuella Helha");
		System.out.println("MC21159749");
		System.out.println("Due Date: 10/2/2024");
		
	}


	public static void displayPatient(Patient patient) {
		System.out.println(patient);
	}
	public static void displayProcedure(Procedure procedure) {
		System.out.println("Procedure: "+ procedure.getName());
		System.out.println("ProcedureDate: " + procedure.getDate());
		System.out.println("Practitionner: " + procedure.getPractitionnerName());
		System.out.println("Charges:" + procedure.charges());
		
	}
	

}
