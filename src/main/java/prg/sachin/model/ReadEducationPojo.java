package prg.sachin.model;

public class ReadEducationPojo {
private int id;
private int year;
private String title;
private String subtitle;
private String desc;
private String time;

public ReadEducationPojo(int id,int year, String title, String subtitle, String desc, String time) {
	super();
	this.id=id;
	this.year = year;
	this.title = title;
	this.subtitle = subtitle;
	this.desc = desc;
	this.time = time;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSubtitle() {
	return subtitle;
}
public void setSubtitle(String subtitle) {
	this.subtitle = subtitle;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}

}
