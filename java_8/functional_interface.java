@FunctionalInterface
interface Interface1{
    boolean compare(int a,int b);
        }
interface Interface2{
    int increment(int number);
}
interface Interface3{
    String string_concat(String str1,String str2);
}
interface Interface4{
    String convert_uppercase(String str);
}

        class functional_interface{
            public static void main(String[] args) {
                //calling comapre method of interface
                Interface1 I1=(a,b)->a>b;
                System.out.println(I1.compare(4,5));
                System.out.println(I1.compare(5,4));
                System.out.println(I1.compare(100,101));

                //calling increment method

                Interface2 I2=(a)->a+1;
                System.out.println(I2.increment(5));
                System.out.println(I2.increment(4));
                System.out.println(I2.increment(101));

                //calling string_concat method

                Interface3 I3=(str1,str2)->str1+str2;
                System.out.println(I3.string_concat("Shivam","sharma"));
                System.out.println(I3.string_concat("ToThe","New"));
                System.out.println(I3.string_concat("Hello","There"));

                //calling convertouppercase method
                Interface4 I4=(str1)->str1.toUpperCase();
                System.out.println(I4.convert_uppercase("civam"));
                System.out.println(I4.convert_uppercase("ttn"));
                System.out.println(I4.convert_uppercase("god"));


            }
        }