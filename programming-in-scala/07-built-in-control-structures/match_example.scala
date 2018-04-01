val arg = if (!args.isEmpty) args(0) else ""
val friend = arg match {
    case "salt" => "pepper"
    case "eggs" => "bacon"
    case "chips" => "salsa"
    case _ => "waat?"
}

println(friend)
