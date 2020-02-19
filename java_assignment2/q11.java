class q11{
    public static void main(String[] args) {
int i=0,t=1,s=0;


while(i<10)
        {
            s+=i;
            int j=i;
            while(j>0)
        {
        t*=(j-i);
        j--;
        }
            s*=t;
            System.out.println("T is "+t);
            i++;
        }
        System.out.println("S is"+s);
        }
        }