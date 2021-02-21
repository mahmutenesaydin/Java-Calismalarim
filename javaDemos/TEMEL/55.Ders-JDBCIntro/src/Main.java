import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        try
        {
            connection = dbHelper.getConnection();
            String sql = "delete from city where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,4);
            preparedStatement.executeUpdate();
            System.out.println("Kayıt Silindi");
        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            preparedStatement.close();
            connection.close();
        }
    }


         /*-------------------*/


    public static void updateData() throws SQLException
    {       Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        try
        {
            connection = dbHelper.getConnection();
            String sql = "update city set Population=18200, District='Mea' where id=1";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            System.out.println("Kayıt Güncellendi");
        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            preparedStatement.close();
            connection.close();
        }}


    /*-------------------*/


    public static void insertData() throws SQLException
    {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        try
        {
            connection = dbHelper.getConnection();
            preparedStatement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Aydin','TUR', 'AYD', '17000')");
            preparedStatement.executeUpdate();
            System.out.println("Kayıt Eklendi");
        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            preparedStatement.close();
            connection.close();
        }
    }



    /*-------------------*/


    public static void selectDemo() throws SQLException
    {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;  //sql sorguları
        ResultSet resultSet;  //sorguları dönderecek

        try
        {
            connection = dbHelper.getConnection();
            //   System.out.println("Bağlandı");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next())
            {
                // System.out.println(resultSet.getString("Name"));

                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println(countries.size());
        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            connection.close();
        }
    }
}