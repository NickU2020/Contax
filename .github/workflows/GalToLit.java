/*
  Try this 1-1
  
  This program converts gallons to liters.
  
  Call this program GalToLit.java.
*/
class GalToLit {
  public static void main (String[] args) {
    double gallonns; // holds the number of gallons 
    double liters; // holds the conversion to liters
    
    gallons = 10; // start with 10 gallons
    
    liters = gallons * 3.7854; // convert to liters
    
    System.out.println(gallons + " gallons is " + liters + " liters. " );
  }
}
