package arquitetura;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class ClasseDriver
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      List<String> teste = new ArrayList<String>();
      DecimalFormat df = new DecimalFormat("000");
      Relatorio relatorio = new Relatorio();

      int opcao;
      int idade;
      String n= "";
      String p = "";

      while(true)
      {
         System.out.println("\n Escolha uma opçao:\n\n"
                           +" 1 - Inserir nome do cliente\n"
                           +" 2 - Consultar nomes\n"
                           +" 3 - Sair\n");

         System.out.print(" Opção escolhida: ");
         opcao = scan.nextInt();

         switch(opcao)
         {
            case 1:
               scan.nextLine();
               System.out.print("\nNome: ");
               n=(scan.nextLine());
               if(n.length()<=5){
                   System.out.println("Erro!");
               }
              
               
               for(int i=0; i<teste.size(); i++){
                   
                   if(n.equals(teste.getNome(i))){
                      System.out.println("Nome já existe!");
                   }else{
                        relatorio.setNome(n);
                    }
               }
               System.out.print("\nTelefone: ");
               relatorio.setTelefone(scan.nextLine());
               System.out.print("\nDigite sua idade: ");
               idade = (scan.nextInt());
               if(idade <= 18) {
                   relatorio.setLimitec("100");
               }else if(idade>=18 && idade <=35){
                   relatorio.setLimitec("300");
               }else{
                   relatorio.setLimitec("500");
               }
                   
               
           
               System.out.print("\nPais: ");
               p=(scan.nextLine());
               if(p == null){
                   System.out.println("Erro!");
               }else{
                   relatorio.setPais(p);
               }
               
               
               
               relatorio.listagem(opcao);
            break;
            case 2:
                teste.addAll(relatorio.listagem(opcao));
               System.out.println("\nLista");

               for(int i = 0; i < teste.size(); i++)
               {
                  System.out.println("\n" + df.format((i+1)) + " " + teste.get(i));
               }

               System.exit(0);
            break;
            case 3:
               System.exit(0);
            break;
            default:
               System.out.println("\nOpção inexistente! Tente novamente.\n\n");
         }
      }
   }
}