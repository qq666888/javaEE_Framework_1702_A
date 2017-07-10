package demo.a;

/**
 * Created by 齐琪 on 2017/7/6.
 */
public class Business {

    private FloppyWriter floppyWriter;
//    private UsbWriter usbWriter;

//    public Business(UsbWriter usbWriter) {
//        this.usbWriter = usbWriter;
//    }


    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void write() {
        floppyWriter.writeToFloppy();
//        usbWriter.writeToUsb();
    }
}