/* Program to implement a basic calculator*/
class arithmetic
{
      public static void main(String args[])
      {
            int a,b,z;
	    String op;
 
            a=Integer.parseInt(args[0]);
            op= args[1];
            b=Integer.parseInt(args[2]);
	    if (op.equals("+")) 
	    {
                z = a+b;
            } 
            else if (op.equals("-"))
            {
                z = a-b;
            }
	    else if (op.equals("x"))
            {
                z = a*b;
            }
	    else if (op.equals("/"))
            {
                z = a/b;
            } 
            else
            {
             throw new java.lang.Error("Operator not recognized");
            }
            System.out.println("Result:" + z);
      }
}