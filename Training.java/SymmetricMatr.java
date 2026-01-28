import java.util.*;
class  SymmetricMatr{
    // Step 1: Create HashMap
    HashMap<String, Integer> map = new HashMap<>();
    // Step 2: Store element
    void putElement(int i,int j,int x) {
        if (i<=j) {
            map.put(i+ ","+j,x);
        } else{
            map.put(j+ ","+i,x);
        }
    }
    // Step 3: Get element
    int getElement(int i, int j) {
        String key;

        if(i<=j) {
            key=i+","+j;
        } else {
            key= j+","+i;
        }

        if(map.containsKey(key)) {
            return map.get(key);
        } else {
            return 0;
        }
    }
    // Step 4: example
    public static void main(String[] args) {
        SymmetricMatr sm = new SymmetricMatr();
        sm.putElement(2,1,10);
        sm.putElement(0,3,5);
        System.out.println(sm.getElement(1, 2));
        System.out.println(sm.getElement(2, 1)); 
        System.out.println(sm.getElement(3, 0)); 
        System.out.println(sm.getElement(0, 3)); 
    }
}
