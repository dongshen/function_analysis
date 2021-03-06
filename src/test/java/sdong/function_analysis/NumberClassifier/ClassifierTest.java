package sdong.function_analysis.NumberClassifier;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import sdong.function_analysis.exception.ProjectException;

public class ClassifierTest {

	@Test
	public void testCalculateFactors_for_100() {
		Classifier c;
		try {
			c = new Classifier(100);
			c.calculateFactors();
			assertThat(c.getFactors(), is(expectationSetWith(1, 100, 2, 50, 4, 25, 5, 20, 10)));
		} catch (ProjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Set<Integer> expectationSetWith(Integer... numbers) {
		return new HashSet<Integer>(Arrays.asList(numbers));
	}
}
