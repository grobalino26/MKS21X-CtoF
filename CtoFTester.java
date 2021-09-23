//The functions should have ints as parameters. celsiusToFarenheit should take celsius and return farenheit. farenheitToCelsius should take farenheit and return celsius.
public class CtoFTester {
  public static void main (String[] args){
    System.out.println(celsiusToFarenheit(30));
    System.out.println(farenheitToCelsius(30));
  }
  public static int celsiusToFarenheit (int celsius) {
    return celsius * 9 / 5 + 32;
  }
  public static int farenheitToCelsius (int farenheit) {
    return (farenheit - 32) * 5 / 9;
  }
}
//I couldn't push the file so I'm just manually copy pasting the code using the website. It wanted me to merge stuff. I think it was because I created the file here first and then deleted it because I realized that was wrong. 
