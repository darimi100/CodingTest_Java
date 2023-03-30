import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String o = "";
        if (s.equals("1 2 3 4 5 6 7 8")){
            o = "ascending";
        }
        else if (s.equals("8 7 6 5 4 3 2 1")) {
            o = "descending";
        }
        else {
            o = "mixed";
        }
        System.out.print(o);
    }
}