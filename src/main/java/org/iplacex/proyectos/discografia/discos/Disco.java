package org.iplacex.proyectos.discografia.discos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("discos")
public class Disco {

    @Id
    public String _id;

    @Field(name = "idArtista")
    public String idArtista;

    @Field(name = "nombre")
    public String nombre;

    @Field(name = "anioLanzamiento")
    public int anioLanzamiento;

    @Field(name = "canciones")
    public List<String> canciones;
}
