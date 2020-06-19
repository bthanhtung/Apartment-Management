package main.ConnectDB;

import java.sql.Connection; 
import java.sql.Driver; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

/**  
 *  
 * 
 * @author ANHMATTROI  
 * recode NGOTRUNG
 */ 

public class KetNoi 
{      
    private Connection ket_noi;    
    private String chuoi_ket_noi;     
    private Driver driver; 
    public KetNoi()     
    {         
    ket_noi = null;         
        try{              
            driver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();             
            DriverManager.registerDriver(driver);         
        }         
        catch (SQLException ex)          
        {             
            ex.printStackTrace();         
        }         
     chuoi_ket_noi = "jdbc:sqlserver://CORLEONE\\SQLEXPRESS:1433;"
                    + "databaseName=ApartmentManagement; user=sa; password=sa";
    }     
     public boolean Mo()     
     {         
         try{             
             ket_noi = DriverManager.getConnection(chuoi_ket_noi);   
             System.out.println("Ket noi thanh cong!");
         }         
         catch(SQLException ex)         
         {             
             ex.printStackTrace();             
             System.out.println("Ket noi khong thanh cong!");
             return false;         
         }         
         return true;     
     } 
     public ResultSet LayDL(String str)     
     {         
         ResultSet bang = null;         
         try{             
             Statement lenh = this.ket_noi.createStatement();             
             bang = lenh.executeQuery(str);         
             System.out.println("Lay du lieu thanh cong!");
         }         
         catch(SQLException ex)         
         {             
             ex.printStackTrace();         
             System.out.println("Lay du lieu khong thanh cong!");
         }         
         return bang;     
     }   
    public boolean CapNhat(String str)     
    {         
        try{             
            Statement lenh = this.ket_noi.createStatement();             
            lenh.execute(str);         
        }         
        catch(SQLException ex)         
        {             
            ex.printStackTrace();             
            return false;         
        }         
        return true;     
    }   
     public void DongKetNoi()     
     {         
         if(this.ket_noi != null)         
         {             
             try              
             {                 
                 this.ket_noi.close();             
                 System.out.println("Dong ket noi thanh cong!");
             }              
             catch (SQLException ex)              
             {                 
                 ex.printStackTrace();             
                 System.out.println("Dong ket noi khong thanh cong!");
             }         
     }     
     } 
}
    