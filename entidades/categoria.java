package ifood_exercicio.entidades;

import java.util.ArrayList;
import java.util.List;

public class categoria extends Base{


    private String nome;
    private String descricao;
    private String tipo_categoria;
    
    public categoria(String nome, String descricao, String tipo_categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo_categoria = tipo_categoria;
       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo_categoria() {
        return tipo_categoria;
    }

    public void setTipo_categoria(String tipo_categoria) {
        this.tipo_categoria = tipo_categoria;
    }
    
}
