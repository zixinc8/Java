
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

    void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Enter x:");
    double x = Input.readDouble();
    double y = Math.pow(x,7.0);
    System.out.println("The y is: "+y);
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Enter z:");
    double z = Input.readDouble();
    double q = Math.pow(z,3.0)+5.0;
    System.out.println("The q is: "+q);
/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
*/
    System.out.println("Enter t:");
    double t = Input.readDouble();
    System.out.println("Enter r:");
    double r = Input.readDouble();
    double s = Math.pow(t,5.0)*Math.pow(r+2.0,4.0);
    System.out.println("The s is: "+s);
/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
*/
    System.out.println("Enter A:");
    double A = Input.readDouble();
    System.out.println("Enter B:");
    double B = Input.readDouble();
    double C = Math.sqrt(A+B);
    System.out.println("The C is: "+C);
/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..  
*/
    System.out.println("Enter x1:");
    double X1 = Input.readDouble();
    System.out.println("Enter x2:");
    double X2 = Input.readDouble();
    System.out.println("Enter y1:");
    double Y1 = Input.readDouble();
    System.out.println("Enter y2:");
    double Y2 = Input.readDouble();
    double d = Math.sqrt(Math.pow(X2-X1,2.0)+Math.pow(Y2-Y1,2.0));
    System.out.println("The d is: "+d);
/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
*/
    System.out.println("Enter deg:");
    double deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println("The g is: "+g);
/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
*/
    System.out.println("Enter m:");
    double m = Input.readDouble();
    System.out.println("Enter n:");
    double n = Input.readDouble();
    double k = Math.pow(m,5.0)/Math.sqrt(n+1.0);
    System.out.println("The k is: "+k);
/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}