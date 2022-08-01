import scala.io.StdIn.readInt;

object Q2 extends App{
    def oddEven(num:Int):String={
        num match{
            case num if num<=0 => "Negative/Zero";
            case num if num%2==0 => "Even Number";
            case num if num%2!=0 => "Odd Number";
        }
    }

    print("Enter an Integer: ");
    var y=readInt();
    print(oddEven(y));
}