Aidan Gracie
St10457561

Link to GitHub - https://github.com/AidanGracie20/WeatherApp_Practical.git

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










Explanation and screenshots of Weather Application (the screenshots dont show up in the readMe file but i will attach the word document as well)


Aidan Gracie
St10457561

Explanation of my app with Screenshots

We were tasked with creating a Kotlin Application that uses arrays, loops and screen navigation to fulfil a company’s request. The app was supposed to have a minimum of 3 screens, but my application has 9 screens, you will understand when you see the screenshots. 3 screens are shown below but the other 6 are the same as the screenshot on the right just with Tuesday to Sundays information.  
       

After the first screen one has the option to proceed to the next page or close the application all together. Once the user has clicked proceed. This code will take them to the next page.
 
This code takes the user from the welcoming splash screen to the next page displaying the weeks maximums and minimums, as well as the average temperature for the week. Here is the code that calculates the average temp. Shown below. 
 
The average temperature for the week is 23.9 degrees. 
Here is the screenshot of the actual applications interface where the average is calculated
 



There is also a clear button. The code for that is shown below
 

We were tasked with using arrays to store the information that we would be using, a screenshot of all that information is shown below
 




As well as all of the above each page has a back button, that will take you back to the previous page. Every one of the detailed screens has a back button that will take you back to the page where all of the arrays are shown, where all the min and max temps are shown. 
  

Here are the full screenshots of all the pages
 
 








(I wont show all 7 screenshots of the different days but you are more than welcome to check)


