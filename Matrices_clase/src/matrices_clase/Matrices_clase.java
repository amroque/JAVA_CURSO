package matrices_clase;



public class Matrices_clase {
    public static void main(String[] args) {
        String mamiferos []= {"gato","perro","delfin","vaca","oso"};
        int bidimensional[][]={{1,2,3,10},
                               {4,5,6,11},
                               {7,8,9,12}};
        for (int i = 0; i < mamiferos.length; i++) {
            System.out.print(mamiferos[i]+  " ");
        }
        System.out.println();
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[0].length; j++) {
                System.out.print(bidimensional[i][j]+ " ");
                }
            System.out.println();
            
        }
        
     
            }
}
