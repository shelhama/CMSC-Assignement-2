
public class Patient {
	private String firstName, middleName, lastName;
	private String adress, city, state, code;
	private String number;
	private String emrContactName, emrContactPhone;
	
	
	public Patient(String firstName, String middleName, String lastName, String adress, String city, String state, String code,
			String number, String emrContactName, String emrContactPhone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.adress = adress;
		this.city = city;
		this.state = state;
		this.code = code;
		this.number = number;
		this.emrContactName = emrContactName;
		this.emrContactPhone = emrContactPhone;
	}
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	public String getAdress() {
		return adress + ", " + city + ", " + state + " " + code;
	}

	public String getEmergencyContact() {
		return emrContactName + " "+ emrContactPhone;
	
	}
	public String toString() {
		return "Patient Info: \n\n" +
				"Name: " + getFullName() + "\n" +
				"Adress: " + getAdress() + "\n" +
				"Emergency Contact: " + getEmergencyContact();
	}
}
