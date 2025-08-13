package prg.sachin.dao;

import java.util.ArrayList;


import prg.sachin.model.ReadEducationPojo;

public interface AddEducationDao {
public String addeduationDao(int year,String title,String subtitle,String desc);
public ArrayList<ReadEducationPojo> readEducation();
}
