package sdong.NumberClassifier

import sdong.NumberClassifier
import org.scalatest._
import _root_.junit.framework.Test
/**
  * Created by shendong on 2017/3/29.
  */
class ClassifierScalaTest {

  @Test def negative_perfection() {
    for (i <- 1 until 10000)
      if (Set(6, 28, 496, 8128).contains(i))
        assertTrue(NumberClassifier.isPerfect(i))
      else
        assertFalse(NumberClassifier.isPerfect(i))
  }
  @Test def alternate_perfection() {
    assertEquals(List(6, 28, 496, 8128),
      (1 until 10000) filter (NumberClassifier.isPerfect(_)))
  }

}
