import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRandom {
    public static void main(String[] args) throws Exception {

List <Integer> nota = new ArrayList<>();
Random random = new Random(10);

for(int i = 0; i < 10; i++){
    nota.add(random.nextInt());
}

for (Integer imprimir: nota){
    System.out.println(imprimir);
}
        
    }
}
