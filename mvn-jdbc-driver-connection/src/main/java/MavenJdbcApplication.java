import org.bson.Document;

import java.sql.ResultSet;

public class MavenJdbcApplication {
    public static void main(String[] args) {
        ResultSet resultSet =  JdbcConnector.createSqlConnection("sqlUrl" , "root" , "****" , "sql Query");
        Document document = JdbcConnector.createMongoConnection("localhost" , 27017 , "db" , "collection" );
    }
}
