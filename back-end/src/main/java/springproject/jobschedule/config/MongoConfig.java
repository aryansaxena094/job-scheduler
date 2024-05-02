package springproject.jobschedule.config;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {
    public static MongoClient mongoClient() {
        String connectionString = "mongodb+srv://aryan:mongopass@db1.jxf128m.mongodb.net/";
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(new ConnectionString(connectionString))
            .build();

        return MongoClients.create(settings);
    }
}
