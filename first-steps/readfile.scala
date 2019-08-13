import scala.io.Source

if(args.length >0 ){
  var max=-1;
  for( line <- Source.fromFile(args(0)).getLines())
    if (max > line.length) max = line.length 
  
  val size = (max + "").length


}
else
  Console.err.println("Please provide filename")
  
