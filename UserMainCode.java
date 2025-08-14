
//: Generate series and find Nth element👇
import java.io.*;
import java.util.*;

class UserMainCode
{
    public int seriesN(int input1, int input2, int input3, int input4)
    {
        int a = input1, b = input2, c = input3, N = input4;
        int diff1 = b - a;
        int diff2 = c - b;
        
        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;
        
        int term = c;
        boolean useDiff1 = true;
        for (int i = 4; i <= N; i++)
        {
            if (useDiff1)
                term += diff1;
            else
                term += diff2;
            useDiff1 = !useDiff1;
        }
        return term;
    }
}
