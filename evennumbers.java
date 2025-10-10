package Streammethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evennumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        List<Integer> evennumbers = numbers.stream().filter(n -> n %2== 0).
                collect(Collectors.toList());
        System.out.println(evennumbers);

    }
}
void main(){
    List<String>names= Arrays.asList("ragavi","anu");
    List<String>upper= names.Stream().map(s->s.toUpperCase).
            collect(Collectors.toList());
    System.out.println(upper);
    }
}