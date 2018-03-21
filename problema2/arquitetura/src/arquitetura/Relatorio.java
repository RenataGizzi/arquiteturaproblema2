package arquitetura;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Relatorio
{
   List<String> nomes = new ArrayList<String>();

   private String nome;
   private String pais;
   private String sigla; 
   private String telefone;
   private String limitec;


   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }
   
   public String getPais()
   {
      return pais;
   }

   public void setPais(String pais)
   {
      this.pais = pais;
      
   }
   
    public String getSigla()
   {
      return sigla;
   }

   public void setSigla(String sigla)
   {
      this.sigla = sigla;
   }
   public String getTelefone()
   {
      return telefone;
   }

   public void setTelefone(String nome)
   {
      this.telefone = telefone;
   }
   
   public String getLimitec()
   {
      return limitec;
   }

   public void setLimitec(String limitec)
   {
      this.limitec = limitec;
   }
   

   public List<String> listagem(int selecao)
   {  
      if(selecao == 1)
      {
         nomes.add(getNome());
         nomes.add(getTelefone());
         nomes.add(getPais());
         nomes.add(getSigla());
         nomes.add(getLimitec());
      }

      return nomes;
   }

}