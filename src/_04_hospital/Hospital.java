package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doc = new ArrayList<Doctor>();
	ArrayList<Patient> patient = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doc.add(d);

	}

	public ArrayList<Doctor> getDoctors() {

		return doc;
	}

	public void addPatient(Patient p) {
		patient.add(p);
	}

	public ArrayList<Patient> getPatients() {

		return patient;
	}

}
