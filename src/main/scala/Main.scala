import scala.io.StdIn

@main def run(): Unit =
    
    println("Informe o valor para conversao: ")
    val value = StdIn.readLine()

    println("Informe a base do numero informado: ")
    val sourceBase = StdIn.readInt()

    println("Informe a base que deseja converter: ")
    val targetBase = StdIn.readInt()

    val resultConversion = conversionToBase(Integer.parseInt(value.trim, sourceBase), sourceBase, targetBase)

    println(s"O valor ${value.trim} na base $sourceBase convertido para base $targetBase e: $resultConversion")