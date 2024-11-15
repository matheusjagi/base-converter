﻿# Lista 1 -- Teoria da Computação / Linguagens Formais e Autômatos -- 2024/2

**Introdução à Teoria da Computação & Fundamentos Matemáticos**

**Autor:** Matheus Jagi

## Problema 1
Este problema pede a construção de uma função que receba como entradas um número $value$ representando o valor a ser convertido, um número $sourceBase$ que representa sua base de origem e um número $targetSource$ que representa a base que deseja converter seu número, fornecendo como resultando a conversão segundo os parametros fornecidos.

## Solução
A solução adotada foi converter todo $value$ de entrada para a base Decimal, sabendo que o processo de conversão para essa base é unificado. A implementação contou com três funções base, uma para conversão adimitindo o valor a se convertido, sua base de origem e a base para conversão. A segunda função conta com uma reursão para realizar a conversão da base decimal para a base a ser convertida. A terceira função implementa uma conversão de numerais maiores que 9 (nove) para letras para bases maiores de 10 (decimal).

## Executando...

### Usando o Scala Prompt

Para executar a solução diretamente no prompt do Scala, use o seguinte comando (supondo que a função esteja no arquivo `Conversion.scala`):

```scala
conversionToBase(Integer.parseInt(value, sourceBase), sourceBase, targetBase.toInt)
```

ou seja

```scala
conversionToBase(Integer.parseInt("6AA", 16), 16, 20)
```

### Para executar usando o SBT
```bash
sbt run
```
O programa pedirá o valor a ser convertido:

```bash
Informe o valor para conversao:
6AA --> Digite o valor desejado
```

O programa pedirá a base do valor informado:

```bash
Informe a base do numero informado:
16 --> Digite a base do valor informado
```

O program pedirá a base que deseja converter o valor:

```bash
Informe a base que deseja converter:
20 --> Digite a base para conversão
```

O programa terá como saida o resultado abaixo:
```bash
O valor 6AA na base 16 convertido para base 20 e: 456
```
