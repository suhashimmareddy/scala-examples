
def solution(s: String): String = {
    val stringwithotspaces = s.replaceAll(" ", "")
    val stringwithotdash = stringwithotspaces.replaceAll("-", "")
    val lengthofNumber = stringwithotdash.length
    val output = new StringBuilder()
    
        if (lengthofNumber <= 2) {
      stringwithotdash
    }
   else if(lengthofNumber%3 == 1)
    {
        val stringsp = stringwithotdash.toCharArray()
        
       
        for(i <- 0 until lengthofNumber-2 )
        {
          if(i%3==0 && i>0)
            {
              output.append("-").append(stringsp(i))
            }
          else                                                      //format phone number
          output.append(stringsp(i))
        }
     
      if(lengthofNumber%2==1)
      {
       for(i <- lengthofNumber-2  until lengthofNumber)
       {
              if(i%2!=0 && i>0)
            {
              output.append("-").append(stringsp(i))
            }
          else
          output.append(stringsp(i))
        }}
      else
      {
        for(i <- lengthofNumber-2  until lengthofNumber)
       {
              if(i%2==0 && i>0)
            {
              output.append("-").append(stringsp(i))
            }
          else
          output.append(stringsp(i))
        }
      }
       
       output.toString
    }
    
    else {
      val string_splitted = stringwithotdash.toCharArray()
      for(i <- 0 until lengthofNumber )
        {
          if(i%3==0 && i>0)
            {
              output.append("-").append(string_splitted(i))
            }
          else
          output.append(string_splitted(i))
        }
      output.toString

    }
  }

solution("0913874")
solution("00444855558361")
solution("555372654")
solution("0221985324")
\\100%