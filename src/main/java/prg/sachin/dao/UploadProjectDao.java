package prg.sachin.dao;

import java.sql.Connection;
import java.util.ArrayList;

import prg.sachin.model.UploadPojo;

public interface UploadProjectDao {
public String insertProject(String filename,String datetime,Connection con);
public ArrayList<UploadPojo> readProject();
public String deleteProject(int sn,Connection con);
}
