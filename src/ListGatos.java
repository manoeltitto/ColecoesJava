import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ListGatos {

   public static void main(String[] args){
    //Duas formasd de add Gatos no List
    List <Gato> meusGatos = new ArrayList<>(){{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
       add(new Gato("Jon", 12, "amarelo"));
       add(new Gato("Cruel", 2, "cinza"));
    }};
 //add gatos na list
  Gato gato1 = new Gato("Garffild", 3, "amarelo");
  meusGatos.add(gato1);
    

   System.out.println("\nImprime por ordem de inserção");
    System.out.println(meusGatos);

    System.out.println("\nOrdem aleatória");
    Collections.shuffle(meusGatos);//bagunça tudo
    System.out.println(meusGatos);

    System.out.println("\nOrganizar em ordem natural");
    Collections.sort(meusGatos);//organiza tudo
    System.out.println(meusGatos);
   }
    
}


//criando a classe gato

class Gato implements Comparable<Gato>{
private String nome;
private Integer idade;
private String cor;

public Gato(String nome, Integer idade, String cor){
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
}

public String getNome(){
 return nome;   
}

public Integer getIdade(){
    return idade;
}
 public String getCor(){
    return cor;
 }


 @Override
public String toString() {
    return String.format("\nGato { nome = '%s', idade = %d, cor = '%s' }", nome, idade, cor);
}


//compara e organiza os nomes em ordem natural
@Override
public int compareTo(Gato gato){
    return this.getNome().compareToIgnoreCase(gato.getNome());

}


}


