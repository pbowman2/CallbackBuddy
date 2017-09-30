/**
 * This controller class with interpret the view and make
 * changes to the model
 */
public class Controller
{
   /**
    * Connection to the model
    */
   private Model mModel;

   /**
    * Connection to the view
    */
   private View mView;

   /**
    * Stores the save location
    */
   private String mFilename;

   /**
    * A constructor that initializes the model and view
    *
    * @param pModel The model to connect to
    * @param pView The view to connect to
    */
   public Controller(Model pModel, View pView)
   {
      setModel(pModel);
      setView(pView);
   }

   /**
    * A constructor that initializes the model, view, and filename
    *
    * @param pModel The model to connect to
    * @param pView The view to connect to
    * @param pFilename The save location for the program
    */
   public Controller(Model pModel, View pView, String pFilename)
   {
      setModel(pModel);
      setView(pView);
      setSaveLocation(pFilename);
   }
   
   /**
    * Establishes a connection to the model
    *
    * @param pModel The model to connect to
    */
   public void setModel(Model pModel)
   {
      mModel = pModel;
   }

   /**
    * Establishes a connection to the view
    * @param pView The view to connect to
    */
   public void setView(View pView)
   {
      mView = pView;
   }

   /**
    * Specifies where to save the data
    *
    * @param pFilename Sets the save location
    */
   public void setSaveLocation(String pFilename)
   {
      mFilename = pFilename;
   }

   /**
    * Dynamically updates the callbacks box
    */
   public void countTallies()
   {
      // Read through the tallies of the couples,
      // sorts them and updates window below
   }

   public void calculateCallbacks()
   {
      // Identifies the couples with the most
      // tallies
      // Create dialog for results file
      displayResults();
   }

   /**
    * Overwrites the current results file
    */
   public void save()
   {
      // Overwrite the file with the new info added at the top
   }

   /**
    * Updates the results window
    */
   public void displayResults()
   {
      // Confirm changes
      if confirmed
         save();
      // Send message to results window to reload the file
   }

   /**
    * Resets the form for new entries
    */
   public void Reset()
   {
      // Tell the view to clear the data (except for the row and col numbers)
      // Reset the model data too
   }
}