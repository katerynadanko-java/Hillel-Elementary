package lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskForTestTest {
    TaskForTest taskForTest = new TaskForTest();
    int [] nums = new int[] {1,2,3};

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void twoSum() {
        taskForTest.twoSum(nums,5);
        int [] nums1 = new int[] {1,2};
        assertEquals(nums1, taskForTest.twoSum(nums,5));
    }
}