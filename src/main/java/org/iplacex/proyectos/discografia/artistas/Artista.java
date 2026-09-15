package org.iplacex.proyectos.discografia.artistas;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("artistas")
public class Artista {

    @Id
    public String _id;

    @Field(name = "nombre")
    public String nombre;

    @Field(name = "estilos")
    public List<String> estilos;

    @Field(name = "anioFundacion")
    public int anioFundacion;

    @Field(name = "estaActivo")
    public boolean estaActivo;
}
