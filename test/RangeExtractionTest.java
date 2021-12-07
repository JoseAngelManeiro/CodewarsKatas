import org.junit.Test;

import static org.junit.Assert.*;

public class RangeExtractionTest {

    @Test
    public void test_BasicTests() {
        assertEquals(
                "-6,-3-1,3-5,7-11,14,15,17-20",
                RangeExtraction.solution(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20})
        );

        assertEquals(
                "-3--1,2,10,15,16,18-20",
                RangeExtraction.solution(new int[] {-3,-2,-1,2,10,15,16,18,19,20})
        );
    }

    @Test
    public void test_last_item() {
        assertEquals(
                "20,22-27,30,32,35,37",
                RangeExtraction.solution(new int[] {20,22,23,24,25,26,27,30,32,35,37})
        );
    }

    @Test
    public void non_increasing_sequences() {
        assertEquals(
                "97-102,-7,-6,14-18,-46--44,-95,-74,65-68,37-42,58,-31--27,-43--37,52-54,67-72,-48--44",
                RangeExtraction.solution(new int[] {
                        97, 98, 99, 100, 101, 102, -7, -6, 14, 15, 16, 17,
                        18, -46, -45, -44, -95, -74, 65, 66, 67, 68, 37, 38, 39, 40, 41, 42, 58, -31,
                        -30, -29, -28, -27, -43, -42, -41, -40, -39, -38, -37, 52, 53, 54, 67, 68,
                        69, 70, 71, 72, -48, -47, -46, -45, -44
                })
        );
    }


}