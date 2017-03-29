package sdong.NumberClassifier

import org.junit.Assert._
import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit
/**
  * Created by shendong on 2017/3/29.
  */
class ClassifierScalaTest extends AssertionsForJUnit {

  @Test def negative_perfection() {
    for (i <- 1 until 10000)
      if (Set(6, 28, 496, 8128).contains(i))
        assertTrue(ClassifierScala.isPerfect(i))
      else
        assertFalse(ClassifierScala.isPerfect(i))
  }
 @Test def alternate_perfection() {
    assertEquals(List(6, 28, 496, 8128),
      (1 until 10000) filter (ClassifierScala.isPerfect(_)))
  }

}
