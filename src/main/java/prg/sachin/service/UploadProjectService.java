package prg.sachin.service;

import javax.servlet.http.Part;

public interface UploadProjectService {

	public String uploadProjectService1(Part part);
	public String uploadProjectService2(Part part,String datetime,String realPath);
}
