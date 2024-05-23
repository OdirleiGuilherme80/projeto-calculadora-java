import java.util.Scanner;

public class CalculadoraEmJava {
    public static void main(String[] args) throws Exception {
       // double botao0 = 0; double botao1 = 1; double botao2 = 2; double botao3 = 3; double n4 = 4; double n5 = 5;
       // double botao6 = 6; double botao7 = 7; double botao8 = 8; double botao9 = 9; 

        Scanner scanner = new Scanner(System.in);
        
        numero n1 = new numero();
        numero n2 = new numero();
        numero resultado = new numero();
        String opc = "S";
        

        while (opc.equals("s") || opc.equals("S")) {
            System.out.printf("\nDigite o primeiro número: ");
            n1.setvalor(scanner.nextInt());

            System.out.printf("\nDigite o segundo  número: ");
            n2.setvalor(scanner.nextInt());

            resultado.setvalor(n1.getvalor() + n2.getvalor());

            System.out.printf("\nO resultado da sua soma de %d com %d é:  %d ", n1.getvalor(), n2.getvalor(), resultado.getvalor());
            System.out.printf("\n\n");
            System.out.printf("\ndeseja continuar calculando? para isso digite s ou S? ");
            opc= scanner.next();
            
            
            
        

        }
       
        
        
    }

}

