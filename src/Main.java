public class Main {

    public static void main(String[] args) {
        String[] str = {"Привет", ", ", "МИР", "Привет", "МИР", "!", "МИР", "Привет", "МИР", "!"};
        String rezult = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) continue;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    str[j] = "";                                    //   удаляем дубли
                }
            }
            System.out.print(str[i]);
            rezult +=  str[i];
            sb.append(str[i]);
        }
        System.out.println("\n" + rezult);
        System.out.println(sb);
    }
}