class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  int creditCardType(String card){
    if(card.equalsIgnoreCase("visa"))
      return 4;
    if(card.equalsIgnoreCase("america express"))
      return 34;
    if(card.equalsIgnoreCase("diner club"))
      return 36;
    if(card.equalsIgnoreCase("mastercard"))
      return 55;
    if(card.equalsIgnoreCase("discovery"))
      return 65;
  }
  
  String pigLatin(String word){
    
  }
  
}