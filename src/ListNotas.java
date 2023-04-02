import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class ListNotas {
    public static void main(String[] args) throws Exception {

List <Double> nota = new ArrayList<>();
Scanner teclado = new Scanner(System.in);

for(int i = 0; i<3; i++){
   System.out.println("Nota " + (i+1) + " do Aluno...");
double recebeNota = teclado.nextDouble();
  nota.add(recebeNota);
    }

   for(double imprimir: nota){
     System.out.println(imprimir);

   }
   System.out.println("Escolha uma nota para buscar");
    double buscaNota = teclado.nextDouble();
    System.out.println("Posição da Nota.." + (nota.indexOf(buscaNota)+1));

    System.out.println("Adicione na Lista uma nota na posição 3..");
    nota.add(3, 8.5d);

    for(double imprimir: nota){
        System.out.println(imprimir);

    }

    System.out.println("Substitua a nota da posicao 0 pela nota 6.0");
    nota.set(0, 6d);
   
        System.out.println(nota);

    System.out.println("Confira se a nota 5.0 está na lista: "+ nota.contains(5d));
    System.out.println("Exiba a nota da posição 3 : "+ nota.get(2));

    System.out.println("Exiba a menor nota: " + Collections.min(nota)); 
    //uma list é uma Collection. e a Colletions possui métodos nativos
    System.out.println("Exiba a maior nota: " + Collections.max(nota)); 
    
    Collections.sort(nota);
    System.out.println("Lista Ordenada de Notas " + nota);
//somando as notas de List usando iterator e hasNext
Iterator<Double> iterator = nota.iterator();
Double soma= 0d;
while(iterator.hasNext()){
    Double next = iterator.next();
    soma+=next;
}

System.out.println("Exiba a soma das nota: " +soma); 

System.out.println("Exiba a média das nota: " + (soma/nota.size()));     

System.out.println("Remova a nota Zero: ");
nota.remove(0);//remove a posição zero
nota.remove(0d); //este formato com 'd' dobule indica o valor zero
System.out.println(nota);


System.out.println("Remova as notas menores que sete(7): ");
Iterator<Double> iterator1 = nota.iterator();
while(iterator1.hasNext()){
    Double next = iterator1.next();
    if(next < 7) iterator1.remove();
}
System.out.println(nota);

System.out.println("Apague toda a Lista");
nota.clear();

System.out.println("Confira se a List nota está vazia: " + nota.isEmpty());

if(nota.isEmpty()){
    System.out.println("Sua Lista está vazia....");
}else{
System.out.println(nota);
}




}
}

