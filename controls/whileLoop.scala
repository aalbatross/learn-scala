
if(args.length == 0) throw new RuntimeException("Pass two argument as integer")

val a = args(0).toLong
val b = args(1).toLong

def gcd(x: Long, y: Long) :Long = {
  var a = x
  var b = y
  while(a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

println(gcd (a,b))

