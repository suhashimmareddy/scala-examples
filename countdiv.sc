 def solution(A:Int,B:Int,K:Int):Int = {
       
        var  a=A
        var  b=B
        var  k=K
        var  count=0
        var  i=a%k;
        
        if(i!=0){
            a=a+Math.abs(i-k);
        }
        
        
        
        var j=b%k;
        if(j!=0){
            b=b-(Math.abs(j));
        }
        
        if(a!=b){        
            if(a%k==0) count=1;
            count=count+(b-a)/k;
        }else{
            if(a==0 && b==0){
                count=1;
            }else if(a%k==0){
                count=(b/a);
            }else{
                count=0;
            }
        }
        return count;
    }