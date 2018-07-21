def solution(t:Int):String = {
  
  val h = (t/(60*60)).toInt
  val m = ((t%(60*60))/60).toInt
  val s = ((t%(60*60))%60).toInt
  val z = h+"hours"+m+"minutes"+s+"seconds"
  z
}
solution(83643)
solution(7500)

def solution1(t:Int):String = {                                         //time to sec
  
  val d = (t/(24*3600)).toInt
  val h = ((t%(24*3600))/3600).toInt
  val m = (((t%(24*3600))%3600)/60).toInt
  val s = (((t%(24*3600))%3600)%60).toInt
  val z = d+"days"+h+"hours"+m+"minutes"+s+"seconds"
  z
}
solution1(129600)

100% answer
