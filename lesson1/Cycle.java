public class Cycle { 
    public static void main(String[] args) {
        
      //Выведите на консоль с помощью цикла for все числа от [0, 20]
      //Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
      //Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]

        for(int cycle = 0; cycle <=20; cycle++) {
          System.out.println(cycle);

        int x = -6;
        while (x <= 6) {
          System.out.println(x);
          x = x + 2;

        int sum = 0 ;
        int z = 11;
        do {
          sum = sum + z;
          z = z + 2;
        } while (z < 20);
        System.out.println(sum);
   }  
  }
 }