import scala.collection.mutable
import scala.collection.immutable.HashSet

object Ex3 {
  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)

    greetStrings.update(0, "Hello")
    greetStrings.update(1, ", ")
    greetStrings.update(2, "world!\n")

    for i <- 0 to 2 do
      print(greetStrings.apply(i))

    // lists
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
    for num <- oneTwoThreeFour do
      println(num)


    val sixSeven = List(6, 7)
    val fiveSixSeven = 5 :: sixSeven
    println(fiveSixSeven)

    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)

    // tuples
    val pair = (99, "Luftballons")
    val num = pair(0)
    val what = pair(1)
    println(num + " " + what)

    // Sets and maps
    var jetSet = Set("Boeing", "Airbus")
    val query = jetSet.contains("Cessna")
    println(jetSet)
    println(query)

    jetSet = jetSet + "Lear"
    println(jetSet)

    // Mutable Set
    val movieSet = mutable.Set("Spotlight", "Moonlight")
    movieSet += "Paradise"
    println(movieSet)

    // Immutable HashSet
    val hashSet = HashSet("Tomatoes", "Chilies")
    val ingredients = hashSet + "Coriander"
    println(ingredients)

    // Mutable Map
    val treasureMap = mutable.Map.empty[Int, String]
    treasureMap += (1 -> "Go to the island.")
    treasureMap += (2 -> "Find big X on the ground.")
    treasureMap += (3 -> "Dig!")
    val step2 = treasureMap(2)
    println(step2)

    // Immutable Map
    val romanNumeral = Map(1 -> "I"
      , 2 -> "II"
      , 3 -> "III"
      , 4 -> "IV"
      , 5 -> "V"
    )
    val four = romanNumeral(4)
    println(four)
  }
}