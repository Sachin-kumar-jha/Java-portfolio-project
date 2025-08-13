package prg.sachin.fileIo;

import javax.servlet.http.Part;

public interface UploadResumeIo {
public boolean isExist(String realPath);
public String writeResume(Part part,String realPath);
public boolean deleteResume(Part part,String realPat);

}
