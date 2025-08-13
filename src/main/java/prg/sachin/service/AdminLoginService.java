package prg.sachin.service;

import prg.sachin.model.ReadAdminPojo;

public interface AdminLoginService {
public String adminLoginservice1(String username,String password);
public String adminLoginservie2(String username ,String password);
public ReadAdminPojo readAdminloginService();
public String changeAdminCredential1(String username,String password);
public String changeAdminCredential2(String sn,String username,String password);
}
