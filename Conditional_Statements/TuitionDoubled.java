//Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every
//year. In how many years will the tuition be doubled?
package Conditional_Statements;

public class TuitionDoubled {

    public static void main(String[] args) {
      double tuition = 10000;
      double year = 0;

      while(tuition < 20000){
          tuition = tuition * 1.07;
          year ++;
      }
        System.out.println(year);
    }
}
