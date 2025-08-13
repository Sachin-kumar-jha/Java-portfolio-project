 package prg.sachin.service;

import java.util.ArrayList;

import prg.sachin.model.ReadContentPojo;

public interface ContactService{
public String contactService1(String username,String email ,String message);
public String contactService2(String username,String email,String message);
public ArrayList<ReadContentPojo> readContactService();
}
