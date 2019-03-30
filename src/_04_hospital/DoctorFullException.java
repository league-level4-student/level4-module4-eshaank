package _04_hospital;

public class DoctorFullException extends Exception {
	public DoctorFullException(String message) {
		message = "this is wrong";
		System.out.println(message);
	}

}
