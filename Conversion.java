public class Conversion
{
    public static void main(String[] args)
    {

      float miles;
      double inches;
      double feet;
      double yards;
      double millimeters;
      double centimeters;
      double meters;
      double kilometers;

      miles = 1/2f;
      yards = miles * 1760;
      feet = yards * 3;
      inches = feet * 12;
      kilometers = miles * 1.609344;
      meters = kilometers * 1000;
      centimeters = meters * 100;
      millimeters = centimeters * 10;

      System.out.println("The distance from the house to the nearest store is: ");
      System.out.println("Miles: " + miles);
      System.out.println("Yards: " + yards);
      System.out.println("Feet: " + feet);
      System.out.println("Inches: " + inches);
      System.out.println("Kilometers: " + kilometers);
      System.out.println("Meters: " + meters);
      System.out.println("Centimeters: " + centimeters);
      System.out.println("Millimeters: " + millimeters);

      float gallons;
      double fluid_ounces;
      double pints;
      double quarts;
      double milliliters;
      double liters;

      gallons = 1/2f;
      quarts= gallons * 4;
      pints = quarts * 2;
      fluid_ounces = pints * 16;
      liters = gallons * 3.78541;
      milliliters = liters * 1000;

      System.out.print(" \n");
      System.out.println("The amount of the milk is: ");
      System.out.println("Gallons: "+ gallons);
      System.out.println("Quarts: " + quarts);
      System.out.println("Pints: " + pints);
      System.out.println("Fluid Ounces: "+ fluid_ounces);
      System.out.println("Liters: " + liters);
      System.out.println("Milliliters: " + milliliters);

    }
}
