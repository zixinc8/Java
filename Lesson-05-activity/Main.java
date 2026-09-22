class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
        double a=2.0;
        double b=9.0;
        double A=a+b;
        System.out.println(A);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
        double d=98.0;
        double e=99.0;
        double f=96.0;
        double B=d+e+f;
        System.out.println(B);


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
        double C=(d+e+f)/3;
        System.out.println(C);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
        double g=24.0;
        double h=17.0;
        double D=g/(h+1.0);
        System.out.println(D);


/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
        double E=(2*h*(h+1.0)*(-h/2.0))/g;
        System.out.println(E);


/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
        double i=5.0;
        double j=6.0;
        double F=(1.0/2.0)*i*j;
        System.out.println(F);


/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/
        int x=100;
        int y=12;
        int z=x/y;
        System.out.println(z);
        int v=100-(z*12);
        System.out.println(v);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}