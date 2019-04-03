package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RecipeTest {
    private Recipe r1;


    @Before
    public void setUp(){
        r1 = new Recipe();
        System.out.println("Initial Tests for Recipe Completed");

    }

    @After
    public void emptyRecipe(){
        r1 = null;
    }


    @Test
    public void setAmtChocolateTest(){
        System.out.println(".......setAmtChocolateTest.......");
        try{  
            r1.setName("r1");
            r1.setAmtChocolate("");

            assertNotNull(r1.getAmtChocolate());
            assertEquals(0,r1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtChocolate()<=0);
           
        }

        try{
            
            r1.setAmtChocolate("two");

            assertNull(r1.getAmtChocolate());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtChocolate()<=0);
        }

        try{
            
            r1.setAmtChocolate("-1");

            assertNotNull(r1.getAmtChocolate());
            assertEquals(0,r1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtChocolate()<=0);
        }

        try{
            
            r1.setAmtChocolate("3/4");

            assertNotNull(r1.getAmtChocolate());
            assertEquals(0,r1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtChocolate()<=0);
        }

        try{
            
            r1.setAmtChocolate("10");

            assertEquals(10,r1.getAmtChocolate());

            assertTrue(r1.getAmtChocolate()>0);
            System.out.print("The amount of Chocolate in the stock is: ");
            System.out.println(r1.getAmtChocolate());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtChocolate()<=0);
        }
        System.out.println(".......setAmtChocolateTest Completed.......");
    }


    @Test
    public void setAmtCoffeeTest(){
        System.out.println("..........setAmtCoffeeTest...........");
        try{  
            r1.setName("r1");
            r1.setAmtCoffee("");

            assertNotNull(r1.getAmtCoffee());
            assertEquals(0,r1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtCoffee()<=0);
        }

        try{
           
            r1.setAmtCoffee("ten");

            assertNull(r1.getAmtCoffee());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtCoffee()<=0);
        }

        try{
            
            r1.setAmtCoffee("-1");

            assertNotNull(r1.getAmtCoffee());
            assertEquals(0,r1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtCoffee()<=0);
        }

        try{
            
            r1.setAmtCoffee("1/2");

            assertNotNull(r1.getAmtCoffee());
            assertEquals(0,r1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtCoffee()<=0);
        }

        try{
            
            r1.setAmtCoffee("5");

            assertEquals(5,r1.getAmtCoffee());

            assertTrue(r1.getAmtCoffee()>0);
            System.out.print("The amount of Coffee in the stock is: ");
            System.out.println(r1.getAmtCoffee());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtCoffee()<=0);
        }
        System.out.println("..........setAmtCoffeeTest Completed...........");
    }


    @Test
    public void setAmtSugarTest(){
        System.out.println("..........setAmtSugarTest......");
        try{  
            r1.setName("r1");
            r1.setAmtSugar("");

            assertNotNull(r1.getAmtSugar());
            assertEquals(0,r1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtSugar()<=0);
        }

        try{
            
            r1.setAmtSugar("ten");

            assertNull(r1.getAmtSugar());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtSugar()<=0);
        }

        try{
            
            r1.setAmtSugar("-1");

            assertNotNull(r1.getAmtSugar());
            assertEquals(0,r1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtSugar()<=0);
        }

        try{
            
            r1.setAmtSugar("1/2");

            assertNotNull(r1.getAmtSugar());
            assertEquals(0,r1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtSugar()<=0);
        }

        try{
            
            r1.setAmtSugar("1");

            assertEquals(1,r1.getAmtSugar());

            assertTrue(r1.getAmtSugar()>0);
            System.out.print("The amount of Sugar in the stock is: ");
            System.out.println(r1.getAmtSugar());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtSugar()<=0);
        }
        System.out.println("..........setAmtSugarTest Completed......");
    }


    @Test
    public void setAmtMilkTest(){
        System.out.println("...........setAmtMilkTest........");
        try{  
            r1.setName("r1");
            r1.setAmtMilk("");

            assertNotNull(r1.getAmtMilk());
            assertEquals(0,r1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtMilk()<=0);
        }

        try{
            
            r1.setAmtMilk("ten");

            assertNull(r1.getAmtMilk());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtMilk()<=0);
        }

        try{
           
            r1.setAmtMilk("-1");

            assertNotNull(r1.getAmtMilk());
            assertEquals(0,r1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtMilk()<=0);
        }

        try{
            
            r1.setAmtMilk("1/2");

            assertNotNull(r1.getAmtMilk());
            assertEquals(0,r1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtMilk()<=0);
        }

        try{
            
            r1.setAmtMilk("15");

            assertEquals(15,r1.getAmtMilk());

            assertTrue(r1.getAmtMilk()>0);
            System.out.print("The amount of Milk in the stock is: ");
            System.out.println(r1.getAmtMilk());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getAmtMilk()<=0);
        }
        System.out.println("...........setAmtMilkTest Completed........");
    }


    @Test
    public void setPriceTest() throws RecipeException{
    	
        System.out.println("........setPriceTest........");
        try{  
            r1.setName("r1");
            r1.setPrice("");

            assertNotNull(r1.getPrice());
            assertEquals(0,r1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getPrice()<=0);
        }

        try{
            
            r1.setPrice("ten");

            assertNull(r1.getPrice());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",r1.getPrice()<=0);
        }

        try{
            
            r1.setPrice("-1");

            assertNotNull(r1.getPrice());
            assertEquals(0,r1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Price must be a positive integer",r1.getPrice()<=0);
        }

        try{
            
            r1.setPrice("1/2");

            assertNotNull(r1.getPrice());
            assertEquals(0,r1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Price must be a positive integer",r1.getPrice()<=0);
        }

        try{
            
            r1.setPrice("1.5");

            assertEquals(1,r1.getPrice());

            assertTrue(r1.getPrice()>0);

        }
        catch(RecipeException e){
            assertTrue("Price must be a positive integer",r1.getPrice()<=0);
        }
        
        try{
            
            r1.setPrice("150");

            assertEquals(150,r1.getPrice());

            assertTrue(r1.getPrice()>0);
            System.out.print("The Price of a recipe is: ");
            System.out.println(r1.getPrice());

        }
        catch(RecipeException e){
            assertTrue("Price must be a positive integer",r1.getPrice()<=0);
        }
        System.out.println("........setPriceTest Completed........");
    }


    @Test
    public void setNameTest(){
        System.out.println("...........setNameTest............");

        r1.setName("");
        assertNotNull(r1.getName());
        assertEquals("",r1.getName());
        System.out.print("The name set is: ");
        System.out.println(r1.getName());


        r1.setName(null);
        assertNotNull(r1.getName());
        assertEquals("",r1.getName());
        System.out.print("The name set is: ");
        System.out.println(r1.getName());

  
        r1.setName("Mocha111");
        assertNotNull(r1.getName());
        assertEquals("Mocha111",r1.getName());
        System.out.print("The name set is: ");
        System.out.println(r1.getName());
        
        
        System.out.println("...........setNameTest Completed............");
    }

    
    @Test
    public void toStringTest(){
        System.out.println("..........toStringTest.........");
        assertNotNull(r1.toString());
        
        r1.setName("Mocha111");
        assertEquals("Mocha111",r1.toString());
        System.out.print("The toString set is: ");
        System.out.println(r1.toString());

        r1.setName("");
        assertEquals("",r1.toString());
        System.out.print("The toString set is: ");
        System.out.println(r1.toString());

    
        r1.setName(null);
        assertEquals("",r1.getName());
        System.out.print("The toString set is: ");
        System.out.println(r1.toString());
        
        System.out.println("..........toStringTest Completed.........");
    }


    @Test
    public void hashCodeTest(){
        System.out.println(".........hashCodeTest........");
        
        Recipe r = new Recipe();
        r.setName("");
        assertNotNull(r.hashCode());
        
		
        long val1 = r.hashCode();
        long val2 = 31 + r.getName().hashCode();
        assertEquals(val1,val2);

        r.setName(null);
        long val3 = r.hashCode();
        long val4 = 31;
        assertEquals(val4,val3);
      
       
        r.setName("Mocha111");
        long val5 = r.hashCode();
        long val6 = 31 + r.getName().hashCode();
        assertEquals(val5,val6);
        System.out.println(".........hashCodeTest........");
    }


    @Test
    public void equalsTest(){
        System.out.println("........equalsTest..........");
        
        Recipe r1 = new Recipe();
        Recipe r2 = new Recipe();
        assertTrue(r1.equals(r2)); 
        assertTrue(r1.equals(r1));
        assertFalse(r1.equals(null));
       
        r1.setName("Carmel Machiato");
        assertFalse(r1.equals(r2)); 
        
        r2.setName(null); 
        assertFalse(r1.equals(r2));
        
        r1 = new Recipe();
		r2 = new Recipe();
		r1.setName(null);
		r2.setName("Latte");
		assertFalse(r1.equals(r2));

     
        r1 = new Recipe();
		r2 = new Recipe();
		r1.setName("Coffee");
		r2.setName("Latte");
		assertFalse(r1.equals(r2));
        
        System.out.println("........equalsTest Completed..........");
    }

}
