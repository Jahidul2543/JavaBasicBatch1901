package inheritance;

public class NokiaPhone extends SampleNokiaPhone {

    public void makeCall(){
        System.out.println("This method can make call");
    }

    public static void main(String[] args) {

        /**
         * What are the ways I can get the value of x from SampleNokiaPhone.java class?
         *
         * */

        NokiaPhone objNokiaPhone = new NokiaPhone();

        System.out.println( "Value of x from SampleNokiaPhone: " + objNokiaPhone.x);

        System.out.println("Sending text: " + objNokiaPhone.sendText());

    }





}
