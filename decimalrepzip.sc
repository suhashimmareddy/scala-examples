def solution(a: Int, b: Int): Int = {
 
var A:String = a.toString;
var B:String = b.toString;
var res:String = "";
var result:Int = 0;
var flg:Int=0;
var i:Int=0;
var ln = 0;                            //decimalrepzip
if(A.length>B.length) {
ln = B.length;
flg=0;
}
else {
ln = A.length;
flg=1;
}
while (i<ln)
{
 
res=res+A.substring(i,i+1)+B.substring(i,i+1);
i=i+1;
}
if(flg==0)
res=res+A.substring(ln);
else
res=res+B.substring(ln);
 
result= Integer.valueOf(res);

return (result)
}
solution(12345,67)