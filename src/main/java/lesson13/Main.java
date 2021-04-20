package lesson13;

import lesson13.entity.Client;
import lesson13.entity.Dog;
import lesson13.util.Comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.empty()
                .map(s -> s.toString())
                .limit(5)
                .forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Kateryna");
        list.add("student");
        list.add("Stanislavivna");
        list.add("student");
        list.add("Stanislavivna");
        list.add("Danko");
        list.add("Danko");
        list.add("architect");
        list.add("student");

        Set<String> stringToUpper = list.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println("2. stringToUpper:" + stringToUpper);

        List<Integer> integerList = Stream.of(1, 3, 2, 556, 34, 34, 54, 2, 54, 12)
                .collect(Collectors.toList());
        System.out.println("3. integerList: " + integerList);

        Client client1 = new Client("Nick", 20);
        Client client2 = new Client("Kate", 21);
        Client client3 = new Client("Dan", 20);
        Client client4 = new Client("Maria", 23);
        Map<String, Client> stringClientMap = new HashMap<>();

        stringClientMap.put("1", client1);
        stringClientMap.put("2", client2);
        stringClientMap.put("3", client3);
        stringClientMap.put("4", client4);

        stringClientMap.entrySet().stream()
                .map(s -> s.getKey())
                .peek(s -> System.out.println("4. clientKeyPrint: " + s))
                .collect(Collectors.toList());

        Collection<String> stringNumber = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            stringNumber.add(String.valueOf(i));
        }
        Set<Integer> evenInteger = stringNumber.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("5. evenInteger:" + evenInteger);

        Optional<String> findFirst = Stream.of("", "man", "woman", "", "girl", "boy", "toddler", "baby")
                .parallel()
                .filter(s -> !s.isEmpty())
                .findFirst();
        System.out.println("6. findFirst: " + findFirst.get());

// METHOD REFERENCE
        Comparison myComparison = new Comparison();

        Dog dog1 = new Dog("Bobby", 10);
        Dog dog2 = new Dog("bob", 10);
        Dog dog3 = new Dog("Rob", 2);
        Dog dog4 = new Dog("robby", 6);
        Dog dog5 = new Dog("Gav", 3);
        Dog dog6 = new Dog("Dani", 8);
        Dog dog7 = new Dog("dan", 4);
        Dog dog8 = new Dog("Bro", 1);
        Dog dog9 = new Dog("Ava", 3);
        Dog dog10 = new Dog("ava", 2);
        Dog dog11 = new Dog("Ava", 5);
        Dog[] dogs = new Dog[11];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;
        dogs[4] = dog5;
        dogs[5] = dog6;
        dogs[6] = dog7;
        dogs[7] = dog8;
        dogs[8] = dog9;
        dogs[9] = dog10;
        dogs[10] = dog11;

        Arrays.stream(dogs)
                .sorted(Comparison::compareByAge)
                .peek(System.out::println)
                .sorted(myComparison::compareByName)
                .map(s -> s.getName())
                .sorted(String::compareToIgnoreCase)
                .peek(System.out::println)
                .collect(Collectors.toCollection(HashSet::new))
                .forEach(System.out::println);
    }
}