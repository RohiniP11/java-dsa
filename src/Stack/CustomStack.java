package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private CustomStack(){
        this(DEFAULT_SIZE);
    }

    private CustomStack(int size){
        this.data = new int[size];
    }
}
