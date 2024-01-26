// import java.util.ArrayList;
import java.util.Scanner;

public class punnetsquare {
    public static void main(String args []) {
        // System.out.print.ln("How many sets of allels?");
        System.out.println("What is the first set of alleles?");
        Scanner firstSet = new Scanner(System.in); 
        System.out.println("");
        String inputFirstSet = firstSet.nextLine();
        System.out.println("");
        System.out.println("What is the second set of alleles?");
        Scanner secondSet = new Scanner(System.in);
        System.out.println("");
        String inputSecondSet = secondSet.nextLine();

        char firstAlleleFirstSet = inputFirstSet.charAt(0);
        char secondAlleleFirstSet = inputFirstSet.charAt(1);
        char firstAlleleSecondSet = inputFirstSet.charAt(0);
        char secondAlleleSecondSet = inputSecondSet.charAt(1);

                // Arraylist<String> list = new ArrayList<String>();

                // list.add(firstAlleleFirstSet);
                // list.add(secondAlleleFirstSet);
                // list.add(firstAlleleSecondSet);
                // list.add(secondAlleleSecondSet);
                // System.out.println(list);

        System.out.println("");  
        System.out.println("Genetic Offspring");
        System.out.println("_________________");              
        System.out.print(firstAlleleFirstSet);
        System.out.println(secondAlleleSecondSet);
        System.out.print(firstAlleleFirstSet);
        System.out.println(firstAlleleSecondSet);
        System.out.print(secondAlleleFirstSet);
        System.out.println(secondAlleleSecondSet);
        System.out.print(firstAlleleFirstSet);
        System.out.println(firstAlleleSecondSet);
            
        //next make codon to anticodon translate to amino acid TAC-AUG-Methionine
        //include stop codons and uracil only in anticodon translation


    }
    
}