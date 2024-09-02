public class Main {
    void printVarr(String... args){
        for (String arg : args) {
            System.out.println(arg + "");
            
        }
    }

    public static void main (String[] args){
        Main a = new Main();
        a.printVarr(new String[]{"Hello", "World"});
    }
    
}
