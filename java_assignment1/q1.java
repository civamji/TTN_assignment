class q1
{
    public static void main(String[] args) {
      System.out.println("Program to show the use of replace method");
        String str="HELLO! java is a oop language and java support multi-threading";
        System.out.println("Before replacement: "+str);
        String replacewith="c++";
        String newstring=str.replaceAll("java",replacewith);

        System.out.println(newstring);

    }
}