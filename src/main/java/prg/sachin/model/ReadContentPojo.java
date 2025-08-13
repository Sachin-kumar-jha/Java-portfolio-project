package prg.sachin.model;

public class ReadContentPojo {
private int eid;
private String name;
private String email;
private String message;

public ReadContentPojo(int eid, String name, String email, String message) {
	super();
	this.eid = eid;
	this.name = name;
	this.email = email;
	this.message = message;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "ReadContentPojo [eid=" + eid + ", name=" + name + ", email=" + email + ", message=" + message + "]";
}

}
