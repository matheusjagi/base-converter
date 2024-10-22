package conversion

@main def run(): Unit =

//Falta testar o exemplo 6AA da base 16 converter para 20

    println("Informe o valor para conversao: ")
    val value = scala.io.StdIn.readLine()

    println("Informe a base do numero informado: ")
    val sourceBase = scala.io.StdIn.readLine()

    println("Informe a base que deseja converter: ")
    val targetBase = scala.io.StdIn.readLine()

    val resultConversion = conversionToBase(value.toInt, sourceBase.toInt, targetBase.toInt)

    println(s"O valor $value na base $sourceBase convertido para base $targetBase e: $resultConversion")