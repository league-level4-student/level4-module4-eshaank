package _04_hospital;

import java.util.ArrayList;

import javax.print.Doc;

public class Doctor{
	ArrayList<Patient> patient = new ArrayList<Patient>();
	public Object performsSurgery() {
		
		return false;
	}

	public Object makesHouseCalls() {
		
		return false;
	}

	public void assignPatient(Patient p) {
		patient.add(p);
		
	}

	public ArrayList<Patient> getPatients() {
		
		return patient;
	}

}
