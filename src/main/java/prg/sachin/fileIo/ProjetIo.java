package prg.sachin.fileIo;

import javax.servlet.http.Part;

public interface ProjetIo {
   public boolean writeProject(Part part ,String forFilename,String realPath);
   public boolean deleteProject(String forFilename,String realPath);
}
