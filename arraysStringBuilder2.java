import java.lang.StringBuilder;

public class arraysStringBuilder2 {
    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder stringBuilderOut = new StringBuilder();
        for (String role : roles) {
            stringBuilderOut.append(role).append(":").append('\n');
            for (int z = 0; z < textLines.length; z++) {
                String string = textLines[z];
                if (string.startsWith(role + ":")) {
                    String string1 = string.replaceFirst(role + ":", z + 1 + ")");
                    stringBuilderOut.append(string1).append('\n');
                }
            }
            stringBuilderOut.append('\n');
        }
        return String.valueOf(stringBuilderOut);
    }

    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }
}
