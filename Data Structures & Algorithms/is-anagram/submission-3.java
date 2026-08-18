class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> charac= new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(!charac.containsKey(s.charAt(i))) charac.put(s.charAt(i),1);
            else charac.put(s.charAt(i),charac.get(s.charAt(i))+1);

        }
        for(int i=0;i<t.length();i++){
            if(!charac.containsKey(t.charAt(i))) return false;
            charac.put(t.charAt(i),charac.get(t.charAt(i))-1);
        }
        for(int i=0;i<s.length();i++){
            if(charac.get(s.charAt(i))!=0) return false;
        }
        return true;
    }
}
