
//Find result after alternate add_sub on N👇
import java.io.*;
import java.util.*;

class UserMainCode2 {
    public int AddSub(int input1, int input2) {
        int result = 0;
        boolean add = true;
        if (input2 == 1) {
            for (int i = input1; i >= 1; i--) {
                if (add) result += i;
                else result -= i;
                add = !add;
            }
        } else {
            result += input1;
            add = true;
            for (int i = input1 - 1; i >= 1; i--) {
                if (add) result += i;
                else result -= i;
                add = !add;
            }
        }
        return result;
    }
}