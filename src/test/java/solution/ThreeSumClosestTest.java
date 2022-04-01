package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void threeSumClosest() {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

//        assertEquals(2, threeSumClosest.threeSumClosest(new int[]{-1,2,1,-4}, 1));
        assertEquals(2, threeSumClosest.threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));

    }
}
