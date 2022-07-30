package Arrays;

import java.util.HashMap;
public class symmetricpair {
    public static void main(String args[]) {

        int arr[][] = {{1, 2}, {2, 1}, {4, 5},{3, 4}, {5, 4}};

        HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
        System.out.println("The Symmetric Pairs are: ");
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0]; //1 ,   2
//            System.out.println(first);
            int second = arr[i][1]; //2 ,   1
//            System.out.println(second);
//            System.out.println(mp.get(second)); //null, 2
            if (mp.get(second) != null && mp.get(second) == first) { //1->{2}==2
                System.out.println("("+first + " " + second+") ");
            } else {
                mp.put(first, second); //<1,2>
            }
        }

    }
}
//<1,2>
//<2,1>
//<4,5>
//<3,4>
//<5,4>