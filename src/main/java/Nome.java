public class Nome {
    public static String saudacao(String name) {

        if (name == null) {
        
        return "Olá, meu amigo!";
        
        } else {
        
        if (name.equals(name.toUpperCase())) {
        
        return "OLÁ, " + name + "!";
        
        } else {
        
        return "Olá, " + name + "!";
        
        }
        
        }
        
        }
}
