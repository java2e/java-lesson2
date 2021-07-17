import service.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args) {
// jdbc:veritabanıIsmi://IP:PORT/VERİTABANI ADI
        /*
        jdbc:mysql://localhost:3632/test
        jdbc:oracle://ip:port/veritaabıismi
         */
       String url="jdbc:postgresql://127.0.0.1:5433/dvdrental"; // jdbc url
        String username="postgres";
        String password="root";

        try{
            //Connection connection = DriverManager.getConnection(url,username,password);

            String sql="select * from actor";//1 kolon getirecek
            PreparedStatement statement= DBUtil.getConnection().prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            String sqlUpdate = "update set first_name='Java' actor where id=1";

            statement = DBUtil.getConnection().prepareStatement(sqlUpdate);

            boolean calistiMi = statement.execute();

            while (resultSet.next())
            {
                String id = resultSet.getString(1);
                String adi =resultSet.getString("first_name");
                String soyadi = resultSet.getString(3);
                String guncellemeTarihi = resultSet.getString(4);
                System.out.println(id+" "+adi+" "+soyadi+" "+guncellemeTarihi);
            }


            System.out.println("Connection Success!");

        }
        catch (Exception ex){

            System.out.println("Connection Fail!");
        }




    }
}
