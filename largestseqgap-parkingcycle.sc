def solution(a:Array[Int]):Int = {
  var d = 0
  var m = 0
  
  if(a.size>0)
  {
    val b = a.sorted
    for(i <- 0 until b.length-1)               //largest gap - parking cycle
    {
      d = Math.abs(b(i) - b(i+1))
      if(d>m) m=d
    }
  }
  m/2
}
solution(Array(-1,10,0,2,8,11,13,12))
solution(Array(-1,10,0,2,8,11,13,3,12))