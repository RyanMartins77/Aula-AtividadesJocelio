package ExProva;

public class fatorialExe {
    static void main(String[] args) {
        //funcao com fat com FOR
        int result = fatorial(4);
        System.out.println(result);
        // fatorial recursivo
        int fatorial01 = fatorialRecursivo(4);
        System.out.println(fatorial01);
    }

    public static int fatorialRecursivo(int numero){
      if (numero == 0){
          return 1;
      }
      return numero * fatorialRecursivo(numero - 1);
    }
    public static int fatorial(int numero){
        int fat = 1 ;
        for (int i =1; i <= numero; i++){
            fat = fat * i;
        }
        return fat;
    }

}
