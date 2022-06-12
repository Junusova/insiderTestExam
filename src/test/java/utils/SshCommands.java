package utils;

public enum SshCommands {

    SELENOID ("ssh -L 4444:selenoid:4444"),
    ;

    public String getCommand() {
        return sshCommand;
    }

    SshCommands(String command) {
        this.sshCommand = command;
    }

    private final String sshCommand;
}
