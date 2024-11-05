package ifood_exercicio.entidades;

public class restaurantepagamento extends Base {
    
   
    
    private formadepagamento formadepagamento;
    private restaurante restaurante;
    
    public restaurantepagamento(ifood_exercicio.entidades.formadepagamento formadepagamento,
            ifood_exercicio.entidades.restaurante restaurante) {
        this.formadepagamento = formadepagamento;
        this.restaurante = restaurante;
    }
    public formadepagamento getFormadepagamento() {
        return formadepagamento;
    }
    public void setFormadepagamento(formadepagamento formadepagamento) {
        this.formadepagamento = formadepagamento;
    }
    public restaurante getRestaurante() {
        return restaurante;
    }
    public void setRestaurante(restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    
    
    
}
