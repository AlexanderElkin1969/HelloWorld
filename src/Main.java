public class Main {

    public static void main(String[] args) {
        String [] str = {"Привет",", ","МИР","Привет","МИР", "!","МИР","Привет","МИР", "!"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) continue;
            for (int j = i+1; j < str.length ; j++) {
                if (str[i].equals(str[j])) {
                    str[j] = "";
                }
            }
            System.out.print(str[i]);
        }
    }
}