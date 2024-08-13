package template;

public class CustomWindow extends Window {
    @Override
    protected void afterClose() {
        System.out.println("Im adding some logs instead of default actions");
    }
}
