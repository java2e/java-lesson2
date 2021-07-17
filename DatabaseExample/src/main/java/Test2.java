import service.DBUtil;

import java.sql.ResultSet;

public class Test2 {

    public static void main(String[] args) {
        try{

            //Connection connection = DriverManager.getConnection(service.DBUtil.url,service.DBUtil.username,service.DBUtil.password);

            String sql ="select f.title,count(f.title) as total from film f " +
                    "inner join inventory i on f.film_id = i.film_id  " +
                    "where i.last_update > '02/01/2006' and i.last_update < '02/28/2006' " +
                    "group by f.title " +
                    "order by total desc";


            //PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = DBUtil.getResult(sql);

            while (resultSet.next()){
                String filmAdi = resultSet.getString(1);
                int toplam = resultSet.getInt(2);

                System.out.println(filmAdi+" "+toplam);
            }



        }
        catch (Exception ex){
            System.out.println(ex.getCause());
        }
    }
}
