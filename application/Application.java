package application;

class Application
{
    // Main
    public static void main(String[] args)
    {
        MainWindow appMainWindow = new MainWindow("Cool Window");
        ApplicationManager.getInstance().runApplication(appMainWindow);
    }
}
