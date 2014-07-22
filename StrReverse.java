public class StrReverse
{
    public static void main(String[] args)
    {
        int index = 0;

        //Check for empty input into the program
        if(args.length == 0)
        {
            System.out.println("Please pass in a String into " +
                               "the command line.");
            return;
        }

        //This accounts for extra white space in case where args.length == 1
        String str  = args[0]; 
        index++; //account for the off set of the index

        while(index < args.length)
        {
            str = str + " " + args[index];
            index++;
        }
        
        System.out.println( StringReverse( str ) );
    }

    /*
     * Method to reverse a String.
     * Returns a String
     **/
    public static String StringReverse(String str)
    {
        int index = str.length() - 1;
        String rev = new String();
        
        while(index >= 0)
        {
            rev = rev + str.charAt(index--);    
        }

        return rev;
    }


}//end class
