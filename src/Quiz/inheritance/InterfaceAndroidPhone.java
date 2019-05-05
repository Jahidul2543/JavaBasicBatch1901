package Quiz.inheritance;

public interface InterfaceAndroidPhone extends SymbianPhone {

    public void androidOs();

    public void toucScreen();

    default  public void addAttena(){

         System.out.println("Added method using default keyword in Interface");

     }

}
