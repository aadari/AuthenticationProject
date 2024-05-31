import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestExamples {

    public static void main(String args[]) {
        Stream.of(34, 454, 546, 456, 34, 2, 6);
        int[] numbers = {34, 32, 0,12, 4, 0,123, 2, 6};
        TestExamples testExamples = new TestExamples();
        System.out.println(testExamples.findKthLargest(numbers, 4));
        System.out.println(testExamples.reverseWords("Hello! How are you?"));
        testExamples.moveZeroes(numbers);
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(testHashMap("pwwkew"));
    }

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        //pq.addAll(Arrays.asList(nums));
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        ans = pq.peek();
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }


        public String reverseWords(String s) {
            if(s.isEmpty()) {
                return s;
            } else {
                 List<String> listOfWords = Arrays.asList(s.split(" "));
                 Collections.reverse(listOfWords);
                 return listOfWords.stream().collect(Collectors.joining(" "));
            }
        }

    public void moveZeroes(int[] nums) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                numbers.offerLast(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }
        System.out.println(numbers);
    }

    public static int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;
        int maxLength = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {

            if (!list.contains(s.charAt(end))) {

                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());

            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }
        return maxLength;
    }

    public static int testHashMap(String s) {

        int maxLength = 0;
        Set<Character> characters = new HashSet<>();
        for(Character c : s.toCharArray()) {
            characters.add(c);
        }
        System.out.println(characters);
        return maxLength;
    }

}
