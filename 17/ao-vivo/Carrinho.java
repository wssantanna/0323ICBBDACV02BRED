import java.util.ArrayList;

public class Carrinho {

    private ArrayList<String> items;

    Carrinho() {
        this.items = new ArrayList<String>();
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItem(String item) {
        items.add(item);
    }

    public String getItem(int indice) {
        String itemEncontrado = items.get(indice);

        return itemEncontrado;
    }
}