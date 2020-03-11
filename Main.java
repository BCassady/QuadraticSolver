import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean cando;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program will solve any quadratic given the 3 coefficients");
    System.out.println("Input the first coefficient");
    double a = sc.nextDouble();
    System.out.println("Input the second coefficient");
    double b = sc.nextDouble();
    System.out.println("Input the third coefficient");
    double c = sc.nextDouble();
    double Dis = (b * b) - 4 * a * c;
    if (Dis > -1) {
      cando = true;
    } else {
      cando = false;
    }
    if (cando == true) {
      double FirstZero = (-b + Math.sqrt(Dis)) / (2 * a);
      double SecondZero = (-b - Math.sqrt(Dis)) / (2 * a);
      System.out.println("The first zero is " + FirstZero);
      System.out.println("The second zero is " + SecondZero);
      if (a > 0) {
        System.out.println("The factored form is " + "(x+" + -FirstZero + ")" + "(x+" + -SecondZero + ")");
      } else {
        System.out.println("The factored form is " + "-(x+" + -FirstZero + ")" + "(x+" + -SecondZero + ")");
      }
    } else {
      double NegB = -b;
      double Sqrt = Math.sqrt(Math.abs(Dis));
      double TwoA = 2*a;
      System.out.println("The solutions are imaginary so this is as close as we can get:");
      System.out.println("The first zero is " + "(" + NegB + " + " + Sqrt + "i)/" + TwoA );
      System.out.println("The seoncd zero is " + "(" + NegB + " - " + Sqrt + "i)/" + TwoA );
    }

  }
}