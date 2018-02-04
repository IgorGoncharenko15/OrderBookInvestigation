package pkgBlockchain;

import java.util.Arrays;

public class Block {
    
    private int previousHash;
    private String[] transactions;
    
    private int blockHash;
    
    
    
    
    
    public Block(int x, String[] y){
        
        this.previousHash = x;
        this.transactions = y;      
        
        Object[] blockContent = {Arrays.hashCode(this.transactions),this.previousHash};
        
        this.blockHash = Arrays.hashCode(blockContent);
        
    }
    
    
    
    
    
    
    public int getPreviousHash(){
        return this.previousHash;
    }

    
    public String[] getTransactions(){
        return this.transactions;
    }
    
    
    public int getBlockHash(){
        return this.blockHash;
    }    
    
}
