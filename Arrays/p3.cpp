import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Anshkhandelwal";
       char target = 'j';
        System.out.println(Search(name , target));

    }

    static boolean Search(String name, char target) {
        if (name.length() == 0)
        {
            return false;
        }


        for (int i = 0 ; i < name.length() ; i++)
        {
            if(target == name.charAt(i))
            {
                return true;
            }
        }
        return false;

    }

}
