class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }

  void print(String text){
	  System.out.println(text);
  }

  double FtoC(double F){
    double result = (F-32.0)/1.8;
    return result;
  }

  double sphereVolume(double r){
    double result = (4/3)*Math.PI*Math.pow(r,3);
    return result;	
  }

  double coneVolume(double r, double h){
    double result = (1/3)*Math.PI*(r*r)*h;
    return result;	
  }

  double distance(double x1, double x2, double y1, double y2){
    double result= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	  return result;	
  }

}