package org.example.Command;

public class ExitCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Закінчення програми!");
        System.exit(0);
    }
}
