public class ConditionalStatement { 
    public static void main(String[] args) {

int yourAge = 27;
if (yourAge > 20) {
    System.out.println ("it's time to get serious");
}


boolean isMan = true;
  if (isMan) {
    System.out.println ("Man");
}
  if (!isMan) {
    System.out.println ("Woman");
  }


double yourHeight = 1.83;
  if (yourHeight < 1.80) {
    System.out.println ("high");
} else {
    System.out.println ("low");
}


char yourNameStartsWithTheLetterM = 'M';
char yourNameStartsWithTheLetterA = 'A';
  if (yourNameStartsWithTheLetterM == 'M') {
    System.out.println ("beautiful name");
} else if (yourNameStartsWithTheLetterA == 'A') {
    System.out.println ("very beautiful name");
} else {
    System.out.println ("beautiful name");
  }
}
}