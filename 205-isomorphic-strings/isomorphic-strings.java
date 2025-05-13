class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int []mappingS = new int[256];
        int []mappingT = new int[256];

        for(int i =0;i<256;i++){
             mappingS[i] = -1;
            mappingT[i] = -1;
        }

        for(int i =0;i<s.length();i++){
            char c1 =s.charAt(i);
            char c2 =t.charAt(i); 
            if(mappingS[c1] != -1){
                if(mappingS[c1] != c2) return false;
            }else{
                mappingS[c1] = c2;
            }

            if(mappingT[c2] != -1){
                if(mappingT[c2] != c1) return false;
            }else{
                mappingT[c2] = c1;
            }
        }


        return true;
    }
}