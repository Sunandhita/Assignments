package finding_max_and_min_object;

// Question 2

import java.util.Objects;

public class ModifiedMinMax 
{
	private int min;
	private int max;
	public ModifiedMinMax() {
		super();
	}
	public ModifiedMinMax(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	@Override
	public int hashCode() {
		return Objects.hash(max,min);
	}
	@Override
	public String toString() {
		return "ModifiedMinMax [min=" + min + ", max=" + max + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModifiedMinMax other = (ModifiedMinMax) obj;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}
}
