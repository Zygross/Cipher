import java.util.Scanner;
class CIPHER
{
    public static void main ()
    {
        String k="";
        Scanner br=new Scanner (System.in);
        System.out.println (" Enter the cipher text ");
        String h=br.nextLine();
        int len=h.length();
        for (int i=0;i<len;i++)
        {
            char c=h.charAt(i);
            int g=c;
            if (c==' '|| c=='.'||c=='?'||c=='!')
            {
                k+=c;
            }
            if(c>='A'&&c<='M')
            {
              g+=13; 
              char d=(char)g;
            k+=d;
            }
            else if (c>='a'&&c<='m')
            {
                g+=13;
                char d=(char)g;
            k+=d;
            }   
            else
            {
                g-=13;
                char d=(char)g;
            k+=d;
            }
            
     }
        System.out.println (k);
    }
}