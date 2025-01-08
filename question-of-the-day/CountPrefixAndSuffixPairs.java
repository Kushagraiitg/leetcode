class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            String temp = words[i];
            for(int j=i+1;j<words.length;j++){
                String temp2 = words[j];
                if(startsWith(temp, temp2)&&endsWith(temp, temp2)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean startsWith(String a, String b){
        if(a.length()>b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private boolean endsWith(String a, String b){
        if(a.length()>b.length()){
            return false;
        }
        int size1 = a.length();
        int size2 = b.length();
        for(int i=0;i<size1; i++){
            if(a.charAt(size1-1-i)!=b.charAt(size2-1-i)){
                return false;
            }
        }
        return true;
    }

}
