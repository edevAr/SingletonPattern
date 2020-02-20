public class SharedUtilities {
    private static SharedUtilities instance;

    private SharedUtilities(){}

    public static SharedUtilities getInstance(){
        if(instance == null){
            instance = new SharedUtilities();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
