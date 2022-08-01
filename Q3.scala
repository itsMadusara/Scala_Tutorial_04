object Q3 extends App{

    def toUpper(str: String):String= str.toUpperCase();
    def toLower(str: String):String= str.toLowerCase();

    def formatNames(name: String)(index: Int*)(function: String=>String):String={
        if(index.isEmpty){
            return function(name);
        }
        var temp = "";
        var i = 0;
        while(i < name.length()){
            if(index.contains(i)){
                temp = temp + function(name.charAt(i).toString);
            }
            else{
                temp = temp + name.charAt(i).toString;
            }
            i = i + 1;
        }
        return temp;
    };

    println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(0,1)(toUpper));
    println(formatNames("SAMAN")()(toLower));
    println(formatNames("Kumara")(0,5)(toUpper));

}