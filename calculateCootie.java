public class calculateCootie
{
   public static void main(String[] args)
   {
      int s, t=0;
      String n;
      for(int i=345666666; i<666666544; i++)
      {
         s=0;
         n=""+i;
         if(n.contains("3")&&n.contains("4")&&n.contains("5"))
            for(int j=0; j<9; j++)
               if(n.charAt(j)=='6')
                  s++;
         if(s>5)
         {
            System.out.println(12+n);
            t++;
         }
      }
      System.out.println(t);
   }
}