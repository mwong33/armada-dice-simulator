/**
 * This class represents possible side of a die in Fantasy Flight Games' Star Wars Armada.
 */
public class Side {

    /**
     * Represenation Invariant:
     * sideCritCount, sideHitCount, and sideAccuracyCount must always be >= 0.
     */

    private int sideHitCount;
    private int sideCritCount;
    private int sideAccuracyCount;

    /**
    * Constructs a side of a Star Wars Armada Die.
    * @param hitCount - The number of hit icons on the side.
    * @param critCount - The number of critical icons on the side.
    * @param accuracyCount - The number of accuracy icons on the side.
    * PRE: critCOunt, hitCount and accuracyCount MUST be >= 0. 
    */
    public Side(int hitCount, int critCount, int accuracyCount) {
        this.sideHitCount = hitCount;
        this.sideCritCount = critCount;
        this.sideAccuracyCount = accuracyCount;
    }

    /**
    * Returns the number of hit icons on the side.
    * @return The number of hit icons on the side.
    */
    public int getSideHitCount() {
        return sideHitCount;
    }

    /**
    * Returns the number of critical icons on the side.
    * @return The number of critical icons on the side.
    */
    public int getSideCritCount() {
        return sideCritCount;
    }

    /**
    * Returns the number of accuracy icons on the side.
    * @return The number of accuracy icons on the side.
    */
    public int getSideAccuracyCount() {
        return sideAccuracyCount;
    }

}