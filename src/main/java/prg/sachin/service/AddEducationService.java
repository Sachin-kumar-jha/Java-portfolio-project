package prg.sachin.service;

import java.util.ArrayList;
import prg.sachin.model.ReadEducationPojo;

public interface AddEducationService {
public String addEducationService(int year,String title,String subtitle,String desc);
public String addEducationService2(int year,String title,String subtitle,String desc);
public ArrayList<ReadEducationPojo> readEducationService();
}
