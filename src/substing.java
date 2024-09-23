import java.util.Scanner;

public class substing {
    public static void main(String[] args) {
        System.out.println("Digite uma string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Digite o carctere que deseja buscar: ");
        char c = sc.next().charAt(0);
        sc.close();
        int cont = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)) {
                cont++;
            }
        }
        System.out.println("O caractere apareceu "+cont+" vezes");
    }
}
