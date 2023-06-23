package entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private List<ItemVenda> itens;

    public Venda() {
        this.id = 99;
        this.itens = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
}
