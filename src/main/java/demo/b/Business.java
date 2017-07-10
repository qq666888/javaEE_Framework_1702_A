package demo.b;

/**
 * Created by 齐琪 on 2017/7/6.
 */
public class Business {

    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
