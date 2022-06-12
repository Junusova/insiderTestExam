package utils;

import com.codeborne.selenide.Selenide;

import java.io.IOException;

import static java.lang.System.out;


public class CommandExecutor {
    private static final ThreadLocal<Runtime> RUNTIME = ThreadLocal.withInitial(Runtime::getRuntime);

    public static Process execute(SshCommands sshCommands) {
        try {
            Process process = RUNTIME.get().exec(sshCommands.getCommand());
            Selenide.sleep(50000);
            out.println(" Process " + process.toString() + " was successfully established!");
            return process;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new AssertionError("Something wrong");
    }
}
