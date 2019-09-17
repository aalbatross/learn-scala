package org.aalbatross.learn

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

  test("rational number cannot have negative denominators") {
    assertThrows[IllegalArgumentException] {
      new Rational(3, 0)
    }
  }

  test("rational number to string") {
    assert("1/2" == Rational(1, 2).toString)
  }

  test("sum result") {
    assert("9/9" == (Rational(2, 3) + Rational(1, 3)).toString)
  }

  test("diff result") {
    assert("3/9" == (Rational(2, 3) - Rational(1, 3)).toString)
  }
}
