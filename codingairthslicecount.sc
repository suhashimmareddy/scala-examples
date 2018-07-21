def solution(A:Array[Int]):Int ={
  val n = A.length
  if(n<3) return 0
  var p = 0
  var nos = 0
  while(p<n-2)
  {
    var q = p+1
    val diff = A(q)-A(p)
    while(q<n-1 && A(q+1)-A(q)==diff)
    {
      q=q + 1
      q                                                       //codingairthslice
    }
    val los = q-p+1
    if(los>=3)
    {
      nos = nos + ((los-2)*(los-1)/2)
    }
    p=q
  }
  if(nos >100000000) return -1
  nos
}
solution(Array(-1,1,3,3,3,2,1,0))--5
\\\100%