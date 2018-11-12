package edu.neu.coe.info6205.symbolTable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.Random;
import java.lang.Math;


public class Main {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		int numberOfOperation=50000;
		
		
		int numberOfNode=100;//100 nodes
		
		
		//int numberOfKey=numberOfNode*2;
		int buffer=0;  //key value 0~199
		
		
		int [] node=new int[11];
		int [] len=new int[11];
		double [] sqr=new double[11];
		double [] log=new double[11];
		int count=0;

    	BSTSimple<Integer, Integer> bst=new BSTSimple<Integer, Integer>();
    	
    	System.out.println(numberOfOperation);
  
    	for(int num=numberOfNode;num<=10100;num+=1000) 
    	{
    		
    		int numberOfKey=num/2;
    	
    		for(int i =0;i<num;i++)
    		{
    			bst.put(ran.nextInt(numberOfKey),1);   			
    		}

    		for(int j =0;j<numberOfOperation;j++)
    		{	

    				int insertOrdelete =ran.nextInt(2);				
    				int keyToDeleteOrInsert=ran.nextInt(numberOfKey);
    				if(insertOrdelete==0)
    					bst.delete(keyToDeleteOrInsert);

    				if(insertOrdelete==1)
    					bst.put(keyToDeleteOrInsert,1);  	
    				
    		}
    		node[count]=num;
    		len[count]=bst.getlargeDepth();
            sqr[count]=Math.sqrt(num);
            log[count]=Math.log(num)/Math.log(2);
    	    count++;
    	}
    	for(int j =0;j<11;j++)
        { 
          System.out.print(node[j]+"	"+len[j]+"	"+sqr[j]+"	"+log[j]);
          System.out.println();
          
        }


	}

}
