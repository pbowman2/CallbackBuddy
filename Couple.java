/**
 * This class stores the id number and the tally of
 * votes from the judges for a dance couple
 */
public class Couple
{
   /**
    * Stores the tally of votes
    */
   private Integer mTally;

   /**
    * Stores the couple's id number
    */
   private Integer mId;

   /**
    * The default constructor intializes the tally
    * and id number to 0
    */
   public Couple()
   {
      mTally = 0;
      mId = 0;
   }

   /**
    * This contructor lets you specify an id number
    *
    * @param pId The id number of the new couple
    */
   public Couple(Integer pId)
   {
      mTally = 0;
      mId = pNumber;
   }

   /**
    * Returns the tally of votes from the judges
    *
    * @return The total number of votes
    */
   public Integer getTally()
   {
      return mTally;
   }

   /**
    * Sets the tally to the number provided
    *
    * @param pTally A new tally of votes
    */
   public void setTally(Integer pTally)
   {
      mTally = pTally;
   }

   /**
    * Increments the tally by one
    */
   public void tallyUp()
   {
      mTally++;
   }

   /**
    * Returns the id number for the couple
    *
    * @return The couple's id number
    */
   public Integer getId()
   {
      return mId;
   }

   /**
    * Sets the id number
    *
    * @param pId The new id number
    */
   public void setId(Integer pId)
   {
      mId = pNumber;
   }
}