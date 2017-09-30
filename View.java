/**
 * Class View
 * A compnent of the Model-View-Control. View manages the GUI.
 */
public class View
{
   /**
    * The Model
    */
   private Model mModel;

   /**
    * The Controller
    */
   private Controller mController;

   /**
    * The GUI for the program
    */
   private GridPane mGUI;

   /**
    * Sets the Model and Controller that this view will communicate with.
    *
    * @param takes a Model and Controller to connect to.
    */
   public set(Model pModel, Controller pController)
   {
      mModel = pModel;
      mController = pController;
   }
}