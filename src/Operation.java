
public class Operation {
    
    
    private static final int ADD=1;
    private static final int SUB=2;
    private static final int MUL=3;
    private static final int DIV=4;
    
    public int Operation(int choice,int a,int b)
    {
        int result=0;
        switch(choice)
        {
            case ADD:
                result=add(a,b);
                break;
                
            case SUB:
                result=sub(a,b);
                break;
                
            case MUL:
                result=mul(a,b);
                break;
                
            case DIV:
                result=div(a,b);
                break;
        }
       return result;
    }
    
    
    public int add(int a,int b)
    {
        return a+b;
    }
    
    
    public int sub(int a,int b)
    {
        return a-b;
    }
    
    
    public int mul(int a,int b)
    {
        return a*b;
    }
    
    
       public int div(int a,int b)
    {
        return a/b;
    }
       
}
       
     
    
    
    
    
    

