import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Manish Tiwari on 1/22/2019.
 */
public class Generics {
    public static void main(String[] args) {
        /*List list = new LinkedList();
        list.add(new Integer(1));
        Integer i = list.iterator().next();
        // Compiler complains here as it cannot detect that list.iterator().next() returns Integer and hence it assumes the most abvious type as Object
        //There is no contract that could guarantee that the return type of the list is an Integer. The defined list could hold any object.
        // We only know that we are retrieving a list by inspecting the context. When looking at types,
        // it can only guarantee that it is an Object, thus requires an explicit cast to ensure that the type is safe

        //This cast can be annoying, we know that the data type in this list is an Integer. The cast is also cluttering our code.
        // It can cause type-related runtime errors if a programmer makes a mistake with the explicit casting

        //It would be much easier if programmers could express their intention of using specific types and the compiler can ensure the correctness of such type.
        // This is the core idea behind generics.*/
        List<Integer> list = new LinkedList<>();
        list.add(new Integer(1));
        Integer i = list.iterator().next(); //Observe that now compiler doesn't complains anymore , that's because of diamond operator containing the type.
        //we narrow the specialization of this list only to Integer type;
        // i.e. we specify the type that will be held inside the list. The compiler can enforce the type at compile time.

    }

    //An example of defining a generic method to convert an array to a list:


    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    //Note: uncomment and observe the compiler error !
    /*public <t, g> List<t> fromArrayToList(t[] a, Function<t, g> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());//collect(Collectors.toList());

    }

    */
    public static  <t, g> List<g> fromArrayToList(t[] a, Function<t, g> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());

    }


}
