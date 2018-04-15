public class Gerbil {

    private static final int GERBIL_CAN_CARRY = 10;
    /**
     * Prints the best haul of minerals by my gerbil
     *
     * @param  rhodiumInCrevice    oz of rhodium in the mine
     * @param  platinumInCrevice   oz of platinum in the mine
     * @param  goldInCrevice       oz of gold in the mine
     * @param  rutheniumInCrevice  oz of ruthenium in the mine
     */
    public static void found(int rhodiumInCrevice, int platinumInCrevice, int goldInCrevice, int rutheniumInCrevice) {
        int platinumCollected = 0, goldCollected = 0, rutheniumCollected = 0;
        int rhodiumCollected = (rhodiumInCrevice >= GERBIL_CAN_CARRY) ? GERBIL_CAN_CARRY : rhodiumInCrevice;
        int totCollected = rhodiumCollected;
        if (totCollected < GERBIL_CAN_CARRY) {
            int stillCanCollect = GERBIL_CAN_CARRY - totCollected;
            platinumCollected = (platinumInCrevice>=stillCanCollect) ? stillCanCollect : platinumInCrevice;
            totCollected += platinumCollected;
            if (totCollected < GERBIL_CAN_CARRY) {
                stillCanCollect = GERBIL_CAN_CARRY - totCollected;
                goldCollected = (goldCollected>=stillCanCollect) ? stillCanCollect : goldInCrevice;
                totCollected += goldCollected;
                if (totCollected < GERBIL_CAN_CARRY) {
                    stillCanCollect = GERBIL_CAN_CARRY - totCollected;
                    rutheniumCollected = (rutheniumCollected>=stillCanCollect) ? stillCanCollect : rutheniumInCrevice;
                    totCollected += rutheniumCollected;
                }
            }
        }
        System.out.println(rhodiumCollected + " Rhodium");
        System.out.println(platinumCollected + " Platinum");
        System.out.println(goldCollected + " Gold");
        System.out.println(rutheniumCollected + " Ruthenium\n");
    }

    public static String found2(int rhodiumInCrevice, int platinumInCrevice, int goldInCrevice, int rutheniumInCrevice) {
        int platinumCollected = 0, goldCollected = 0, rutheniumCollected = 0;
        int stillCanCollect = GERBIL_CAN_CARRY;
        int rhodiumCollected = rhodiumInCrevice >= stillCanCollect ? stillCanCollect : rhodiumInCrevice;
        stillCanCollect -= rhodiumCollected;
        if (stillCanCollect > 0) {
            platinumCollected = platinumInCrevice>=stillCanCollect ? stillCanCollect : platinumInCrevice;
            stillCanCollect -= platinumCollected;
            if (stillCanCollect > 0) {
                goldCollected = goldInCrevice>=stillCanCollect ? stillCanCollect : goldInCrevice;
                stillCanCollect -= goldCollected;
                if (stillCanCollect > 0)
                    rutheniumCollected = rutheniumInCrevice>=stillCanCollect ? stillCanCollect : rutheniumInCrevice;
            }
        }
        return rhodiumCollected + " Rhodium\n" + platinumCollected + " Platinum\n" + goldCollected + " Gold\n" + rutheniumCollected + " Ruthenium\n\n";
    }

    public static String found3(int rhodium, int platinum, int gold, int ruthenium) {
        int stillCanCarry = GERBIL_CAN_CARRY;
        rhodium = rhodium >= stillCanCarry ? stillCanCarry : rhodium;
        stillCanCarry -= rhodium;
        platinum = stillCanCarry > 0 ? (platinum >= stillCanCarry ? stillCanCarry : platinum) : 0;
        stillCanCarry -= platinum;
        gold = stillCanCarry > 0 ? (gold >= stillCanCarry ? stillCanCarry : gold) : 0;
        stillCanCarry -= gold;
        ruthenium = stillCanCarry > 0 ? (ruthenium >= stillCanCarry ? stillCanCarry : ruthenium) : 0;
        return rhodium + " Rhodium\n" + platinum + " Platinum\n" + gold + " Gold\n" + ruthenium + " Ruthenium\n\n";
    }

    public static String found4(int rhodium, int platinum, int gold, int ruthenium) {
        int[] metals = {rhodium, platinum, gold, ruthenium};
        int stillCanCarry = GERBIL_CAN_CARRY;
        for (int i = 0; i < metals.length; i++) {
            metals[i] = metals[i] > stillCanCarry ? stillCanCarry : metals[i];
            stillCanCarry -= metals[i];
        }
        return metals[0] + " Rhodium\n" + metals[1] + " Platinum\n" + metals[2] + " Gold\n" + metals[3] + " Ruthenium\n\n";
    }


    public static void main(String[] args) {
        found(5, 6, 4, 7); // prints the following
        System.out.print(found2(5, 6, 4, 7)); // prints the following
        System.out.print(found3(5, 6, 4, 7)); // prints the following
        System.out.print(found4(5, 6, 4, 7)); // prints the following
//        5 Rhodium
//        5 Platinum
//        0 Gold
//        0 Ruthenium
        found(10, 10, 10, 10); // prints the following
        System.out.println(found2(10, 10, 10, 10)); // prints the following
        System.out.println(found3(10, 10, 10, 10)); // prints the following
        System.out.println(found4(10, 10, 10, 10)); // prints the following
//        10 Rhodium
//        0 Platinum
//        0 Gold
//        0 Ruthenium
        found(3, 0, 0, 1);
        System.out.println(found2(3, 0, 0, 1));
        System.out.println(found3(3, 0, 0, 1));
        System.out.println(found4(3, 0, 0, 1));
//        3 Rhodium
//        0 Platinum
//        0 Gold
//        1 Ruthenium
    }
}
