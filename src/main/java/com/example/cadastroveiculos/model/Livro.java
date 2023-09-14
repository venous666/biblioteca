package com.example.cadastroveiculos.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
public class Livro {
    @Id
    private long isbn;
    private String Nome;
    private String Nacionalidade;
    private int ano;
    private String capa;


    @ManyToOne
    private Genero fabricante;


    @ManyToOne
    private Autor categoria;
}
