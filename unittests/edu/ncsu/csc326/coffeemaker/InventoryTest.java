package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    private int stockAmt = 0;
    private Inventory inventory;
  

    private int currentAmtChocolate;
    private int currentAmtSugar;
    private int currentAmtMilk;
    private int currentAmtCoffee;

    @Before
    public void setUp() {

        inventory = new Inventory();
        currentAmtCoffee = inventory.getCoffee();
        currentAmtMilk = inventory.getMilk();
        currentAmtSugar = inventory.getSugar(); 
        currentAmtChocolate = inventory.getChocolate();
       

        
        assertEquals(15, currentAmtCoffee);
        assertEquals(15, currentAmtMilk);
        assertEquals(15, currentAmtSugar);
        assertEquals(15, currentAmtChocolate);

        System.out.println("Initial tests for inventory successful");
    }

    @After
    public void emptyInventory() throws Exception {
        inventory = null;
    }

  
    @Test
    public void setChocolateTest(){

        System.out.println("..........setChocolateTest.......");

        inventory.setChocolate(stockAmt);
        currentAmtChocolate = inventory.getChocolate();
        assertEquals(0,currentAmtChocolate);
        System.out.print("Curent Amount of Chocolate with setting stock empty: ");
        System.out.println(currentAmtChocolate);

   
        stockAmt = 1;
        inventory.setChocolate(stockAmt);
        currentAmtChocolate = inventory.getChocolate();
        assertEquals(1,currentAmtChocolate);
        System.out.print("Curent Amount of Chocolate with setting 1 elememt in stock: ");
        System.out.println(currentAmtChocolate);

      
        stockAmt = 20;
        inventory.setChocolate(stockAmt);
        currentAmtChocolate = inventory.getChocolate();
        assertEquals(20,currentAmtChocolate);
        System.out.print("Curent Amount of Chocolate with setting 20 elememt in stock: ");
        System.out.println(currentAmtChocolate);
        
        stockAmt = -10;
        inventory.setChocolate(stockAmt);
        currentAmtChocolate = inventory.getChocolate();
        assertEquals(20,currentAmtChocolate);
        System.out.print("Curent Amount of Chocolate with setting negative elememt in stock: ");
        System.out.println(currentAmtChocolate);
        

        System.out.println("...........setChocolateTest Completed.......");
    }


    @Test
    public synchronized void addChocolateTest() throws InventoryException{

        System.out.println("........addChocolateTest........");

  
        try{
            inventory.addChocolate("two");
            currentAmtChocolate = inventory.getChocolate();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentAmtChocolate>=0);
        }


        try{
        inventory.addChocolate("-1");
        currentAmtChocolate = inventory.getChocolate();
        }
        catch(InventoryException e){
           
            assertTrue("Units of coffee must be a positive integer",currentAmtChocolate>=0);
        }

        inventory.addChocolate("2");
        currentAmtChocolate = inventory.getChocolate();
        assertEquals(17,currentAmtChocolate);
        System.out.print("After adding Chocolate: ");
        System.out.println(currentAmtChocolate);

        System.out.println("........addChocolateTest completed........");

    }


    @Test
    public void setCofeeTest(){

        System.out.println("........setCofeeTest.........");

        
        inventory.setCoffee(stockAmt);
        currentAmtCoffee = inventory.getCoffee();
        assertEquals(0,currentAmtCoffee);
        System.out.print("Curent Amount of Coffee with setting stock empty: ");
        System.out.println(currentAmtCoffee);

        
        stockAmt = 1;
        inventory.setCoffee(stockAmt);
        currentAmtCoffee = inventory.getCoffee();
        assertEquals(1,currentAmtCoffee);
        System.out.print("Curent Amount of Coffee with setting 1 elememt in stock: ");
        System.out.println(currentAmtCoffee);

        
        stockAmt = 10;
        inventory.setCoffee(stockAmt);
        currentAmtCoffee = inventory.getCoffee();
        assertEquals(10,currentAmtCoffee);
        System.out.print("Curent Amount of Coffee with setting 10 elememt in stock: ");
        System.out.println(currentAmtCoffee);
        
        stockAmt = -1;
        inventory.setCoffee(stockAmt);
        currentAmtCoffee = inventory.getCoffee();
        assertEquals(10,currentAmtCoffee);
        System.out.print("Curent Amount of Coffee with setting negative elememt in stock: ");
        System.out.println(currentAmtCoffee);

        System.out.println("........setCofeeTest Completed.........");
    }


    @Test
    public synchronized void addCoffeeTest() throws InventoryException{

        System.out.println("........addCoffeeTest........");

    
        try{
            inventory.addCoffee("two");
            currentAmtCoffee = inventory.getCoffee();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentAmtCoffee>=0);
        }


        try{
            inventory.addCoffee("-1");
            currentAmtCoffee = inventory.getCoffee();
        }
        catch(InventoryException e){
            
            assertTrue("Units of coffee must be a positive integer",currentAmtCoffee>0);
        }



        inventory.addCoffee("2");
        currentAmtCoffee = inventory.getCoffee();
        assertEquals(17,currentAmtCoffee);
        System.out.print("After adding coffee: ");
        System.out.println(currentAmtCoffee);
        System.out.println("........addCoffeeTest Completed........");

    }

 
    @Test
    public void setMilkTest(){

        System.out.println("......setMilkTest........");

     
        inventory.setMilk(stockAmt);
        currentAmtMilk = inventory.getMilk();
        assertEquals(0,currentAmtMilk);
        System.out.print("Curent Amount of Milk with setting stock empty: ");
        System.out.println(currentAmtMilk);

    
        stockAmt = 1;
        inventory.setMilk(stockAmt);
        currentAmtMilk = inventory.getMilk();
        assertEquals(1,currentAmtMilk);
        System.out.print("Curent Amount of Milk with setting 1 elememt in stock: ");
        System.out.println(currentAmtMilk);

  
        stockAmt = 8;
        inventory.setMilk(stockAmt);
        currentAmtMilk = inventory.getMilk();
        assertEquals(8,currentAmtMilk);
        System.out.print("Curent Amount of Milk with setting 8 elememt in stock: ");
        System.out.println(currentAmtMilk);
        
        stockAmt = -1;
        inventory.setMilk(stockAmt);
        currentAmtMilk = inventory.getMilk();
        assertEquals(8,currentAmtMilk);
        System.out.print("Curent Amount of Milk with setting negative elememt in stock: ");
        System.out.println(currentAmtMilk);


        System.out.println("......setMilkTest Completed........");
    }

  
    @Test
    public synchronized void addMilkTest() throws InventoryException{

        System.out.println("..........addMilkTest........");

      
        try{
            inventory.addMilk("two");
            currentAmtMilk = inventory.getMilk();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentAmtMilk>=0);
        }

        try{
            inventory.addMilk("-1");
            currentAmtMilk = inventory.getMilk();
        }
        catch(InventoryException e){
           
            assertTrue("Units of coffee must be a positive integer",currentAmtMilk>0);
        }

        inventory.addMilk("2");
        currentAmtMilk = inventory.getMilk();
        assertEquals(17,currentAmtMilk);
        System.out.print("After adding Milk: ");
        System.out.println(currentAmtMilk);

        System.out.println("..........addMilkTest Completed........");

    }


    @Test
    public void setSugarTest(){

        System.out.println("........setSugarTest........");

        inventory.setSugar(stockAmt);
        currentAmtSugar = inventory.getSugar();
        assertEquals(0,currentAmtSugar);
        System.out.print("Curent Amount of Sugar with setting stock empty: ");
        System.out.println(currentAmtSugar);

    
        stockAmt = 1;
        inventory.setSugar(stockAmt);
        currentAmtSugar = inventory.getSugar();
        assertEquals(1,currentAmtSugar);
        System.out.print("Curent Amount of Sugar with setting 8 elememt in stock: ");
        System.out.println(currentAmtSugar);


        stockAmt = 12;
        inventory.setSugar(stockAmt);
        currentAmtSugar = inventory.getSugar();
        assertEquals(12,currentAmtSugar);
        System.out.print("Curent Amount of Sugar with setting 12 elememt in stock: ");
        System.out.println(currentAmtSugar);
        
        stockAmt = -1;
        inventory.setSugar(stockAmt);
        currentAmtSugar = inventory.getSugar();
        assertEquals(12,currentAmtSugar);
        System.out.print("Curent Amount of Sugar with setting negative elememt in stock: ");
        System.out.println(currentAmtSugar);

        System.out.println("........setSugarTest Completed........");
    }


    @Test
    public synchronized void addSugarTest() throws InventoryException{

        System.out.println(".........addSugarTest()........");
    
        try{
            inventory.addSugar("two");
            currentAmtSugar = inventory.getSugar();
        }
        catch(InventoryException e){

            assertNotSame("Units of sugar must be a positive integer",e);

        }


        try{
            inventory.addSugar("-1");
            currentAmtSugar = inventory.getSugar();
        }
        catch(InventoryException e){
            
            assertTrue("Units of sugar must be a positive integer",currentAmtSugar>0);
        }


       
        inventory.addSugar("2");
        currentAmtSugar = inventory.getSugar();
        assertEquals(17,currentAmtSugar);
        System.out.print("After adding Sugar: ");
        System.out.println(currentAmtSugar);

        System.out.println(".........addSugarTest() Completed........");

    }

 
    @Test
    public synchronized void enoughIngredientsTest(){

        System.out.println(".......enoughIngredientsTest.........");

        Recipe r1 = new Recipe();
        Inventory inventory1 = new Inventory();
        String repName1 = "";
        int amtCoffee1 = 0;
        int amtChocolate1 = 0;
        int amtMilk1 = 0;
        int amtSugar1 = 0;
        int price1 = 0;
        

        try{
            
            r1.setName("Iced Latte");
            r1.setAmtCoffee("30");
            r1.setAmtChocolate("25");
            r1.setAmtMilk("20");
            r1.setAmtSugar("20");
            r1.setPrice("100");

            amtCoffee1 = r1.getAmtCoffee();
            amtChocolate1 = r1.getAmtChocolate();                 
            amtMilk1 = r1.getAmtMilk();
            amtSugar1 = r1.getAmtSugar();
            price1 = r1.getPrice();
            
            
            boolean checkValue = inventory1.enoughIngredients(r1);

            assertFalse(checkValue); 
        }
        catch(RecipeException e){
        	 assertTrue("Units of coffee must be a positive integer",amtCoffee1<=0);
        	 assertTrue("Units of chocolate must be a positive integer",amtChocolate1<=0);
             assertTrue("Units of milk must be a positive integer",amtMilk1<=0);           
            assertTrue("Units of sugar must be a positive integer",amtSugar1<=0);     
            assertTrue("Price must be a positive integer",price1<=0);
        }


        int prevPrice1 = price1;

        try{
            
            r1.setName("Iced latte");
            repName1 = r1.getName();

            r1.setPrice("105.10");
            price1 = r1.getPrice();

        }
        catch(RecipeException e){
            assertEquals("Iced latte",repName1);
            assertEquals(prevPrice1,price1);
        }

        try{
            
            r1.setName("Iced latte machiato");
            repName1 = r1.getName();

            r1.setPrice("3/4");
            price1 = r1.getPrice();

            assertEquals(0,price1);
            assertEquals("Iced latte machiato",repName1);

        }
        catch(RecipeException e){
            assertEquals("Iced latte machiato",repName1);
            assertEquals(prevPrice1,price1);
        }

        try{
            
            r1.setName("Pumpkin Latte");
            r1.setPrice("50");
            r1.setAmtSugar("5");
            r1.setAmtCoffee("10");
            r1.setAmtMilk("2");
            r1.setAmtChocolate("10");

            repName1 = r1.getName();
            price1 = r1.getPrice();
            amtSugar1 = r1.getAmtSugar();
            amtMilk1 = r1.getAmtMilk();
            amtChocolate1 = r1.getAmtChocolate();
            amtCoffee1 = r1.getAmtCoffee();

            boolean check2 = inventory1.enoughIngredients(r1);
            assertTrue(check2);  

        }
        catch(RecipeException e){
            assertEquals("Pumpkin Latte",repName1);
       	 assertTrue("Units of coffee must be a positive integer",amtCoffee1<=0);
    	 assertTrue("Units of chocolate must be a positive integer",amtChocolate1<=0);
         assertTrue("Units of milk must be a positive integer",amtMilk1<=0);           
        assertTrue("Units of sugar must be a positive integer",amtSugar1<=0);     
        assertTrue("Price must be a positive integer",price1<=0);
        }

        System.out.println(".......enoughIngredientsTest Completed.........");

    }

    
    @Test
    public synchronized void useIngredientsTest(){

        System.out.println(".......useIngredientsTest......");
        
        Recipe r = new Recipe();
    		try {
    			int amtCoffee = inventory.getCoffee();
    			int amtChocolate = inventory.getChocolate();
    			int amtMilk = inventory.getMilk();
    			int amtSugar = inventory.getSugar();
    			

    			r.setAmtCoffee("12");
    			r.setAmtChocolate("14");
    			r.setAmtMilk("3");
    			r.setAmtSugar("1");
    			
    			assertTrue(inventory.useIngredients(r));

    			assertEquals(amtCoffee - 12, inventory.getCoffee());
    			assertEquals(amtChocolate - 14, inventory.getChocolate());
    			assertEquals(amtMilk - 3, inventory.getMilk());
    			assertEquals(amtSugar - 1, inventory.getSugar());
    			
    		} catch (Exception e) {
    			fail("Exception should not be thrown");
    		}
    	}

    	@Test
    	public void TestuseIngredientsBad() {
    		Recipe r1 = new Recipe();
    		inventory = new Inventory();
    		try {
    			r1.setAmtCoffee("50000");
    			r1.setAmtChocolate("50000");
    			r1.setAmtMilk("50000");
    			r1.setAmtSugar("50000");
    			
    			assertFalse(inventory.useIngredients(r1));
    		} catch (Exception e) {
    			fail("Exception should not be thrown");
    		}
    		System.out.println(".......useIngredientsTest Completed.........");
    	}

   
    @Test
    public void toStringTest(){
        System.out.println(".......toStringTest......");
        Inventory inventory0 = new Inventory();
        String sK = inventory0.toString();
        assertNotNull(sK);
        System.out.println(".......toStringTest Completed......");
    }
}