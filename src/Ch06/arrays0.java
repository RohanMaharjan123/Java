package Ch6;

public class arrays0 {
    public static void main(String[] args) {
        // int [] marks = new int[3];
        int marks[] = new int[3];  //int marks[] = {95, 97, 98};
        marks[0] =  95;
        marks[1] =  97;
        marks[2] =  98;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
