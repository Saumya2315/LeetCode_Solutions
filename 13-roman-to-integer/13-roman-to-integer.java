class Solution {
    public int romanToInt(String s) {
        if(s.length()==0 || s.length()>15){
            return 0;
        }
        char[] symbol = {'I' , 'V' , 'X' , 'L' , 'C' , 'D' , 'M'};        
        int[] value = {1 , 5 , 10 , 50 , 100 , 500 , 1000};
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0 ; i<7 ; i++){
            map.put(symbol[i] , value[i]);
        }
        int count=0;
        // for(char c : s.toCharArray())
        for(int i=0 ; i<s.length()-1 ; i++)
        {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                count = count - map.get(s.charAt(i));
            }
            else{
                count = count + map.get(s.charAt(i)); 
            }
        }
        return count + map.get(s.charAt(s.length() - 1));
    }
}