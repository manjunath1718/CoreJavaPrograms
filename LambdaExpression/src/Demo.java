
class A {
    public void show(){
        System.out.println("in A Show");
    }
    public void display(){
        System.out.println("in display");
    }
}

class B extends A {
    public void show(){
        System.out.println("in B Show");
    }
}


public class Demo {
    public static void main(String[] args) {

            A obj = new A(){                // Anonymous inner class
                public void show() {
                    System.out.println("in new show");
                }

                public void display(){
                    System.out.println("in new display");
                }

                public void getData(){
                    System.out.println("new data");
                }

            };
            obj.show();
            obj.display();
           


            A obj1 = new B();
            
            
//            new A(){                // Anonymous inner class
//                public void show() {
//                    System.out.println("in new show");
//                }
//
//                public void display(){
//                    System.out.println("in new display");
//                }
//
//                public void getData(){
//                    System.out.println("new data");
//                }
//
//            }.getData();



    }
}

