//Lab0 Derek Neil
//find prime numbers in a range

   public class Ex2c {
      public static void main (String [] args) {
         System.out.print("The following numbers are perfect: ");
         long startTime, endTime, executionTime;
         startTime = System.currentTimeMillis();
         for (int n=100 000 000 000; n<=1 000 000 000 000; n++){
            if(isPrime(n))
               System.out.print(n+", ");
         }
         endTime = System.currentTimeMillis();
         executionTime = endTime - startTime;
         System.out.print("\nTotal execution time is: "+executionTime+"ms");
      }
      
      public static boolean isPrime (int n) {
         if(n>0){
            for (int i=1; i<n; i++){
               if(n%i==0 && i>1 )
                  return false;
            }
            return true;
         }
         return false;  
      }		
   }