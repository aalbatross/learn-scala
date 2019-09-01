package org.aalbatross.learn

class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0)

  val num = numerator
  val denom = denominator

  def +(that: Rational): Rational = {
    new Rational((num * that.denom) + (that.num * denom), denom * that.denom)
  }

  def -(that: Rational): Rational = {
    new Rational((num * that.denom) - (that.num * denom), denom * that.denom)
  }

  override def toString: String = {
    num + "/" + denom
  }
}

object Rational {
  def apply(numerator: Int, denominator: Int): Rational =
    new Rational(numerator, denominator)
}
