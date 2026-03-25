package org.example;
class App
{
    public static void main( String[] args )
    {
        StringBuilder sb= new StringBuilder("Hello");
        if (args.length == 0)
            sb.append(", World");
        else
            for (int i=0;i<args.length;i++)
            {
                sb.append(", "+args[i]);
            }
        System.out.println( sb + "!");
    }
}