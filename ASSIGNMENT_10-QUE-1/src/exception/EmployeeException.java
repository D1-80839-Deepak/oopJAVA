package exception;


public class EmployeeException extends RuntimeException{
String invalidValue;
private String field;
public EmployeeException() {
	super("Invalid values");
}


public EmployeeException(String invalidValue, String field) {
	this.invalidValue = invalidValue;
	this.field = field;
}


public String getInvalidValue() {
	return invalidValue;
}

public void setInvalidValue(String invalidValue) {
	this.invalidValue = invalidValue;
}

public String getField() {
	return field;
}
public void setField(String field) {
	this.field = field;
}
}

