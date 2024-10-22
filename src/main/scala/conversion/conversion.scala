package conversion

import scala.annotation.tailrec

def conversionToBaseDecimal(value: Int, targetBase: Int): Int =
    val digits = value.toString.map(_.asDigit).reverse.zipWithIndex
    digits.map((digit, index) => digit * Math.pow(targetBase, index).toInt).sum

def conversionToBase(value: Int, sourceBase: Int, targetBase: Int): Any =
    if sourceBase == targetBase then
        value
    else 
        sumRemaindersDivisionBase(
            if sourceBase != 10 then conversionToBaseDecimal(value, sourceBase) else value, 
            targetBase
        )

@tailrec 
def sumRemaindersDivisionBase(value: Int, base: Int, sumRemainders: List[Any] = List()): Any =
    if value == 0 then 
        sumRemainders.reverse.mkString("")
    else    
        sumRemaindersDivisionBase(value/base, base, sumRemainders :+ convertNumberToStringTargetBase(value % base, base)) 

def convertNumberToStringTargetBase(value: Int, targetBase: Int): Any =
    if targetBase <= 10 || value <= 9 then
        value
    else
        BigInt(value).toString(targetBase).toUpperCase()