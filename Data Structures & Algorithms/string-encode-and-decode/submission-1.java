class Solution {

    public String encode(List<String> strs) {
         StringBuilder encodeStr = new StringBuilder();
         for(String s: strs){
          encodeStr.append(s.length()).append('#').append(s);
         }
         return  encodeStr.toString();
    }

    public List<String> decode(String str) {
          List<String> res= new ArrayList<>();

          int i=0;
          while(i<str.length()){
            int sepindx = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,sepindx));
            i= sepindx+1;
            String word = str.substring(i,i+len);
            res.add(word);
            i=i+len;
          }
          return res;
    }
}
