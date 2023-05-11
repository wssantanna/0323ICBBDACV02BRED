import java.util.HashMap;

public class Cores {
    
    private HashMap<String, String> cores;

    public Cores() {
        cores = new HashMap<String, String>();
    }
    
    public HashMap<String, String> getCores() {
        
        return cores;
    }

    public void setCor(String nome, String hexadecimal) {
        cores.put(nome, hexadecimal);
    }

    public String getHexadecimal(String nome) {
        String hexadecimal = cores.get(nome);

        return hexadecimal;
    }
}
