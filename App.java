public class App {

    public static void main(String args[]) {
        System.out.println("App.main");
    }

    private static void doStuff(){

        System.out.println("App.doStuff called by featureZ or FeatureY");
    }

    private static void featureZ(){
        doStuff();

        System.out.println("App.doStuff called by featureY");

    }

    private static void featureY() {
        doStuff();
    }

}

