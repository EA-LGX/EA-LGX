public class HashAlgorithm {
    public static int stringToHashValue(String key,int num) {
        int hashValue=0;
        for(int i=0;i<key.length();i++){
            hashValue=hashValue+(int)key.charAt(i);
        }
        hashValue=hashValue%num;
        return hashValue;
    }
}