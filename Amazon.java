import java.util.*;
public class Amazon {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int boxes[]=new int[n];
        for(int i=0;i<n;i++)
        {
            boxes[i]=in.nextInt();
        }
        int unitSize=in.nextInt();
        int unitPerBox[]=new int[unitSize];
        for(int i=0;i<unitSize;i++)
        {
            unitPerBox[i]=in.nextInt();
        }
        int truckSize=in.nextInt();
        PriorityQueue<int []>q=new PriorityQueue<>(Collections.reverseOrder( new Comparator<>(){
            public int compare(int []a,int []b)
            {
                return a[0]-b[0];
            }
        }));
        for(int i=0;i<unitSize;i++)
        {
            int []ar={unitPerBox[i],boxes[i]};
          
            q.add(ar);
        }
       
       int result=0;
        while(truckSize>0)
        {
            int []temp=q.remove();
            int t1=temp[0];
            int t2=temp[1];
            
            while(t2!=0 && truckSize>0 )
            {
                result+=t1;
                
                t2--;
                truckSize--;
                
            }

            
        }
        System.out.println(result);


    }
}
