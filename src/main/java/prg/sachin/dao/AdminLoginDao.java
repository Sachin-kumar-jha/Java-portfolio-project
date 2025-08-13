package prg.sachin.dao;

import prg.sachin.model.ReadAdminPojo;

public interface AdminLoginDao {
   public String readAdminLogin(String username,String password);
   public ReadAdminPojo readAdminLoginData();
   public String changeAdminCredentialDao(int sn,String username,String password);
}
