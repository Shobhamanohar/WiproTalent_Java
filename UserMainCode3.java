//Find password (stable unstable)
import java.io.*;
import java.util.*;

class UserMainCode3
{
    public int findPassword(int input1, int input2, int input3, int input4, int input5)
    {
        int[] inputs = {input1, input2, input3, input4, input5};
        int stableSum = 0;
        int unstableSum = 0;

        for(int num : inputs)
        {
            if(isStable(num))
                stableSum += num;
            else
                unstableSum += num;
        }

        return stableSum - unstableSum;
    }

    private boolean isStable(int num)
    {
        String s = String.valueOf(num);
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char c : s.toCharArray())
        {
            if(freq.containsKey(c))
                freq.put(c, freq.get(c) + 1);
            else
                freq.put(c, 1);
        }

        Collection<Integer> values = freq.values();
        int first = -1;
        for(int val : values)
        {
            if(first == -1)
                first = val;
            else if(first != val)
                return false;
        }
        return true;
    }
}