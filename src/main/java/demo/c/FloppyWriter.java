package demo.c;

/**
 * Created by 齐琪 on 2017/7/6.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to floppy...");
    }
}
