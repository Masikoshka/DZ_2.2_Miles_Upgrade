public class BonusMilesService {
    public int calculate(int price) {
        int rublesForMile = 20;
        int bonus = price / rublesForMile;
        return bonus;
    }
}
