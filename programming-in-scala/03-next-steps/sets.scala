var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

println()

val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")
