/**
 * CallbackBuddy Class
 * A class that sets up a Model-View-Controller
 */
public class CallbackBuddy
   implements Runnable
{
   /**
    * Run creates a model, view, and controller, then connects them together
    */
   void run()
   {
      Model model = new Model();
      View view = new View();
      Controller controller = new Controller();
      
      model.set(view, controller);
      view.set(model, controller);
      controller.set(model, view);
   }

   /**
    * Main creates a new MVC and calls run
    */
   public static void main(String[] args)
   {
      new CallbackBuddy.run();
   }
}