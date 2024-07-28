public class Policyholderdetails {
    private int policyNumber;
    private String policyHolderName;
    private String typeofInsurance;
    private double coverageAmount;

    public Policyholderdetails(int policyNumber, String policyHolderName, String typeofInsurance, double coverageAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.typeofInsurance = typeofInsurance;
        this.coverageAmount = coverageAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public String getTypeofInsurance() {
        return typeofInsurance;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setTypeofInsurance(String typeofInsurance) {
        this.typeofInsurance = typeofInsurance;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public String toString() {
        return "Policy Number: " + policyNumber + "\nPolicy Holder Name: " + policyHolderName + "\nType of Insurance: " + typeofInsurance + "\nCoverage Amount: " + coverageAmount;
    }
}
