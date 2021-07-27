class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count  = 1;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        for (int i = 0; i < length; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

/*
	---------------------------------------
	for (int i = 0; i < length; i++) {
		if (s.indexOf(s.charAt(i)) == i) {
			map.put(s.charAt(i), count);
		} else {
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
	}
	---------------------------------------
	
	이 부분을 아래와 같이 바꾸면 Runtime 이 절반으로 줄어든다.
	getOrDefault 을 이번에 알게되었다.

	---------------------------------------
	for (int i = 0; i < n; i++) {
		char c = s.charAt(i);
		count.put(c, count.getOrDefault(c, 0) + 1);
	}
	---------------------------------------

*/
