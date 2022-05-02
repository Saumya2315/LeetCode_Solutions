class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> intStack=new Stack<Integer>();
        StringBuilder temp = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==']')
            {
                String str = stringStack.pop().toString();
                while(!(str.equals("["))){
                    temp.insert(0 , str);
                    str=stringStack.pop();
                }
                str=temp.toString();
                
                int count = intStack.pop()-1;
                while(count>0){
                    temp.append(str);
                    count--;
                }
                System.out.println(temp);
                stringStack.push(temp.toString());
                temp.setLength(0);
            }
            else if( (int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
            {
                int val=0;
                while( (int)s.charAt(i) >=48 && (int)s.charAt(i)<=57)
                {
                    val=val*10 +Integer.parseInt(Character.toString(s.charAt(i)));
                    i++;
                }
                i--;
                intStack.push(val);
            }
            else
            {
                stringStack.push(Character.toString(s.charAt(i)));
            }
        }
        System.out.println(stringStack.size());
        int size=stringStack.size();
        for(int j=0 ; j<size ; j++)
        {
            finalStr.insert(0 , stringStack.pop());
            System.out.println(finalStr);
        }
        return finalStr.toString();
    }
}