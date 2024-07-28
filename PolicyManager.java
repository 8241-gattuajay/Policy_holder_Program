import java.util.ArrayList;
import java.util.Scanner;

public class PolicyManager {
    private static ArrayList<Policyholderdetails> policyHolderList = new ArrayList<Policyholderdetails>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nInsurance Policy Manager");
            System.out.println("1. Add New Policy");
            System.out.println("2. Remove Policy by Number");
            System.out.println("3. Update Policy Details");
            System.out.println("4. List All Policies of a Specific Type");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addNewPolicy();
                    break;
                case 2:
                    removePolicyByNumber();
                    break;
                case 3:
                    updatePolicyDetails();
                    break;
                case 4:
                    listPoliciesByType();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewPolicy() {
        System.out.print("Enter Policy Number: ");
        int policyNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Policyholder Name: ");
        String policyholderName = sc.nextLine();
        System.out.print("Enter Type of Insurance (e.g., health, life, auto): ");
        String typeOfInsurance = sc.nextLine();
        System.out.print("Enter Coverage Amount: ");
        double coverageAmount = sc.nextDouble();

        Policyholderdetails policy = new Policyholderdetails(policyNumber, policyholderName, typeOfInsurance, coverageAmount);
        policyHolderList.add(policy);
        System.out.println("Policy added successfully.");
    }

    private static void removePolicyByNumber() {
        System.out.print("Enter Policy Number to remove: ");
        int policyNumber = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < policyHolderList.size(); i++) {
            if (policyHolderList.get(i).getPolicyNumber() == policyNumber) {
                policyHolderList.remove(i);
                System.out.println("Policy removed successfully.");
                return;
            }
        }

        System.out.println("Policy with number " + policyNumber + " not found.");
    }

    private static void updatePolicyDetails(){
        System.out.print("Enter Policy Number to update: ");
        int policyNumber = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < policyHolderList.size(); i++) {
            if (policyHolderList.get(i).getPolicyNumber() == policyNumber) {
                System.out.print("Enter new Policy Number: ");
                int newPolicyNumber = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new Policyholder Name: ");
                String newPolicyholderName = sc.nextLine();
                System.out.print("Enter new Type of Insurance (e.g., health, life, auto): ");
                String newTypeOfInsurance = sc.nextLine();
                System.out.print("Enter new Coverage Amount: ");
                double newCoverageAmount = sc.nextDouble();

                policyHolderList.get(i).setPolicyNumber(newPolicyNumber);
                policyHolderList.get(i).setPolicyHolderName(newPolicyholderName);
                policyHolderList.get(i).setTypeofInsurance(newTypeOfInsurance);
                policyHolderList.get(i).setCoverageAmount(newCoverageAmount);
                System.out.println("Policy updated successfully.");
                return;
            }
        }

        System.out.println("Policy with number " + policyNumber + " not found.");
    }

    private static void listPoliciesByType(){
        System.out.print("Enter Type of Insurance to list (e.g., health, life, auto): ");
        String typeOfInsurance = sc.nextLine();

        for (int i = 0; i < policyHolderList.size(); i++) {
            if (policyHolderList.get(i).getTypeofInsurance().equalsIgnoreCase(typeOfInsurance)) {
                System.out.println(policyHolderList.get(i));
            }
        }
    }

}