object Q1 extends App{
  def interest(amount: Double): Double ={
    if(amount<20000){
      return amount*0.02;
    }
    else if(amount<200000) {
      return amount*0.04;
    }
    else if(amount<2000000){
      return amount*0.035;
    }
    else{
      return amount*0.065;
    }
  }
  printf("%.2f",interest(5000));
}
