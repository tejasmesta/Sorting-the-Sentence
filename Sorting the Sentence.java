class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        
        List<String> l = new ArrayList<>();
        
        for(String ss:arr)
        {
            String temp = ss.substring(ss.length()-1,ss.length()) + ss.substring(0,ss.length()-1);
            
            l.add(temp);
            
            System.out.println(ss);
        }
        
        Collections.sort(l);
        
        String ans = "";
        
        for(String ss:l)
        {
            System.out.println(ss);
            ans += (ss.substring(1,ss.length()) + " ");
        }
        
        return ans.substring(0,ans.length()-1);
    }
}
