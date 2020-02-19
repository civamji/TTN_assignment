class NewException extends Exception{
    String str;
    NewException(String str)
    {
        this.str=str;
    }

    @Override
    public String toString() {
        return "NewException without stack trace{" +
                "str='" + str + '\'' +
                '}';
    }

}

public class q13 {
    public static void main(String[] args) {
        try{
            throw new NewException("New exception found ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}