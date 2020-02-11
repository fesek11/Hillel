package Tasks;

import java.util.Random;

public class Wfifth {

    int zp = 1000;
    Random random1 = new Random();

    public void ZpRandom() {

        int zpRand = (random1.nextInt(zp) + 1);
        System.out.println(zpRand);

    }

    public void ZpRandomMath() {
        int zpMath = (int) (Math.random() * zp);
        System.out.println(zpMath);


    }

}
