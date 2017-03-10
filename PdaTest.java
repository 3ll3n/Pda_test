import junit.util.*;
// import java.assertEquals.Assert;

class PdaTest{

  Pda pda;

  @Before
  public void before(){
    pda = new Pda();
  }
  
}

@Test
public void testFunc1ValEqualToOne(){
  assertEquals(true, pda.func1(1));
}

@Test
public void testFunc1ValNotEqualToOne(){
  assertEquals(false, pda.func1(2));
}

@Test
public void testMaxGreater(){
  assertEquals(5, pda.max(5, 2));
}

@Test
public void testMaxLess(){
  assertEquals(2, pda.max(2, 4));
}

// @Test
// public void testLooper(){
//   assertEquals();
// }

@Test
public void testCheckLooperPassed(){
  assertEquals("looper passed", pda.checkLoop(10));
}

@Test
public void testCheckLooperFailed(){
  assertEquals("looper failed", pda.checkLoop(2));
}