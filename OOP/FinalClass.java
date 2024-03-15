class Temp {
    final int num = 5;
    int other = 3;
}

public class FinalClass {
    public static void main(String[] args) {
        // Temp first = new Temp();
        // first.num = 3;
        // Primitives with final keywords can't be modified

        final Temp second = new Temp();
        second.other = 3;
        // second = first;
        // Objects or non - primitives with final keywords can modifies it's values
        // but they can't reassign it
        System.out.println(second.other);

    }
}
