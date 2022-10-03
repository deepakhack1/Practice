
import java.util.*;
import java.util.stream.Collectors;

public class Group_Anagram2 {

    static List<List<String>> anagram(List<String> list) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> lists = new ArrayList<>();

        for (String s : list) {
            char[] toCharArray = s.toCharArray();

            Arrays.sort(toCharArray);

            final String s1 = String.valueOf(toCharArray);


            if (!map.containsKey(s1)) {

                map.put(s1, Collections.singletonList(s));
            } else {
                List<String> list1 = new ArrayList<>(map.get(s1));
                list1.add(s);
                map.put(s1, list1);

            }


        }

        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> lists = anagram(list);
        System.out.println(lists);

    }
}
