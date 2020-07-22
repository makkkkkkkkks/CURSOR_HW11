package main.java.com.makkkkkkkks.executor;

import main.java.com.makkkkkkkks.outOfMemory.CrunchifyGenerateOOM;

public class Executor {
    public static void execute() throws Exception {
        CrunchifyGenerateOOM memoryTest = new CrunchifyGenerateOOM();
        memoryTest.generateOOM();
    }
}
