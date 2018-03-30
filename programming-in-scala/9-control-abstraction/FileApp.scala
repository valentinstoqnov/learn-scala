object FileApp extends App {

    FileMatcher.filesEnding(".scala").foreach(println)
    FileMatcher.filesContaining("ile").foreach(println)

}
