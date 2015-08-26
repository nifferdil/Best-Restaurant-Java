import org.junit.*;
import static org.junit.Assert.*;

public class RestaurantTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void all_emptyAtFirst() {
    assertEquals(Restaurant.all().size(), 0);
  }
  //
  // @Test
  // public void equals_returnsTrueIfRestNamesAretheSame() {
  //   Restaurant firstRestaurant = new Restaurant("Deli Town");
  //   Restaurant secondRestaurant = new Restaurant("Deli Town");
  //   assertTrue(firstRestaurant.equals(secondRestaurant));
  // }
  //
  // @Test
  // public void save_returnsTrueIfRestNamesAretheSame() {
  //   Restaurant newRestaurant = new Restaurant("Deli Town");
  //   newRestaurant.save();
  //   assertTrue(Restaurant.all().get(0).equals(newRestaurant));
  // }
  //
  // @Test
  // public void save_assignsIdToObject() {
  //   Restaurant newRestaurant = new Restaurant("Deli Town");
  //   newRestaurant.save();
  //   Restaurant savedRestaurant = Restaurant.all().get(0);
  //   assertEquals(myRestaurant.getId(), savedRestaurant.getId());
  // }


  // @Test
  // public void all_savesIntoDatabase_true() {
  //   Restaurant newRestaurant = new Restaurant("Deli Town", 1);
  //   assertEquals(Restaurant.all().get(0).getRestName(), "Deli Town");
  // }

//   @Test
//   public void find_findsRestaurantInDatabase_true() {
//     Restaurant newRestaurant = new Restaurant("Deli Town", 1);
//     newRestaurant.save();
//     Restaurant savedRestaurant = Restaurant.find(myRestaurant.getId());
//     assertEquals(savedRestaurant.getRestName(), "Deli Town");
//   }
//
//   @Test
//   public void save_savesCuisineIdIntoDB_true() {
//     Cuisine myCuisine = new Cuisine("pizza");
//     myCuisine.save();
//     Restaurant newRestaurant = new Restaurant("Deli Town", myCuisine.getId());
//     newRestaurant.save();
//     Restaurant savedRestaurant = Restaurant.find(newRestaurant.getId());
//     assertEquals(savedRestaurant.getCuisineId(), myCuisine.getId());
//   }
// }
