
package sep28_inheritance;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Father father = new Father();
        Child son = new Child();
        
        father.setName("Rahim");
        
        son.setAge(27);
        son.setIncome(10000000);
        
        System.out.println("Father name is :" + father.getName() + " His net wealth: " + father.property(50000000));
        
        System.out.println(" Son age: " + son.getAge() + 
                " He has bought a house worth : " + son.house(20000000) + 
                " His Income : " + son.getIncome() + 
                " His net wealth : " + son.income(10000000)
        );
    }
}
