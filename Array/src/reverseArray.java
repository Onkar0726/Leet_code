import java.util.*;
public class reverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        int i = 0;
        int j = a.size() - 1;
        while (i < j) {
            Collections.swap(a, i, j);
            i++;
            j--;
        }
        return a;
    }


    public static void main(String[] args) {
        reverseArray  ra = new reverseArray ();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("enter"+n+"integers");
        for (int k = 0; k < n; k++) {
            list.add(sc.nextInt());
        }
        System.out.println(reverseArray(list));
    }
}
