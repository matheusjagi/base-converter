package conversion

import scala.annotation.tailrec

def conversionToBase(value: Int, sourceBase: Int, targetBase: Int): Any =
    if sourceBase == targetBase then
        value
    else 
        sumRemaindersDivisionBase(value, targetBase)

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