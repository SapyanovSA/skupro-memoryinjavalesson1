import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main.main");
        passPrimitive();
        passArray();
        passObject();
    }

    public static void passPrimitive() {
        System.out.println("Main.passPrimitive");
        int i = 42;
        System.out.println("i = " + i);
        int j = innerPassPrimitive(i);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    public static int innerPassPrimitive(int i) {
        System.out.println("Main.innerPassPrimitive");
        i += 2;
        System.out.println("i = " + i);
        return i;
    }

    private static void passArray() {
        System.out.println("Main.passArray");
        int[] arr = {12, 42, 56};
        System.out.println("arr = " + Arrays.toString(arr));
        innerPassArray(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    private static void innerPassArray(int[] arr) {
        System.out.println("Main.innerPassArray");
        arr[0] = 77;
        System.out.println("arr = " + Arrays.toString(arr));
        arr = new int[]{33, 66};
        System.out.println("Arrays.toString(arr new = " + Arrays.toString(arr));
    }

    private static void passObject() {
        System.out.println("Main.passObject");
        Cat cat = new Cat("orange");
        System.out.println("cat before " + cat.legs + " лапки и " + cat.color + " шерстка");
        Cat anotherCat = innerPassObject(cat);
        System.out.println("cat after " + cat.legs + " лапки и " + cat.color + " шерстка");
        System.out.println("cat another " + anotherCat.legs + " лапки и " + anotherCat.color + " шерстка");
    }

    private static Cat innerPassObject(Cat cat) {
        System.out.println("Main.innerPassObject");
        cat.legs = 3;
        System.out.println("cat inner " + cat.legs + " лапки и " + cat.color + " шерстка");
        cat = new Cat("white");
        System.out.println("cat inner one " + cat.legs + " лапки и " + cat.color + " шерстка");
        cat.legs = 2;
        System.out.println("cat after two " + cat.legs + " лапки и " + cat.color + " шерстка");
        return null;
    }
}