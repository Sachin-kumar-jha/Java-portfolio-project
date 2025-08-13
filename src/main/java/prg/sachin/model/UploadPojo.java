package prg.sachin.model;

public class UploadPojo {
    private int sn ;
    private String forFilename;
    private String datetime;
    
	public UploadPojo(int sn, String forFilename, String datetime) {
		super();
		this.sn = sn;
		this.forFilename = forFilename;
		this.datetime = datetime;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getForFilename() {
		return forFilename;
	}
	public void setForFilename(String forFilename) {
		this.forFilename = forFilename;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
    
}
