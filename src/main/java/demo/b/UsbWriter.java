package demo.b;

/**
 * Created by 齐琪 on 2017/7/6.
 */
public class UsbWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to USB...");
    }
}
