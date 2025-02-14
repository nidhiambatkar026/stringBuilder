public class reverse {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Nidhi");
        StringBuilder sb1 = new StringBuilder("");

        System.out.println("Original String: "+sb);

        for(int i=sb.length()-1; i>=0; i--){
            sb1.append(sb.charAt(i));
        }
        System.out.println("Reverse String: "+sb1);
    }
}
