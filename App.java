package org.example;
class App
{
    public static void main( String[] args )
    {
        StringBuilder sb= new StringBuilder("Hello, ");
        String name = " ";
        if (args.length == 0)
            sb.append("World");
        else
            for (int i=0;i<args.length;i++)
            {
                sb.append(args[i] + ", ");
            }
        if (sb.length()>12)
        {
            name=sb.substring(0,sb.length()-2);
            System.out.println( name + "!");
        }
        else
            System.out.println( sb + "!");


    }
}