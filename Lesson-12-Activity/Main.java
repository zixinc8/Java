class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String card){
    if(card.substring(0,1).equals("4"))
      return "america express";
    else if(card.substring(0,2).equals("34"))||
      (card.substring(0,2).equals("37"))
      return "visa";
    else if(card.substring(0,2).equals("51"))||
      (card.substring(0,2).equals("55"))
      return "mastercard";
    else if(card.substring(0,2).equals("36"))
      return "diner club";
    else if(card.substring(0,2).equals("65"))||
      (card.substring(0,4).equals("6011"))
      return "discover";
    else
      return "unknown card";
  }
  
  String pigLatin(String word){
    return word.substring(1)+word.substring(0,1)+"ay";
  }
  
  String nycLocate(String zip){
    String pre = zip.substring(0,3);

    if(per.equals("100")||pre.equals("101")||pre.equals("102"))
      return "manhattan";
    else if(per.equals("103"))
      return "staten island";
    else if(per.equals("104"))
      return "bronx";
    else if(per.equals("112"))
      return "brooklyn";
    else if(per.equals("113")||pre.equals("111")||pre.equals("114"))
      return "queens";
    else
      return "unknown";
  }

}