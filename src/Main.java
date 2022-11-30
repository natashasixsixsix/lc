public class Main {
    public static void main(String[] args) {
        boolean bol = true;
        dfs(bol);
        System.out.println(bol);
    }
    public static void dfs(boolean bol){
        bol = false;
    }
}