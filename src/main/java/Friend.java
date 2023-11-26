import java.util.Arrays;

public class Friend {
    public static String saudacao(String[] names) {

if (names == null || names.length == 0) {

return "Olá, meu amigo!";

} else if (names.length == 1) {

return saudacaoIndividual(names[0]);

} else {

StringBuilder saudacaoNormal = new StringBuilder("Olá, ");

StringBuilder saudacaoGritada = new StringBuilder();

for (String name : names) {

String[] subNames = splitEscaped(name);

for (String subName : subNames) {

if (subName.equals(subName.toUpperCase())) {

saudacaoGritada.append(saudacaoIndividual(subName)).append(" ");

} else {

saudacaoNormal.append(subName).append(" ");

}

}

}

return saudacaoNormal.toString().trim() + ". E " + saudacaoGritada.toString().trim();

}

}

private static String saudacaoIndividual(String name) {

return "OLÁ " + name + "!";

}

private static String[] splitEscaped(String input) {

return Arrays.stream(input.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"))

.map(String::trim)

.toArray(String[]::new);

}

}
