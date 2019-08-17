
import scala.collection.mutable.Map

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum+=b
  def checksum : Int = ~(sum & 0xFF) + 1
}



object ChecksumAccumulator {

  val cache  = Map.empty[String, Int]

  def calculate(content : String): Int = {
    if (cache.contains(content))
      cache(content)
    else{
      val acc = new ChecksumAccumulator
      for (c <- content)
        acc.add(c.toByte)
      val cs = acc.checksum
      cache += (content -> cs)
      cs
    }

  }

}
