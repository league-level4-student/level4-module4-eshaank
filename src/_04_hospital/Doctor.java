package _04_hospital;

import java.util.ArrayList;

import javax.print.Doc;

public class Doctor{
	ArrayList<Patient> patient = new ArrayList<Patient>();
	Boolean c = false;
	public Object performsSurgery() {
		
		return false;
	}

	public Object makesHouseCalls() {
		
		return false;
	}

	public void assignPatient(Patient p) throws Exception{
		
		patient.add(p);
		
		if (patient.size() > 3) {
			throw new Exception();
		}
		
		
	}

	public ArrayList<Patient> getPatients() {
		
		return patient;
	}

	public void doMedicine() {
		for (int i = 0; i < patient.size(); i++) {
			patient.get(i).checkPulse();
		}
	}

	

}
