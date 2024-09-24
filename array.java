

public class array {
    public static void main(String[] args) {
        // int [] marks = new int[5];
        // marks[0] = 98;
        // marks[1] = 78;
        // marks[2] = 57;
        // marks[3] = 65;
        // marks[4] = 44;
        // System.out.println(marks[3]);

        // int [] marks = {78,87,45,90,56,98,23};
        // System.out.println(marks[4]);


        // array using for loop.
        int [] marks = {78,56,48,32,15,99,20};

        // for(int i=marks.length-1;i>=0;i--){
        //     System.out.println(marks[i]);
        // }

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // array using for each loop.
        for (int i : marks) {
            System.out.println(i);
            
        }


    }
    
}
