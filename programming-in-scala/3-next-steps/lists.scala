val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

println()

val sevenEightNine = 7 :: 8 :: 9 :: Nil;
print("You can create list of N elements with :: method like that: ")
println("element1 :: ... :: elementN :: Nil")
println(sevenEightNine + " is an example for that.")

println()

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println("Prepend 1 to " + twoThree)
println("So it becomes " + oneTwoThree)
