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

	public void assignPatientsToDoctors() throws Exception{ 
	
		int doctor = -1;
		if (patient.size() > 3) {
			System.out.println("test");
			for (int i = 0; i < patient.size() - 1; i++) {	
				if (i % 3 == 0) {
					doctor++;
					System.out.println(doctor);
				}
					
			}
			doc.get(doctor).getPatients();
			
		}
		
		
		
		
	}

}
