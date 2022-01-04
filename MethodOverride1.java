class TV {
    public void switchON() {
        System.out.println("TV Switched ON");
    }

    public void changeChannel() {
        System.out.println("TV Channel Changed");
    }

}

class SmartTV extends TV {
    public void switchON() {
        System.out.println("Smart TV Switched ON");
    }

    public void changeChannel() {
        System.out.println("Smart TV Channel Changed");
    }

    public void browse() {
        System.out.println("Smart TV Channel Browsing");
    }
}

public class MethodOverride1 {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV stv = new SmartTV();
        stv.switchON();
        stv.changeChannel();
        stv.browse();
    }
}
