class Solution {
    public int reverse(int x) {
     StringBuilder sb= new StringBuilder();
     sb.append(x);
     String k=sb.toString();
     if(x<0){
        k=k.replace("-","");
        k=new StringBuilder(k).reverse().toString();
        Long a=Long.parseLong(k);
         if(a>=-2147483648 && a<=2147483647){
            return (int)(-1*a);
            }
        else {
            return 0;
        }
     } 
        
     else{
        k=new StringBuilder(k).reverse().toString();
        long a=Long.parseLong(k);
        if(a>=-2147483648 && a<=2147483647){
            return (int)a;
            }
        else {
            return 0;
        }
     } 
    }
}