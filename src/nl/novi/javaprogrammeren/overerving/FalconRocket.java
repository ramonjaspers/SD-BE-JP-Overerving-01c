package nl.novi.javaprogrammeren.overerving;

public class FalconRocket extends Rocket {
    public int extraFuel = 10;

    public FalconRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public boolean hasEnoughFuel(int fuel) {
        if (fuel <= (currentFuel + this.extraFuel)) {
            return true;
        }
        return false;
    }

    @Override
    public void decreaseFuel(int fuel) {
        if (extraFuel > 0) {
            this.extraFuel = this.extraFuel - fuel;
        } else {
            currentFuel = currentFuel - fuel;
        }
    }


}
