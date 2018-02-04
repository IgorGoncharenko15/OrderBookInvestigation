package pkgMain;

import java.util.Arrays;
import pkgBlockchain.Block;

public class run {

    public static void main(String[] args) {
            
        String[] list1 = {"a","b","c"};
        String[] list2 = {"a","d","c"};
        
        
        
        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
        
        String[] transactions_block1 = {"a 10","b 100"};
        Block b1ock1 = new Block(0,transactions_block1);
        
        String[] transactions_block2 = {"a 1000","x 100"};
        Block b1ock2 = new Block(b1ock1.getBlockHash(),transactions_block2);

        
        System.out.println("Done!");
    }
    
}
