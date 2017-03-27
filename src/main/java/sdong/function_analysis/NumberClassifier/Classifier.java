package sdong.function_analysis.NumberClassifier;

import java.util.HashSet;
import java.util.Set;

public class Classifier {

	private Set<Integer> _factors;
	private int _number;

	public Classifier(int number) throws ProjectException {
	        if (number < 1)
	            throw new ProjectException("Can't classify negative numbers");
	        _number = number;
	        _factors = new HashSet<Integer>();
	        _factors.add(1);
	        _factors.add(_number);
	    }

	private boolean isFactor(int factor) {
		return _number % factor == 0;
	}

	public Set<Integer> getFactors() {
		return _factors;
	}

	public void calculateFactors() {
		for (int i = 1; i <= Math.sqrt(_number) + 1; i++)
			if (isFactor(i))

				addFactor(i);
	}

	private void addFactor(int factor) {
		_factors.add(factor);
		_factors.add(_number / factor);
	}

	private int sumOfFactors() {
		calculateFactors();
		int sum = 0;
		for (int i : _factors)
			sum += i;
		return sum;
	}

	public boolean isPerfect() {
		return sumOfFactors() - _number == _number;
	}

	public boolean isAbundant() {
		return sumOfFactors() - _number > _number;
	}

	public boolean isDeficient() {
		return sumOfFactors() - _number < _number;
	}

	public static boolean isPerfect(int number) throws ProjectException {
		return new Classifier(number).isPerfect();
	}
}