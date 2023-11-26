public class Queridas {
    public static String saudacao(String[] names) {

        if (names == null || names.length == 0) {
        
        return "Olá, meu amigo!";
        
        } else if (names.length == 1) {
        
        return "Olá, " + names[0] + "!";
        
        } else {
        
        StringBuilder saudacao = new StringBuilder("Olá, ");
        
        for (int i = 0; i < names.length - 1; i++) {
        
        saudacao.append(names[i]).append(" and ");
        
        }
        
        saudacao.append(names[names.length - 1]).append("!");
        
        return saudacao.toString();
        
        }
        
        }
}
