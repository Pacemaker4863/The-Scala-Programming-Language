object Ex2 {
  def main(args: Array[String]): Unit = {
    val greetStrings: Array[String] = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for i <- 0 to 2 do
      print(greetStrings(i))
  }
}