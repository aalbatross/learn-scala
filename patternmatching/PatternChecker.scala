class PatternChecker {

  def check(x : Day): Int = {
    x match {
      case Sunday => 0
      case Monday => 1
      case Tuesday => 2
      case Wednesday => 3
      case Thursday => 4
      case Friday => 5
      case Saturday => 6
      case _ => -1
    }
  }

}
