println("1st way")
args.foreach(arg => println(arg))
println()

println("2nd way")
args.foreach((arg: String) => println(arg))
println()

println("3rd way")
args.foreach(println)
println()
