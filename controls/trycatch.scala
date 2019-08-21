import java.io._

try {
  val f = new FileReader("input.txt")
}
catch {
  case ex : FileNotFoundException => println("Couldnot locate file")
  case ex : IOException => println("Cannot open or close file")
}

