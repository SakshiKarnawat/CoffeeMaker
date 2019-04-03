package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class RecipeBookTest
{
	
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	private Recipe r1_2; 
	RecipeBook recipeBook;

	@Before
	public void setUp() throws Exception
	{
		recipeBook = new RecipeBook();
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		//Set up for r5
		r5 = new Recipe();
		r5.setName("Chocolate Frappe");
		r5.setAmtChocolate("8");
		r5.setAmtCoffee("0");
		r5.setAmtMilk("1");
		r5.setAmtSugar("1");
		r5.setPrice("65");
		
		//Set up r1_2  
		r1_2 = new Recipe();
		r1_2.setName("Coffee");
		r1_2.setAmtChocolate("0");
		r1_2.setAmtCoffee("3");
		r1_2.setAmtMilk("1");
		r1_2.setAmtSugar("1");
		r1_2.setPrice("50");
				
	}

	@After
	public void emptyRecipeBook() throws Exception
	{
		recipeBook = null;
	}


	@Test 
	public void testGetRecipeSucceed()
	
	{
		System.out.println(".......testGetRecipeSucceed.......");
		assertTrue(recipeBook.getRecipes() instanceof Recipe []);
		System.out.println(".......testGetRecipeSucceed Completed.......");
	}

	@Test
	public void testAddRecipeSucceeds()
	{
		
		System.out.println(".......testAddRecipeSucceeds.......");
		assertTrue(recipeBook.addRecipe(r2));
		assertEquals("Mocha", recipeBook.getRecipes()[0].getName());
		assertEquals(20,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(3,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtSugar());
		assertEquals(75,recipeBook.getRecipes()[0].getPrice());
		System.out.println(recipeBook.addRecipe(r2));
		System.out.println(".......testAddRecipeSucceeds Comppleted.......");
	}

	@Test
	public void addMoreThan4Recipes() {
		assertTrue(recipeBook.addRecipe(r1));
		assertTrue(recipeBook.addRecipe(r2));
		assertTrue(recipeBook.addRecipe(r3));
		assertTrue(recipeBook.addRecipe(r4));
		assertFalse(recipeBook.addRecipe(r5));
	}
	
	@Test
	public void testAddRecipeFailsSameInstance() {
		assertTrue(recipeBook.addRecipe(r1));
		assertFalse(recipeBook.addRecipe(r1));
	}
	
	@Test
	public void testAddRecipeFail() throws RecipeException
	{
		Recipe recipe = null;
		recipeBook.addRecipe(new Recipe());
		Recipe newOne = new Recipe();
		newOne.setName("Frappe");
		newOne.setAmtChocolate("4");
		newOne.setAmtCoffee("0");
		newOne.setAmtMilk("1");
		newOne.setAmtSugar("1");
		newOne.setPrice("65");
		assertNull(recipeBook.editRecipe(recipeBook.getRecipes().length - 1, newOne));
		
		
		recipe = new Recipe();
		assertFalse(recipeBook.addRecipe(recipe));
		
		
	}
	
	
	@Test
	public void testAddRecipeFailsDifferentInstance()
	{
		assertTrue(recipeBook.addRecipe(r1));
		assertFalse(recipeBook.addRecipe(r1_2));
	}
	

	@Test
	public void testAddRecipeFailsAfterDelete()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		recipeBook.addRecipe(r3);
		recipeBook.deleteRecipe(0);
		recipeBook.addRecipe(r4);
		assertTrue(r4.equals(recipeBook.getRecipes()[0]));
	}
	
	@Test
	public void testAddRecipeFailsNameChange ()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		String A = r3.getName();
		recipeBook.editRecipe(0, r3);
		String B = recipeBook.getRecipes()[0].getName();
		assertEquals(A, B);
	}
	


	@Test
	public void testDeleteRecipeSetToNull()
	{
		recipeBook.addRecipe(r1);
		recipeBook.deleteRecipe(0);
		//assertTrue(recipeBook.getRecipes()[0].getName().equals(null));
		assertEquals(recipeBook.deleteRecipe(0), null);
	}

	
	@Test
	public void testDeleteRecipeSuccess()
	{
		recipeBook.addRecipe(r1);
		String deleted = recipeBook.deleteRecipe(0);
		assertEquals("Coffee",deleted);
	}

	
	public void testEditRecipeSuccess()
	{
	    
	        assertEquals("Mocha",recipeBook.editRecipe(1, r2));
	 }
	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testEditIndexOutOfBound() {
		int outOfBounce = Integer.MAX_VALUE;
		Recipe r = new Recipe();
		r =recipeBook.getRecipes()[outOfBounce];
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDeleteIndexOutOfBound() {
		int outOfBounce = Integer.MAX_VALUE;
		Recipe r = new Recipe();
		r = recipeBook.getRecipes()[outOfBounce];
	}
	

	@Test
	public void testDeleteRecipeNotPresent()
	{
		recipeBook.addRecipe(r1);
		assertEquals(null, recipeBook.deleteRecipe(1));
	}
	

	
	@Test 
	public void testEditRecipeNotPresent()
	{
		recipeBook.addRecipe(r1);
		assertEquals(null,recipeBook.editRecipe(1, r2) );
	}
	

}
