package prg.sachin.dao;

import java.util.ArrayList;

import prg.sachin.model.ReadContentPojo;

public interface ContactDao {
 public String insertContact(String username,String email,String message,String datetime);
 public ArrayList<ReadContentPojo> readContact();
}
