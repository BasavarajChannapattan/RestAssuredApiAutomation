package Java_Oops.BasicPrograms;

public class Factor {
    public static void main(String[] args) {

        int num =5, factor =1;

        for (int i =1; i<=num; i++)
        {
            factor*=i;
            System.out.println("debug");
        }

        System.out.println(factor);
    }
}
