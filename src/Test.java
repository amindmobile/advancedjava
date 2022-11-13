import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(i);
        }


        list.remove(5);
        System.out.println(list);


//        Проводим много удалений из листа
        list = new LinkedList<>();


//        for(int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//
//        }

//        for(Integer x : arrayList)
//            System.out.println(arrayList.get(x));
    }
}