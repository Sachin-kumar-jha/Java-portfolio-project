package prg.sachin.fileIo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

public class ProjectIoImpl implements ProjetIo {
private boolean result ;
private String path ;
private InputStream Is;
private FileOutputStream fos;
	@SuppressWarnings("finally")
	@Override
	public boolean writeProject(Part part, String forFilename,String realPath) {
	  try {
			Is = part.getInputStream();
			byte []b=new byte[Is.available()];
			Is.read(b);
			
		path =realPath+File.separator+forFilename;
        
		 fos = new FileOutputStream(path);
		fos.write(b);
		result =true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				Is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public boolean deleteProject(String forFilename,String realPath) {
		try {
		path =realPath+File.separator+forFilename;
        new File(path).delete();
		result =true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return result;
		}
	}

}
