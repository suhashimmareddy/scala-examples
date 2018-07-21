object OddOccurrencesInArray {

  // 100%
  import scala.collection.mutable

def solution(A: Array[Int]): Int = {

  val sorted = A.sorted.lift

  val occurences = mutable.Map[Int, Int]()

  for (n <- A.indices) {

    val prev = sorted(n - 1).getOrElse(Int.MinValue)

    val next = sorted(n + 1).getOrElse(Int.MinValue)

    val curr = sorted(n).get

    if (curr != next && curr != prev) {

      return curr

    }

    if (!occurences.isDefinedAt(curr)) occurences(curr) = 1

    else occurences(curr) += 1

  }

  occurences.find { case (key, value) => value % 2 == 1 }.get._1

}

  // 88%
  def solution3(A: Array[Int]): Int = {
    val ar: Array[Int] = Array.ofDim[Int](A.toList.max + 1)
    for (i <- A.indices) ar(A(i)) = ar(A(i)) + 1
    for (i <- ar.indices) if (ar(i) % 2 == 1) return i
    -1
  }

  val ar1: Array[Int] = Array(2, 1, 2, 4, 1)
  val ar2: Array[Int] = Array(1, 2, 2, 2, 2, 2, 2)
  val ar3: Array[Int] = Array(2, 2, 2, 2, 2, 2, 3)
  solution(ar1)
  solution(ar2)
  solution(ar3)
  solution3(ar1)
  solution3(ar2)
  solution3(ar3)

  /*
  A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
  For example, in array A such that:
    A[0] = 9  A[1] = 3  A[2] = 9
    A[3] = 3  A[4] = 9  A[5] = 7
    A[6] = 9
  the elements at indexes 0 and 2 have value 9,
  the elements at indexes 1 and 3 have value 3,
  the elements at indexes 4 and 6 have value 9,
  the element at index 5 has value 7 and is unpaired.
  Write a function:
  object Solution { def solution(A: Array[Int]): Int }
  that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
  For example, given array A such that:
    A[0] = 9  A[1] = 3  A[2] = 9
    A[3] = 3  A[4] = 9  A[5] = 7
    A[6] = 9
  the function should return 7, as explained in the example above.
  Assume that:
  N is an odd integer within the range [1..1,000,000];
  each element of array A is an integer within the range [1..1,000,000,000];
  all but one of the values in A occur an even number of times.
  Complexity:
  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
  Elements of input arrays can be modified.

 */
}