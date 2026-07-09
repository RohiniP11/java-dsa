package rohini;

public class Scoop {
    public static void main(String[] args) {
        //scooping means were we ccan acces our variables
        int a = 10;
        int b = 20;
        
        {
           // int a = 78; //already initialized outside the block in the same method, hence yiu cannot initialize it again
            a = 78;
            int c = 99; //block scoop
            //values initialized in this block, will remain in bloack
            System.out.println(a);
        }
        int c = 45; //variable which is initialized in the block can be initialized outside the block
        System.out.println(a);
        // System.out.println(c); //cannot use it outside the block
    }
    
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
