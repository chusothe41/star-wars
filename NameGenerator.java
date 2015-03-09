/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String name;
    private String lastName;
    private String lastName2;
    private String bornLocation;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String name, String lastName, String lastName2, String bornLocation)
    {
        // initialise instance variables
        this.name = name;
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.bornLocation = bornLocation;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName()
    {
        // put your code here
        System.out.println(lastName.substring(0, 3) + name.substring(0, 3) + " " + lastName.substring(0, 2) + bornLocation.substring(0, 3));              
    }
}
