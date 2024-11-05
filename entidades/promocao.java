package ifood_exercicio.entidades;

import java.util.ArrayList;

import javafx.scene.chart.PieChart.Data;

public class promocao extends Base {
    
    private String nome;
    private String codigo;
    private float valor;
    private Data validade;
    private String tipo;
    private ArrayList<order> orders;
    public promocao(String nome, String codigo, float valor, Data validade, String tipo, ArrayList<order> orders) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.validade = validade;
        this.tipo = tipo;
        this.orders = orders;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Data getValidade() {
        return validade;
    }
    public void setValidade(Data validade) {
        this.validade = validade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<order> getOrders() {
        return orders;
    }
    public void setOrders(ArrayList<order> orders) {
        this.orders = orders;
    }
    
    
    
    
    
}
