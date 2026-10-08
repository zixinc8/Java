
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println(isGraduating(12,50));

  }

	double gpa(double GPA){
		if(GPA > 90)
			return GPA*1.1;
		else
			return GPA;
	}

	boolean isGraduating(int gradeLV,double credits){
		if(gradeLV == 12 && credits >= 44)
			return true;
		else
			return false;
	}

	String bmi(double weightP,double heightI){
		double BMI=703.*(weightP/(heightI*heightI));
		if(BMI <= 18.4)
			return "Underweight";
		else if(BMI <= 24.9)
			return "Normal";
		else if(BMI <= 39.9)
			return "Overweight";
		else
			return "Obese";
	}

	double shippingCost(double pounds){
		if(pounds <= 10)
			return 0.00;
		else if(pounds <= 15)
			return 5.00;
		else if(pounds <= 25)
			return 10.00;
		else
			return 10.02;
	}

	boolean blueOrViolet(double blueF,double violetF){
		if(blueF >= 600 && blueF <=760 || violetF >= 700 && violetF <= 750)
			return true;
		else
			return false;
	}

}