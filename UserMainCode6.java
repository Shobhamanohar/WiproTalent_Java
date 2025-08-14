
import java.io.*;
import java.util.*;

class UserMainCode6
{
    public String userIdGeneration(String input1, String input2, int input3, int input4)
    {
        String smallerName = "";
        String longerName = "";

        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareToIgnoreCase(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }

        String pin = String.valueOf(input3);
        int N = input4;

        char nthLeft = pin.charAt(N - 1);
        char nthRight = pin.charAt(pin.length() - N);
        char lastCharSmaller = smallerName.charAt(smallerName.length() - 1);

        String userId = lastCharSmaller + longerName + nthLeft + nthRight;

        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < userId.length(); i++) {
            char c = userId.charAt(i);
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }

        return toggled.toString();
    }
}
