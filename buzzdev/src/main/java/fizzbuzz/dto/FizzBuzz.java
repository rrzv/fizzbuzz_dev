package fizzbuzz.dto;

public class FizzBuzz {

	private int inferiorLimit;
	private int superiorLimit;
	private boolean generateReport;

	public boolean isGenerateReport() {
		return generateReport;
	}

	public void setGenerateReport(boolean generateReport) {
		this.generateReport = generateReport;
	}

	public int getInferiorLimit() {
		return inferiorLimit;
	}

	public void setInferiorLimit(int inferiorLimit) {
		this.inferiorLimit = inferiorLimit;
	}

	public int getSuperiorLimit() {
		return superiorLimit;
	}

	public void setSuperiorLimit(int superiorLimit) {
		this.superiorLimit = superiorLimit;
	}

	@Override
	public String toString() {
		return "FizzBuzz [inferiorLimit=" + inferiorLimit + ", superiorLimit=" + superiorLimit + ", generateReport="
				+ generateReport + ", toString()=" + super.toString() + "]";
	}

}
