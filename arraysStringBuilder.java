
/*Требования:
1. Метод должен быть публичным.
2. Метод должен принимать на вход два массива строк.
3. Метод должен возвращать строку.
4. Результативная строка должна соответствовать уcловию.
5. Необходимо использовать StringBuilder*/

import java.lang.StringBuilder;


public class arraysStringBuilder {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        int textLength = textLines.length;
        int roleLength = roles.length;


        StringBuilder[] result = new StringBuilder[roles.length];

        for (int i = 0; i < roleLength; i++) {
            result[i] = new StringBuilder();
        }
        for (int i = 0; i < textLength; i++) {
            int roleEndPos = textLines[i].indexOf(':');
            String role = textLines[i].substring(0, roleEndPos);
            for (int j = 0; j < roleLength; j++) {
                if (role.equals(roles[j])) {
                    result[j].append(i + 1);
                    result[j].append(")");
                    result[j].append(textLines[i].substring(roleEndPos + 1));
                    if (textLines[i].charAt(textLines[i].length() - 1) != '\n') {
                        result[j].append("\n");
                    }
                }
            }
        }
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < roleLength; i++) {
            text.append(roles[i]);
            text.append(":\n");
            text.append(result[i]);
            text.append('\n');
        }
        return text.toString();
    }

    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));

    }
}
