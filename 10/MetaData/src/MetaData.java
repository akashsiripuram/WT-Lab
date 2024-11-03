import java.sql.*;
public class MetaData {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:/3306/";
        String username = "root";
        String password = "5002@hsakA";

        try(Connection conn=DriverManager.getConnection(url,username,password)){
            DatabaseMetaData metaData=conn.getMetaData();

            System.out.println("DataBase Product Name"+metaData.getDatabaseProductVersion());
            System.out.println("DataBase Product Name"+metaData.getDatabaseProductName());
            System.out.println("DataBase Product Name"+metaData.getDriverName());
            System.out.println("DataBase Product Name"+metaData.getDriverVersion());

            ResultSet tables=metaData.getTables(null,null,"%",new String[]{"TABLE_NAME"});
            while(tables.next()){
                String tableName=tables.getString("TABLE_NAME");
                
            }


        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
