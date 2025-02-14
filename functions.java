public class functions {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Nidhi");
        System.out.println(sb);
        
        //charAt()
        System.out.println(sb.charAt(0));

        //setCharAt()
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //insert
        sb.insert(3, 'd');
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append(' ');
        sb.append('A');
        sb.append('m');
        sb.append('b');
        sb.append('a');
        sb.append('t');
        sb.append('k');
        sb.append('a');
        sb.append('r');
        System.out.println(sb);
    }
}
