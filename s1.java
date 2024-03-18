import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the index to replace: ");
        int indexToReplace = scanner.nextInt();

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);

        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    private static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            System.out.println("Index out of bounds");
            return str;
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacementChar;

        return new String(charArray);
    }
}
