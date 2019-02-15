
package finalkeyword;


public class FinalKeyWord {

    
    public static void main(String[] args) {
        Final obj = new Final(10);
        
        for(int x=1;x<=5;x++){
            obj.add();
            System.out.printf("%s",obj);
        }
    }
    
}
