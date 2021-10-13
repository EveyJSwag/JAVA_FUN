package application;

public class ApplicationManager
{
    private static ApplicationManager instance = null;

    private ApplicationManager()
    {
        
    }

    public static ApplicationManager getInstance()
    {
        if (instance == null)
        {
            instance = new ApplicationManager();
        }
        return instance;
    }

    public void runApplication(Swingable window)
    {
        window.runMe();
    }
}
