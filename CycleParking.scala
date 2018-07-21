package codility

/**
  * Created by neelamadhabmallick on 04/04/17.
  */
object CycleParking extends App {
  def solution(arr: Array[Int]) = {
    val parkSlot = 14
    var startPoint = 0
    var endPoint = 0
    var loopCnt = 0
    var cnt = 0
    var startFlag = false
    var endFlag = false
    arr.foreach(x=>print(x+" "))
    while(loopCnt < parkSlot) {
      cnt += 1
      if(arr(loopCnt) == -99 && startFlag == false) {
        startFlag = true
        startPoint = loopCnt
      }

      if(arr(loopCnt + 1) != -99) {
        endFlag = false
      } else {
        endPoint = loopCnt
      }
      loopCnt += 1
    }
    println("\n"+startPoint+"  :  "+endPoint)
  }
  val arr: Array[Int] = Array.ofDim[Int](14)
  arr(0)= 10
  arr(1) = 0
  arr(2) = -99
  arr(3) = 8
  arr(4) = 2
  arr(5) = -99
  arr(6) = -99
  arr(7) = -99
  arr(8) = -99
  arr(9) = -1
  arr(10) = -99
  arr(11) = 12
  arr(12) = 11
  arr(13) = 3
  solution(arr)
}
