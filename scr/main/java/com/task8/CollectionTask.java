package com.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static java.lang.String.valueOf;

public class CollectionTask {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task9Variant2();
        task10();
        task11();
        task12();
        task13();
        task14();
        task14variant2();
        task15();
        task16();
        task17();
    }

    public static void task1() {
        /*
        Task 1.  HashSet from plants
        Create a HashSet collection with element type String.
        Add 10 strings to it:
        watermelon, banana, cherry, pear, melon, blackberry, shen-hen, strawberry, iris, potato.
        Display the contents of the collection on the screen, each item on a new line.
        See how the order of the added items has changed.
         */
        Set<String> plantsSet = new HashSet<>();
        plantsSet.add("watermelon");
        plantsSet.add("banana");
        plantsSet.add("cherry");
        plantsSet.add("pear");
        plantsSet.add("melon");
        plantsSet.add("blackberry");
        plantsSet.add("shen-hen");
        plantsSet.add("strawberry");
        plantsSet.add("iris");
        plantsSet.add("potato");
        Iterator<String> iterator = plantsSet.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            //Elements there have no strictly defined order
            System.out.println(text);
        }
    }

    public static void task2() {
        /*
        Create a collection HashMap<String, String>, put there 10 pairs of strings:
        watermelon - berry, banana - herb, cherry - berry, pear - fruit, melon - vegetable, blackberry - bush, ginseng - root, strawberry - berry, iris - flower, potato - tuber.
        Display the contents of the collection on the screen, each item on a new line.
        Output examlpe (only one line is shown here):
        potato - tuber
         */
        Map<String, String> plantsPairsMap = new HashMap<String, String>();
        plantsPairsMap.put("watermelon", "berry");
        plantsPairsMap.put("banana", "herb");
        plantsPairsMap.put("cherry", "berry");
        plantsPairsMap.put("pear", "fruit");
        plantsPairsMap.put("melon", "vegetable");
        plantsPairsMap.put("blackberry", "bush");
        plantsPairsMap.put("ginseng", "root");
        plantsPairsMap.put("strawberry", "berry");
        plantsPairsMap.put("iris", "flower");
        plantsPairsMap.put("potato", "tuber");

        Iterator<Map.Entry<String, String>> iterator2 = plantsPairsMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> pair = iterator2.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

    public static void task3() {
        /*
        Task 3. HashMap collection of cats
        There is a Cat class, with a name field (name, String).
        Create a collection HashMap<String, Cat>.
        Add 10 cats to the collection, use cat name as a key.
        Print the result on the screen, each item on a new line.
         */
        Cat[] cats = new Cat[10];
        HashMap<String, Cat> catsCollection = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat("name" + i);
            catsCollection.put(cats[i].getName(), cats[i]);
        }

        for (Map.Entry<String, Cat> pair : catsCollection.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println("Key: " + key + " --> " + "Value: " + value);
        }
    }

    public static void task4() {
        /*
        Task 4. Display the list of keys
        There is a collection of HashMap<String, String>, there are 10 different strings.
        Display the list of keys, each element with a new line.
         */
        HashMap<String, String> listOfStrings = new HashMap<>();
        listOfStrings.put("apple", "fruit");
        listOfStrings.put("pear", "fruit");
        listOfStrings.put("cat", "animal");
        listOfStrings.put("dog", "animal");
        listOfStrings.put("chicken", "bird");
        listOfStrings.put("tuna", "fish");
        listOfStrings.put("salmon", "fish");
        listOfStrings.put("watermelon", "berry");
        listOfStrings.put("banana", "fruit");
        listOfStrings.put("cherry", "berry");

        for (Map.Entry<String, String> pair : listOfStrings.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }

    public static void task5() {
        /*
        Task 5. Display a list of values
        There is a collection of HashMap<String, String>, there are 10 different strings.
        Display a list of values on the screen, each element with a new line.
         */
        HashMap<String, String> listOfStrings = new HashMap<>();
        listOfStrings.put("apple", "fruit");
        listOfStrings.put("pear", "fruit");
        listOfStrings.put("cat", "animal");
        listOfStrings.put("dog", "animal");
        listOfStrings.put("chicken", "bird");
        listOfStrings.put("tuna", "fish");
        listOfStrings.put("salmon", "fish");
        listOfStrings.put("rose", "flower");
        listOfStrings.put("carrot", "vegetable");
        listOfStrings.put("banana", "fruit");

        for (Map.Entry<String, String> pair : listOfStrings.entrySet()) {
            System.out.println(pair.getValue());
        }
    }

    public static void task6() {
        /*
        Task 6. HashMap collection from Object
        There is a collection HashMap<String, Object>, there are 10 different pairs of objects.
        Display the contents of the collection on the screen, each element on a new line.

        Output example (only one string is shown here):
        Sim - 5
         */
        HashMap<String, Object> listOfObjects = new HashMap<>();
        listOfObjects.put("apple", 3);
        listOfObjects.put("pear", true);
        listOfObjects.put("cat", "animal");
        listOfObjects.put("dog", 8);
        listOfObjects.put("chicken", false);
        listOfObjects.put("tuna", true);
        listOfObjects.put("salmon", 1.6);
        listOfObjects.put("rose", false);
        listOfObjects.put("carrot", true);
        listOfObjects.put("banana", "fruit");

        for (Map.Entry<String, Object> pair : listOfObjects.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println(key + " - " + value);
        }
    }

    public static void task7() {
        /*
        5 different lines in the list
        1. Create a list of lines.
        2. Add 5 different lines to it.
        3. Display its size on the screen.
        4. Using a loop, display its contents on the screen, each value on a new line
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("potato is vegetable");
        listOfStrings.add("pepper");
        listOfStrings.add("rose");
        listOfStrings.add("dog");
        listOfStrings.add("cat");

        System.out.println("ArrayList size: " + listOfStrings.size());
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }
    }

    public static void task8() throws IOException {
        /*
        The Longest line
        1. Create a list of strings.
        2. Read 5 strings from the keyboard and add them to the list.
        3. Using a loop, find the longest string in the list.
        4. Display the found string on the screen.
        5. If there are several such lines, print each line from a new line.
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 strings and press enter when finish");

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            listOfStrings.add(s);
        }
        int longestWordSize = getLongestLine(listOfStrings).length();
        System.out.println("The list of longest strings: ");
        for (int i = 0; i < listOfStrings.size(); i++) {
            String str = listOfStrings.get(i);
            if (str.length() == longestWordSize) {
                System.out.println(str);
            }
        }
    }

    public static String getLongestLine(ArrayList<String> stringList) {
        String longString = stringList.get(0);
        for (String str : stringList) {
            if (str.length() > longString.length()) {
                longString = str;
            }
        }
        return longString;
    }

    public static String getShortestLine(ArrayList<String> stringList) {
        String shortString = stringList.get(0);
        for (String str : stringList) {
            if (str.length() < shortString.length()) {
                shortString = str;
            }
        }
        return shortString;
    }

    public static void task9() throws IOException {
        /*
        The Shortest line
        1. Create a list of strings.
        2. Read 5 strings from the keyboard and add them to the list.
        3. Using a loop, find the shortest string in the list.
        4. Display the found string on the screen.
        5. If there are several such lines, print each line from a new line
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 strings and press enter when finish");

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            listOfStrings.add(s);
        }
        int shortestWordSize = getShortestLine(listOfStrings).length();
        System.out.println("The list of longest strings: ");
        for (int i = 0; i < listOfStrings.size(); i++) {
            String str = listOfStrings.get(i);
            if (str.length() == shortestWordSize) {
                System.out.println(str);
            }
        }
    }

    public static void task9Variant2() throws IOException {
        /*
        The Shortest line
        1. Create a list of strings.
        2. Read 5 strings from the keyboard and add them to the list.
        3. Using a loop, find the shortest string in the list.
        4. Display the found string on the screen.
        5. If there are several such lines, print each line from a new line
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 strings and press enter when finish");

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            listOfStrings.add(s);
        }
        //Found the line with min length
        int minLengh = listOfStrings.get(0).length();
        for (int i = 0; i < listOfStrings.size(); i++) {
            int size = listOfStrings.get(i).length();
            if (size < minLengh) {
                minLengh = size;
            }
        }
        //Lines with min length are added to separate list listOfShortestStrings
        List<String> listOfShortestStrings = new ArrayList<>();
        for (int i = 0; i < listOfStrings.size(); i++) {
            if (listOfStrings.get(i).length() == minLengh) {
                listOfShortestStrings.add(listOfStrings.get(i));
            }
        }
        //Print each line from a new line
        for (String listOfShortestString : listOfShortestStrings) {
            System.out.println(listOfShortestString);
        }
    }

    public static void task10() throws IOException {
        /*
        Task 10. 10 lines to the top of the list
        1. Create a list of strings in the main method.
        2. Add 10 lines to it from the keyboard, but only add not to the end of the list, but to the beginning.
        3. Using a loop, print the contents to the screen, each value on a new line.
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter new 10 lines: ");
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            listOfStrings.add(0, s);
        }

        System.out.println("The hole list of strings in an array: ");
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }
    }

    public static void task11() throws IOException {
        /*
        Delete the last line and insert it at the beginning
        1. Create a list of strings.
        2. Add 5 lines to it from the keyboard.
        3. Delete the last line and insert it at the beginning. Repeat 13 times.
        4. Using a loop, display the contents on the screen, each value on a new line
         */
        ArrayList<String> listOfStrings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 lines: ");

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            listOfStrings.add(s);
        }
        System.out.println("рядки до перестановки: " + listOfStrings);
        for (int i = 0; i < 13; i++) {
            String removedElement = listOfStrings.remove(listOfStrings.size() - 1);
            listOfStrings.add(0, removedElement);
        }
        System.out.println("рядки після перестановки: " + listOfStrings);
    }

    public static void task12() {
        /*
        Create a set of strings (Set<String>), put into it 20 words with the letter "L".
         */
        Set<String> set = new HashSet<>();
        set.add("lemon");
        set.add("lime");
        set.add("lychee");
        set.add("lion");
        set.add("leopard");
        set.add("lizard");
        set.add("llama");
        set.add("ladybug");
        set.add("library");
        set.add("ladder");
        set.add("lamp");
        set.add("lake");
        set.add("land");
        set.add("landlord");
        set.add("love");
        set.add("life");
        set.add("luck");
        set.add("light");
        set.add("laugh");
        set.add("lentils");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }

    public static void task13() {
        /*
        Create a set of numbers (Set<Integer>), put 20 different numbers in it.
        Remove all numbers greater than 10 from the set.
         */
        Set<Integer> numbers = new HashSet<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 42, 32, 42, 76, 78, 17, 0, 45, 71
        ));
        System.out.println("Set of numbers: " + numbers);

        Iterator<Integer> i = numbers.iterator();

        while (i.hasNext()) {
            Integer e = i.next();
            if (e > 10) {
                i.remove();
            }
        }
        System.out.println("Filtered of numbers: " + numbers);
    }

    public static void task14() {
        /*
        Create a dictionary (Map<String, String>) with ten entries
        according to the principle "Last Name" - "First Name".
        Check how many people have the same first or last name as the given one.
         */
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("Smith", "John");
        personalInfo.put("Doe", "Jane");
        personalInfo.put("Johnson", "John");
        personalInfo.put("Williams", "Emily");
        personalInfo.put("Brown", "Michael");
        personalInfo.put("Davis", "Jane");
        personalInfo.put("Miller", "Sarah");
        personalInfo.put("Wilson", "John");
        personalInfo.put("Moore", "Jessica");
        personalInfo.put("Taylor", "Michael");

        System.out.println(getSameValues("John", personalInfo));
        System.out.println(getSameKeys("Johnson", personalInfo));

    }

    public static int getSameValues(String value, Map map) {
        int count = 0;
        List<String> values = new ArrayList<>(map.values());
        for (int i = 0; i < values.size(); i++) {
            if (value.equals(values.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static void task14variant2() {
        /*
        Create a dictionary (Map<String, String>) with ten entries
        according to the principle "Last Name" - "First Name".
        Check how many people have the same first or last name as the given one.
         */
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("Smith", "John");
        personalInfo.put("Doe", "Jane");
        personalInfo.put("Johnson", "John");
        personalInfo.put("Williams", "Emily");
        personalInfo.put("Brown", "Michael");
        personalInfo.put("Davis", "Jane");
        personalInfo.put("Miller", "Sarah");
        personalInfo.put("Wilson", "John");
        personalInfo.put("Moore", "Jessica");
        personalInfo.put("Taylor", "Michael");

        Map<String, Integer> namesCounts = new HashMap<>();
        List<String> listOfNames = new ArrayList<>(personalInfo.values());
        for (int i = 0; i < listOfNames.size(); i++) {
            String name = listOfNames.get(i);
            if (namesCounts.containsKey(name)) {
                namesCounts.put(name, namesCounts.get(name) + 1);
            } else {
                namesCounts.put(name, 1);
            }
        }
        System.out.println("John name count: " + namesCounts.get("John"));

        Map<String, Integer> keysCounts = new HashMap<>();
        List<String> listOfKeys = new ArrayList<>(personalInfo.keySet());
        for (int i = 0; i < listOfKeys.size(); i++) {
            String key = listOfKeys.get(i);
            if (keysCounts.containsKey(key)) {
                keysCounts.put(key, keysCounts.get(key) + 1);
            } else {
                keysCounts.put(key, 1);
            }
        }
        System.out.println("Johnson name count: " + keysCounts.get("Johnson"));
    }


    public static int getSameKeys(String key, Map map) {
        int count = 0;
        List<String> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            if (key.equals(keys.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static void task15() {
        /*
        Create a dictionary (Map<String, LocalDate>) and enter ten entries into it according to the principle:
        "last name" - "date of birth". Remove all people born in summer from the dictionary.
         */
        Map<String, LocalDate> personalInfo = new HashMap<>();
        personalInfo.put("Smith", LocalDate.parse("2000-07-07"));
        personalInfo.put("Johnson", LocalDate.parse("2019-08-07"));
        personalInfo.put("Williams", LocalDate.parse("2012-09-07"));
        personalInfo.put("Brown", LocalDate.parse("1996-10-07"));
        personalInfo.put("Jones", LocalDate.parse("1997-06-07"));
        personalInfo.put("Miller", LocalDate.parse("1988-05-07"));
        personalInfo.put("Davis", LocalDate.parse("1999-12-07"));
        personalInfo.put("Wilson", LocalDate.parse("2005-11-07"));
        personalInfo.put("Taylor", LocalDate.parse("2006-01-07"));
        personalInfo.put("Anderson", LocalDate.parse("2007-02-07"));
        System.out.println("Before deletion");
        for (Map.Entry<String, LocalDate> pair : personalInfo.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println(key + ": " + value);
        }

        Iterator<Map.Entry<String, LocalDate>> iterator = personalInfo.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            LocalDate date = pair.getValue();
            Month month = date.getMonth();
            if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
                iterator.remove();
            }
        }

        System.out.println("------");
        System.out.println("After deletion");
        for (Map.Entry<String, LocalDate> pair : personalInfo.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println(key + ": " + value);
        }
    }

    public static void task16() {
        /*
        Create a dictionary (Map<String, String>) and enter ten entries in it according
        to the principle "last name" - "first name". Delete people who have the same names.
         */
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("Smith", "John");
        personalInfo.put("Doe", "Jane");
        personalInfo.put("Johnson", "John");
        personalInfo.put("Williams", "Emily");
        personalInfo.put("Brown", "Michael");
        personalInfo.put("Davis", "Jane");
        personalInfo.put("Miller", "Sarah");
        personalInfo.put("Wilson", "John");
        personalInfo.put("Moore", "Jessica");
        personalInfo.put("Taylor", "Michael");

        // Create a new HashMap to store counts of names
        Map<String, Integer> namesCounts = new HashMap<>();

        //Create list with all names from personalInfo Map
        List<String> listOfNames = new ArrayList<>(personalInfo.values());

        //Iterate though list to add values to namesCounts and identify counts
        for (int i = 0; i < listOfNames.size(); i++) {
            String name = listOfNames.get(i);
            if (namesCounts.containsKey(name)) {
                namesCounts.put(name, namesCounts.get(name) + 1);
            } else {
                namesCounts.put(name, 1);
            }
        }
        System.out.println(namesCounts);

        // Iterate through the original personalInfo map
        Iterator<Map.Entry<String, String>> iterator = personalInfo.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (namesCounts.get(value) > 1) {
                iterator.remove();
            }
        }

        //Print updated Map
        for (Map.Entry<String, String> pair : personalInfo.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println(key + ": " + value);
        }
    }

    public static void task17() {
        /*
        1. Create a Map dictionary (<String, String>) and add 10 people to it in the form "LastName"-"FirstName".
        2. Let there be people with the same first name among these 10 people.
        3. Let there be people with the same last names among these 10 people. Note the number of entries in the resulting collection.
        4. Display the contents of the Map on the screen.
         */
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("Smith", "John");
        personalInfo.put("Doe", "Jane");
        personalInfo.put("Johnson", "John");
        personalInfo.put("Brown", "Emily");
        personalInfo.put("Brown", "Michael");
        personalInfo.put("Miller", "Jane");
        personalInfo.put("Miller", "Sarah");
        personalInfo.put("Wilson", "John");
        personalInfo.put("Wilson", "Jessica");
        personalInfo.put("Taylor", "Michael");

        for (Map.Entry<String, String> pair : personalInfo.entrySet()) {
            String key = pair.getKey();
            String value = valueOf(pair.getValue());
            System.out.println(key + ": " + value);
        }
    }
}
