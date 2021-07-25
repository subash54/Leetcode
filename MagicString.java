import java.util.*;


 class MagicString {
     public static void main(String []args)
     {
         System.out.println(magicalString("sweeeEt"));
     }
    public static String magicalString(String s) {
        // Write your code here.
        Stack<Character>stack=new Stack<>();
       
      //  System.out.println((int)stack.peek());
        for(char c:s.toCharArray())
        {
            //int d=c;
            
           if(stack.empty())
            {
                stack.push(c);
            }
            else
            {
               
                char d=stack.peek();
                
                
                if(d<97 && c>=97)
                {
                    // 
                 //   System.out.println(d+3+" "+c);
                    if((d+32)==c)
                    {
                      
                        stack.pop();
                    }
                    else
                    {
                        stack.push(c);
                    }
                }
                else if(d>=97 && c<96)
                {
                    //System.out.println(d+'a'+" "+c);
                    if((c+32==d))
                    {
                      
                        stack.pop();
                    }
                    else
                    {
                        stack.push(c);
                    }
                }
                
                else
                {
                    stack.push(c);
                }
                
            }
        }
        String result="";
        while(!stack.empty())
        {
            result=stack.pop()+result;
        }
        return result;
    }
}
