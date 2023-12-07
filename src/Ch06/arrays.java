package Ch06;
public class arrays {
    public static void main(String[] args){
        //  store marks of your friends

        // There are three ways to create an array in Java
        //! 1.Decleration and memory allocation
        // int [] marks = new int[5];

        //! 2.Decleration and then memory allocation 
        int [] marks;
        marks = new int[5];
        // Initialization
        //
        marks[0] = 65;
        marks[1] = 70;
        marks[2] = 78;
        marks[3] = 85;
        marks[4] = 98;
        //! 3.Decleration, memory allocation and initialization together.
        // int [] marks = {65, 75, 88, 98, 99};

        System.out.println(marks[0]);
        System.out.println(marks.length);

        // Displaying the array  using (for loop)
        System.out.println("Printing using for loop");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // Displaying the Array in Reverse order using for loop
        System.out.println("Printing using for loop in reverse order");
        for(int i = marks.length - 1; i>= 0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array using for each loop
        for(int element : marks){
            System.out.println(element);
        }
    }
}
