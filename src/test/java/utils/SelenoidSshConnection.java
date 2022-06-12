package utils;

import static utils.SshCommands.SELENOID;

public class SelenoidSshConnection {

    private static SelenoidSshConnection instance;

    private SelenoidSshConnection() {}

    public static synchronized SelenoidSshConnection getInstance() {
        if (instance == null)
            instance = new SelenoidSshConnection();
        return instance;
    }

    public void establish() {
        CommandExecutor.execute(SELENOID);
    }
}
