/**
 * Class Model
 * A component of the Model-View-Control. Model stores the data for the program.
 */
public class Model
{
   /**
    * The View
    */
   private View mView;

   /**
    * The Controller
    */
   private Controller mController;

   /**
    * table for the judges callbacks 
    */
   mCells; //I am not sure this is all that necessary

   /**
    * A container of Couple objects sorted by tally
    */
   mCouples;
   
   /**
    * getData returns the data of an input cell
    *
    * @param takes two integers representing the row and column of the
    * desired input cell
    */
   public Integer getData(int pRow, int pCol)
   {
      // return mCells[pRow][pCol];
   }
   
   /**
    * getCouple returns a couple by index
    *
    * @param takes an int representing the index of the Couples
    */
   public Couple getCouple(int pIndex)
   {
      // return mCouples[pIndex];
   }

   /**
    * Sets the view and controller that this model will communicate with.
    *
    * @param take a View and Controller to connect to.
    */
   public set(View pView, Controller pController)
   {
      mView = pView;
      mController = pController;
   }
}