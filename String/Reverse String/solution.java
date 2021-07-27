class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

/*
	char temp 를 while 문 밖으로 빼니 메모리 사용량이 살짝 줄어든다.
	
	---------------------------------------
	int left = 0, right = s.length-1;
    char temp;
	
	while (left < right) {
		temp = s[left];
	---------------------------------------
*/