package ico.fes.intro.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ico.fes.intro.model.Personaje;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Peticion {
    // Objeto para la consulta
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    // Objecto para formatear la consulta [String -> Object]
    final ObjectMapper mapper = new ObjectMapper();
    public static List<Personaje> personajes;


    public Peticion(){
        final HttpRequest peticionAPI = HttpRequest.newBuilder().GET().uri(URI.create("https://rickandmortyapi.com/api/character/1,2,3,4,5,6,7,8,9,10")).build();

        try{
            final HttpResponse<String> respuesta = httpClient.send(peticionAPI, HttpResponse.BodyHandlers.ofString());
            personajes = converetirObjecto(respuesta.body(), new TypeReference<List<Personaje>>(){});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public <T> T converetirObjecto(final String json,final TypeReference<T> referencia){
        try {
            return this.mapper.readValue(json, referencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
