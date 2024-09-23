import java.util.Scanner;

public class Main{

    public static boolean fibonnaci(int n){
        int v = 0;
        for(int i = 1; i < n; i = i+v){
            v += i;
        }
        if(v == n){
            return true;
        }else{
            v = 1;
            for(int i = 0; i < n; i = i+v){
                v += i;
            }
            if(v == n) {
                return true;
            }else return false;
        }
    }

    public static void main(String[] args) {
            System.out.println("Digite o número que deseja checar se está na sequência de fibonnaci: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(fibonnaci(n)){
                System.out.println("O número está na sequência de Fibonnaci");
            }else{
                System.out.println("O número não está na sequência de Fibonnaci");
            }
        }
    }