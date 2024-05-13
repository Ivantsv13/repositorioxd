package controlador;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class UsuarioDAO {
    private final MongoCollection<Document> collection;

    public UsuarioDAO() {
        String connectionString = "mongodb+srv://jose67ivan:ceferino@cluster0.q0yhudv.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        ConnectionString connString = new ConnectionString(connectionString);
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .build();

        MongoClient mongoClient = MongoClients.create(settings);

        MongoDatabase database = mongoClient.getDatabase("loginusuario");
        collection = database.getCollection("coleccionusuario");
    }

    public Document obtenerUsuarioPorCredenciales(String usuario, String contrasena) {
        Document query = new Document("usuario", usuario).append("contrasena", contrasena);
        return collection.find(query).first();
    }
}

