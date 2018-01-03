/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author squishy
 */
public class SudokuBoardTest {
    
    public SudokuBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testSolveEmptyBoard() throws FileNotFoundException {
        SudokuBoard instance = new SudokuBoard("emptyboard.txt");
        boolean expResult = true;
        boolean result = instance.solve();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testSolveBoard1() throws FileNotFoundException {
        SudokuBoard instance = new SudokuBoard("board1.txt");
        boolean expResult = true;
        boolean result = instance.solve();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testSolveBoard2() throws FileNotFoundException {
        SudokuBoard instance = new SudokuBoard("board2.txt");
        boolean expResult = true;
        boolean result = instance.solve();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testbadBoard() throws FileNotFoundException {
        SudokuBoard instance = new SudokuBoard("badboard.txt");
        boolean expResult = false;
        boolean result = instance.solve();
        assertEquals(expResult, result);

    }

}
