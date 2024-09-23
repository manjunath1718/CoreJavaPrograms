
interface P{
     void show(String s);
}

// interface -> normal, SAM - Functional Interface, Marker

@FunctionalInterface
interface Persons{
    int add(int x, int y);
 //   public String toString();
}

class PersonImpl implements Persons{
    public int add(int x, int y){
        return x+y;
    }
}

//class R extends P{
//    public void show(){
//        System.out.println("in show");
//    }
//}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        P obj = new P(){
//            public void show(){
//                System.out.println("in show");
//            }
//        };
//        obj.show();

        P obj = s -> System.out.println(s.length());


        obj.show("Navin");

        Persons obj1 = (x, y) ->  x+y;  // anonymous inner class


        int result = obj1.add(5,6);
        System.out.println(result);
    }
}
