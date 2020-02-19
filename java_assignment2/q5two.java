public class q5two {
    int one, two,one1,two1;
    q5two()
    {
        one =5;
        two =6;
    }
    q5two(q5two sc )
    {  one1 =sc.one;
        two1 =sc.two;
    }
    public static void main(String[] args) {
        q5two obj = new q5two();
        q5two obj2 =new q5two(obj);
        System.out.println(" Values of one and two for obj are : "+(obj.one) +" and "+(obj.two)+"  respectively .");
        System.out.println(" Values of one and two for obj1 are : "+(obj2.one1) +"and  "+(obj2.two1)+" respectively .");
    }
}