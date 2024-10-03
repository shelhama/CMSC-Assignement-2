
public class Procedure {
	private String name, date, practitionnerName;
	private double charges;
	

	public Procedure() {
		
	}
	public Procedure (String name, String date, String practitionnerName) {
		this.name = name;
		this.date = date ;
		this.practitionnerName = practitionnerName;
	}
	public Procedure (String name, String date, String practitionnerName, double charges) {
		this.name = name;
		this.date = date ;
		this.practitionnerName = practitionnerName;
		this.charges = charges;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPractitionnerName() {
		return practitionnerName;
	}
	public void setPractitionnerName(String practitionnerName) {
		this.practitionnerName = practitionnerName;
	}
	public double charges() {
		return charges;
	}
	public void setCharges (double charges) {
		this.charges = charges;
	}
	
	public String toString() {
		return "Procedure: " + name + "\n" +
				"Procedure Date: " + date + "\n" +
				"Practitionner: " + practitionnerName + " \n" +
				"Charges: " + charges ;
	}
}
