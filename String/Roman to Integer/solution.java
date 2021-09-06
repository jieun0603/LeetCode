class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = getNumber(s.charAt(i));

            if (curr > prev) {
                answer += curr - prev*2;
            } else {
                answer += curr;
            }

            prev = curr;
        }
        return answer;
    }
    
    private static int getNumber(char text){
        switch(text){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}