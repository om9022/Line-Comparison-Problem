package com.Line_Comparison_Problem;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Line Comparison Computation" );
        int line1x1 = 0;
        int line1y1 = 0;
        
        int line1x2 = 0;
        int line1y2 = 8;
        Double LengthOfLine1 = Math.sqrt(Math.pow((line1x2-line1x1),2) + Math.pow((line1y2-line1y1),2));
        System.out.println("The length of line is:" + LengthOfLine1);
        
        int line2x1 = 0;
        int line2y1 = 0;
        
        int line2x2 = 0;
        int line2y2 = 6;
        Double LengthOfLine2 = Math.sqrt(Math.pow((line2x2-line2x1),2) + Math.pow((line2y2-line2y1),2));
        System.out.println("The length of line is:" + LengthOfLine2);
        
//        check two lines are equal
        if (LengthOfLine1.equals(LengthOfLine2)) {
        	System.out.println("The two lines are equal");
         }
        else {
        	System.out.println("The two lines are not equal");

        }
//        comparing 2 lines
        int compare = LengthOfLine1.compareTo(LengthOfLine2);
        if ( compare == 0) {
        	System.out.println("The Two Line are equal");
        }
        else if(compare < 0){
        	System.out.println("Line 2 is greater than Line 1 ");
        }
        else
        {
        	System.out.println("Line 1 is greater than Line 2");
        }
    }
}
