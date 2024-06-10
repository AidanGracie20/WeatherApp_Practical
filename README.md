Aidan Gracie
St10457561

1.Pseudocode followed by 2. Explanation followed by the 3. Screenshots


My Weather app 
Pseudocode

0. Start
1. Declarations
   var button1
   var button2
   var buttonMo
   var buttonTu
   var buttonWe
   var buttonTh
   var buttonFr
   var buttonSa
   var buttonSu
   var buttonback (1-7)eg buttonBack1, buttonback7
2. Arrays
   val TempArrayMax =  arrayOf(26, 27, 21, 32, 26, 12, 23)
   val TempArrayMin = arrayOf(13, 12, 10, 19, 13, 6, 13)
   var ConditionArray = arrayOf("Sunny", "Sunny", "Cold", "Sunny", "Sunny", "Rain", "Cold")
3. Calculating average temperature
   val size = 7
                var sum = 167
                for (num in TempArrayMax) {
                    sum += num
                }
                val average = sum / TempArrayMax.size

              printLn("23.9")
4. Displaying weather for the week
   For example. printLn (Monday infomation, 
                         Min temp = 13
                         Max temp = 26
                         condition = Sunny,......)
                         (for entire week obviously....)
5. End
