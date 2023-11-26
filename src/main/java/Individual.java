public class Individual {
    public static String saudacao(String[] names) {

        if (names == null || names.length == 0) {
        
        return "Olá, meu amigo!";
        
        } else if (names.length == 1) {
        
        return saudacaoIndividual(names[0]);
        
        } else {
        
        StringBuilder saudacaoNormal = new StringBuilder("Olá, ");
        
        StringBuilder saudacaoGritada = new StringBuilder();
        
        for (String name : names) {
        
        if (name.equals(name.toUpperCase())) {
        
        saudacaoGritada.append(saudacaoIndividual(name)).append(" ");
        
        } else {
        
        saudacaoNormal.append(name).append(" ");
        
        }
        
        }
        
        return saudacaoNormal.toString().trim() + ". E " + saudacaoGritada.toString().trim();
        
        }
        
        }
        
        private static String saudacaoIndividual(String name) {
        
        return "OLÁ " + name + "!";
        
        }
}
