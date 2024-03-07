import java.util.HashSet;

public class ArrayList {
    public static void main(String[] args) {
        HashSet<String> arrayList = new HashSet<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Original ArrayList: " + arrayList);

        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Sorted ArrayList: " + arrayList);

        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());
    }
}
