import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Loop Running for Test Casesxx
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            print22(num);
        }

        sc.close();
    }

    // Printing Square
    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Printing Right Angle
    static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Printing Right Angle with Numeric Values
    static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Printing Right Angle with Numeric Values : Pattern 2
    static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Printing Right Angle from Downwords
    static void print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Printing Inverted Numbered Right Pyramid
    static void print6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Printing Star Pyramid
    static void print7(int n) {
        for (int i = 0; i < n; i++) {
            // For Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // For Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // Printing Inverted Star Pyramid
    static void print8(int n) {
        // Outer Loop For Changing Rows
        for (int i = 0; i < n; i++) {
            // Inner Loop for printing spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Inner Loop for printing stars
            for (int j = 0; j < (n * 2) - (i * 2 + 1); j++) {
                System.out.print("*");
            }

            // Inner Loop for printing spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // Printing Diamond Star Pattern
    static void print9(int n) {
        // Combined Patters
        print7(n);
        print8(n);
    }

    // Printing Half Diamond Star Pattern
    static void print10(int n) {

        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = i;

            if (stars > n) {
                stars = n * 2 - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Printing Binary Number Triangle Pattern
    static void print11(int n) {
        int var = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                var = 0;
            } else {
                var = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(var + " ");
                var = 1 - var;
            }

            System.out.println();
        }
    }

    // Printing Number Crown Pattern
    static void print12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= n * 2 - i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    // Printing Increasing Number Triangle Pattern
    static void print13(int n) {
        int var = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(var + " ");
                var += 1;
            }
            System.out.println();
        }
    }

    // Printing Increasing Letter Triangle Pattern
    static void print14(int n) {
        for (int i = 1; i <= n; i++) {
            char var = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(var + " ");
                var += 1;
            }
            System.out.println();
        }
    }

    // Printing Reverse Letter Triangle Pattern
    static void print15(int n) {
        for (int i = 0; i < n; i++) {
            char var = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(var + " ");
                var += 1;
            }
            System.out.println();
        }
    }

    // Printing Alpha-Ramp Pattern
    static void print16(int n) {
        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            ch += 1;
            System.out.println();
        }
    }

    // Printing Alpha-Ramp Pattern
    static void print17(int n) {
        for (int i = 0; i < n; i++) {
            // For Printing Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For Printing Characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            // For Printing Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For Going to New Line
            System.out.println();
        }
    }

    // Printing Alpha-Triangle Pattern
    static void print18(int n) {

        for (int i = 0; i < n; i++) {
            char letter = (char) (int) ('A' + n - 1);

            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
                letter--;
            }
            System.out.println();
        }
    }

    // Printing Symmetric-Void Pattern
    static void print19(int n) {
        // Printing First symmetry
        for (int i = 0; i < n; i++) {
            // Printing Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Printing Spaces
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // Printing Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Printing Second symmetry
        for (int i = 1; i <= n; i++) {
            // Priting Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Printing Spaces
            for (int j = 1; j <= n * 2 - i * 2; j++) {
                System.out.print(" ");
            }

            // Printing Stars
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Printing Symmetric-Butterfly Pattern
    static void print20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= n * 2 - 1; i++) {

            // Breakdown Point
            int stars = i;
            if (stars > n) {
                stars = n * 2 - i;
            }

            // Printing Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Printing Spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Printing Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }

    // Printing Hollow Rectangle Pattern
    static void print21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Printing The Number Pattern
    static void print22(int n){
        for(int i = 0; i < 2 * n - 1; i++){
            for(int j = 0; j < 2 * n - 1; j++){
                int top = i;
                int left = j;
                int down = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
