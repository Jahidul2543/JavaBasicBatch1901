package controlflow;

class IfElseDemo {

    public static void main(String[] args) {

    /**
     *
     * if (condition true/false){
     *     // if the condition is true execute this code block
     * }
     * els {
     *     // when if condition is false execute this else block
     * }
     *
     * */

    boolean rain = true;

      if (rain == true){

          // turn on wiper
          boolean wiper = true;
          System.out.println(" It' s raining, wiper is on");

      }

      else {

          // Keep the wiper off
          boolean wiper = false;
          System.out.println(" It's not raining Wiper is off");
      }

    }

}
