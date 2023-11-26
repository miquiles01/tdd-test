public class Prezados {
    public static String saudacao(String[] names) {

        if (names == null || names.length == 0) {
        
        return "Olá, meu amigo!";
        
        } else if (names.length == 1) {
        
        return "Olá, " + names[0] + "!";
        
        } else if (names.length == 2) {
        
        return "Olá, " + names[0] + " and " + names[1] + "!";
        
        } else {
        
        StringBuilder saudacao = new StringBuilder("Olá, ");
        
        for (int i = 0; i < names.length - 2; i++) {
        
        saudacao.append(names[i]).append(", ");
        
        }
        
        saudacao.append(names[names.length - 2]).append(" and ").append(names[names.length - 1]).append("!");
        
        return saudacao.toString();
        
        }
        
        }
}
