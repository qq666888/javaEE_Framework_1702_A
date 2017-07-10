package demo.b;



/**
 * Created by 齐琪 on 2017/7/6.
 */
public class Service {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new UsbWriter());
        business.write();
    }
}
