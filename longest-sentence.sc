    def solution(s: String): Int = {
         
               
          val sent = s.replace("?","#").replace(".","#").replace("!","#")
          val sentences = sent.replaceAll("( )+"," ")
      if(sentences.length<1) return 0
    
      
          val st = sentences.split("#")
          var z = List[Int]()
      
          for (i <- 0 to st.length-1){
            var sentence = st(i).trim().split(" ")
            val words = sentence.length                                 //longest sentenceproblem
            //println(words)
            z = z:+ words
          }
         
          val maxwords = z.max
          maxwords
        
    }
solution("We test coders. Give us a try?") 
solution("Forget  CVs..Save time . x x")  
solution("c") 
solution("")
solution("     ")

\\62%