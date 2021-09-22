import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        palindromofrase();
        palindromo();
    }

    private static void palindromo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregue una palabra o número para verificar si es palíndromo:");
        String entrada = scanner.nextLine();
        char[] caracteres = entrada.toCharArray();
        char[] volteado = new char[caracteres.length];
        int num = 0;
        for(int i = caracteres.length; i>0; i--){
            volteado[num] = caracteres[i-1];
            num++;
        }String volteado2 = new String(volteado);

        if(entrada.equalsIgnoreCase(volteado2)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

    }

    private static void palindromofrase() {

        Scanner entrada = new Scanner(System.in);
        StringBuffer frase, inversa;
        String s1, s2;
        System.out.println("Introduzca una frase para saber si se trata de un palíndromo");
        frase = new StringBuffer(entrada.nextLine());

        for (int i=0; i<frase.length(); i++){
            if (!Character.isLetter(frase.charAt(i))){
                frase.deleteCharAt(i);
            }else{
            }
        }

        inversa = new StringBuffer(frase);
        inversa.reverse();

        s1 = frase.toString();
        s2 = inversa.toString();

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("La frase es palíndromo");
        }else{
            System.out.println("La frase no es palíndromo");
        }

    }
}

