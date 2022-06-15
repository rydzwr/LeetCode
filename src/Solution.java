import java.util.*;

class Solution
{
    public static void moveZeroes(int[] nums)
    {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static boolean isValidSudoku(char[][] board)
    {
        int n = board.length;
        Set<Integer>[] rows = new Set[n];
        Set<Integer>[] cols = new Set[n];
        Set<Integer>[] blocks = new Set[n];

        for(int i = 0; i < n; i++) {
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            blocks[i] = new HashSet<Integer>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == '.') continue;
                int k = 3 * (i /3) + (j / 3);

                int num = board[i][j] - '0';
                if (rows[i].contains(num)) return false;
                if (cols[j].contains(num)) return false;
                if (blocks[k].contains(num)) return false;

                rows[i].add(num);
                cols[j].add(num);
                blocks[k].add(num);
            }
        }
        return true;
    }

    public static void reverseString(char[] s)
    {
        String str = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            str += s[i];
        }
        s = str.toCharArray();
        System.out.println(s);
    }

    public static int firstUniqChar(String s)
    {
        return -1;

        // TO DO
    }

    public static void main(String[] args)
    {
        //int[] nums = new int[]{ 0,1,0,3,12 };
        //Solution.moveZeroes(nums);

        //int[] nums = new int[]{ 3,3 };
        //Solution.twoSum(nums, 6);

        /*
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(Solution.isValidSudoku(board));


         */

        //char[] s = new char[]{ 'a', 'b', 'c', 'd', 'e' };
        //.reverseString(s);

        String s = "leetcode";
        System.out.println(Solution.firstUniqChar(s));    }
}