package conversion

@main def run(): Unit =
    
    println("Informe o valor para conversao: ")
    val value = scala.io.StdIn.readLine()

    println("Informe a base do numero informado: ")
    val readSourceBase = scala.io.StdIn.readLine()
    val sourceBase: Int = readSourceBase.toInt

    println("Informe a base que deseja converter: ")
    val targetBase = scala.io.StdIn.readLine()

    val resultConversion = conversionToBase(Integer.parseInt(value, sourceBase), sourceBase, targetBase.toInt)

    println(s"O valor $value na base $sourceBase convertido para base $targetBase e: $resultConversion")