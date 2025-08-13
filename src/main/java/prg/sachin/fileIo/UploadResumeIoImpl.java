package prg.sachin.fileIo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

public class UploadResumeIoImpl implements UploadResumeIo {
 private String path;
 private boolean result;
 private String rs;
 private InputStream inputStream;
 private FileOutputStream fileOutputStream;
	@SuppressWarnings("finally")
	@Override
	public boolean isExist(String realPath) {
		try {
			path =realPath+File.separator+"mycv.pdf";
			File file = new File(path);
		     result= file.exists();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		  return result;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public String writeResume(Part part,String realPath) {
		try {
			path =realPath+File.separator+"mycv.pdf";
			
		    inputStream = part.getInputStream();
			byte b[]=new byte[inputStream.available()];
			inputStream.read(b);
			
			fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(b);
		     rs="Resume Uploaded Successfully!";
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				rs="failed";
				e.printStackTrace();
			}
			
		  return rs;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public boolean deleteResume(Part part,String realPath) {
		try {
			path =realPath+File.separator+"mycv.pdf";
			File file = new File(path);
	       result= file.delete();
	       
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		  return result;
		}
	}
	

}
