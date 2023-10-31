package exception;

public class EmployeeException extends RuntimeException{
String invalidValue;

public EmployeeException(String invalidValue) {
	this.invalidValue = invalidValue;
}

public String getInvalidValue() {
	return invalidValue;
}

public void setInvalidValue(String invalidValue) {
	this.invalidValue = invalidValue;
}


}
