import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * jdbc connection with mysql
 * java connection with mongoDB with MongoClient
 */
@SuppressWarnings("unchecked")
public class JdbcConnector {
    public static ResultSet createSqlConnection(String sqlUrl , String username , String password , String sqlQuery){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlUrl , username , password);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            conn.close();
            return resultSet;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    public static Document createMongoConnection(String host , Integer port ,String databaseName , String collectionName ){
        try {
            MongoClient mongoClient = new MongoClient(host , port);
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            MongoCollection<Document> collection =  database.getCollection(collectionName);

            Document document = (Document) collection.find();
            return document;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
