class Solution {

    static Map<Character, String> NUMS = new HashMap() {
        {
            put('0', "");
            put('1', "");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        dfs(sb, 0, digits, NUMS, res);

        return res;
    }

    private void dfs(StringBuilder sb, int index, String digits, Map<Character, String> nums, List<String> res) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        char digit = digits.charAt(index);
        String options = nums.getOrDefault(digit, digit + "");
        for (char option : options.toCharArray()) {
            sb.append(option);
            dfs(sb, index + 1, digits, nums, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
