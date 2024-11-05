package ifood_exercicio.entidades;

import java.util.ArrayList;

public class order extends Base {
    private String id;
    private String endereco;
    private String formaPagamento;
    private String statusEntrega;

    
    private promocao promocao;
    private ArrayList<historicodepagamento> historicodepagamentos;

    public promocao getPromocao() {
        return promocao;
    }
    public void setPromocao(promocao promocao) {
        this.promocao = promocao;
    }
    public ArrayList<historicodepagamento> getHistoricodepagamentos() {
        return historicodepagamentos;
    }
    public void setHistoricodepagamentos(ArrayList<historicodepagamento> historicodepagamentos) {
        this.historicodepagamentos = historicodepagamentos;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getStatusEntrega() {
        return statusEntrega;
    }
    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
    

    

}
