public class EqualXam {
    public static void main(String[] args) {
        String str1 = "SMC";
        String str2 = "SMC";
        String str3 = new String("highschool");
        String str4 = new String("highschool");

        if (str1 == str2)
        {
            System.out.println("주소 같");
        }

        else
        {
            System.out.println("주소 다름");
        }

        if (str3 == str4)
        {
            System.out.println("주소 같");
        }

        else
        {
            System.out.println("주소 다름");
        }

        if(str1.equals(str2))
        {
            System.out.println("내용 같음");
        }

        else
        {
            System.out.println("내용 다름");
        }

        if(str3.equals(str4))
        {
            System.out.println("내용 같음");
        }

        else
        {
            System.out.println("내용 다름");
        }
        
    }
}
