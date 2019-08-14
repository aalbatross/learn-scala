import scala.io.Source

if(args.length >0 ){
  var max = -1

  val lines = Source.fromFile(args(0)).getLines().toList

  for( line <- lines)
    if (max > line.length) max = line.length 
  
  val maxsize = (max + "").length

  for ( line <- lines){
    val padsize = maxsize - line.length.toString.length
    val pad = " " * padsize
    println(s"${line.length}${pad}|${line}")
  }
}
else
  Console.err.println("Please provide filename")
  
