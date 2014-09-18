package itai;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String []str) throws Exception{
		
	    BufferedReader in =  new BufferedReader(new InputStreamReader(System.in, "UTF8"));
		while(true){
			handleOperation(in);
		}
	}
	

	public static void handleOperation(BufferedReader console) throws Exception{
        double result = 0;
		System.out.println("\n------------------");
		System.out.print("Enter number 1 please:");
        String s_nb1 = console.readLine();
        double n1 = Double.parseDouble(s_nb1);

		System.out.print("Enter operation please(0 for sum, 1 for multiply, 2 for divide):");
        String s_op1 = console.readLine();
        int op1 = Integer.parseInt(s_op1);

        System.out.print("Enter number 2 please:");
        String s_nb2 = console.readLine();
        double n2 = Double.parseDouble(s_nb2);
        
		System.out.print("Enter operation please(x for exit, 0 for sum, 1 for multiply, 2 for divide):");
        String s_op2 = console.readLine();
        if (s_op2.equals("x")){
            //tipul b op1
            result = calculate(n1, n2, op1);
            System.out.println("\nResult is: " + result);
            return;
        }
        
        int op2 = Integer.parseInt(s_op2);
        
        System.out.print("Enter number 3 please:");
        String s_nb3 = console.readLine();
        double n3 = Double.parseDouble(s_nb3);

        
        //tipul b op1
        result = calculate(n1, n2, op1);
        
        //tipul b op2
        result = calculate(result, n3, op2);
        
        System.out.println("\nResult is: " + result);
        
	}
	
	static double calculate(double n1, double n2, int op){
        if (op == 0){ // plus
        	return n1 + n2;
        }
        if (op == 1){ //multiply
        	return n1 * n2;
        }
        if (op == 2){
        	return n1 / n2;
        }
    	return n1 + n2;
	}

}
