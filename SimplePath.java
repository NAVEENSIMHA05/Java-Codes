class Solution {
    public String simplifyPath(String path) {
        Stack<String> check =new Stack<>();
       for(String single: path.split("/")){
        if(single.equals("")||single.equals(".")){
            continue;
        }
        else if(single.equals("..")){
            if(!check.isEmpty()){
                check.pop();
            }
        }
        else{
            check.push(single);
        }
       }
       StringBuilder sb = new StringBuilder();
        for(String add: check){
            sb.append("/").append(add);
        }
        return sb.length()==0? "/" : sb.toString();
    }
}

class SimplePath{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        Solution ob = new Solution();
        System.out.println(ob.simplifyPath(s));
    }
}