
package finalkeyword;


public class Final {
    private int sum;
    private final int number;
    
    public Final(int x){
        number = x;
    }
    public void add(){
        sum+=number;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
