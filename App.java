public class App {

    public static void main(String args[]) {
        System.out.println("App.main");
    }

    private static void doStuff(){
        System.out.println("FeatureX: Do stuff!!");
    }

    private static void featureZ(){
        doStuff();
    }
}

