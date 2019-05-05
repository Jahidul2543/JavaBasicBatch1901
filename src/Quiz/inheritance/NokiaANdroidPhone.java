package Quiz.inheritance;

public class NokiaANdroidPhone extends Nokia5510 implements InterfaceAndroidPhone, SymbianPhone {
     /**
      *
      * Java does not support multiple inheritance(cant extend multiple classes in one class)
      * Java does support multiple implementations of interfaces
      *
      * */
    // What is the return type?

    public void androidOs() {

        System.out.println("This android OS");

    }

    public void toucScreen() {
        System.out.println("Create Touch Screen");
    }


    public void getMakeCallAndSendTextFunctionalityFromNokia5510(){

        super.makeCall();
        super.sendText();

    }

    public static void main(String[] args) {

        NokiaANdroidPhone objAndroidPhone = new NokiaANdroidPhone();
        objAndroidPhone.androidOs();
        objAndroidPhone.toucScreen();
        objAndroidPhone.getMakeCallAndSendTextFunctionalityFromNokia5510();
        objAndroidPhone.addAttena();

    }
}
