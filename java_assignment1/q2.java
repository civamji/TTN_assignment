import java.util.Scanner;

class q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        str=str.toLowerCase();
        int count=0;
        System.out.println(str);
        String Words[]=str.split(" ");
        System.out.println("Duplicate words in inputed string: ");
                for(int i=0;i<Words.length;i++)
        {
            count=1;
            for(int j=i+1;j<Words.length;j++)
        {
            if(Words[i].equals(Words[j]))
            {
                count++;
                Words[j]="0";
            }
        }
            if(count>1 && Words[i]!="0")
            {
                System.out.println(Words[i]+ " "+ count);
            }

        }

    }
}