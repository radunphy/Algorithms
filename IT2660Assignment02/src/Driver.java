/** Driver Program for Assignment 2
 *  IT2660 ------ @author Ryan Dunphy
 */

public class Driver {
    public static void main(String args[]){
        // Create the John StudentListing Object
        StudentListing John = new StudentListing
                ("John", "2.83", "330");

        // Test toString method.
        System.out.println(John.toString());

        // Test deepCopy method
        System.out.println(John.deepCopy());

        // Test compareTo method
        System.out.println(John.compareTo("John"));

        // Initializing default constructor
        StudentListing noConstructor = new StudentListing();
        System.out.println(noConstructor);

        // Testing input function
        noConstructor.input();
        System.out.println(noConstructor);

        // Separator
        System.out.println("----------------");

        /*  Testing MyStudentListingArray Functionality
         ----------------------------------------------
        */
        // Creating StudentListing array MyStudentListingArray
        MyStudentListingArray firstArray = new MyStudentListingArray(10);

        // Creating StudentListing objects for array
        StudentListing David = new StudentListing(
                "David", "3.2", "3213"
        );
        StudentListing CJ = new StudentListing(
                "CJ", "3.4", "3314"
        );
        StudentListing Layne = new StudentListing(
                "Layne", "3.74", "3483"
        );

        // Testing insert method by inserting entries into the firstArray
        firstArray.insert(John);
        firstArray.insert(noConstructor);
        firstArray.insert(David);
        firstArray.insert(CJ);

        // print firstArray
        firstArray.showAll();
        System.out.println("----------------");

        // Fetch will moveStudentListing "David" above "noConstructor" entry
        System.out.print(firstArray.fetch("David"));
        System.out.println("----------------");

        // Testing delete method and verifying it worked.
        firstArray.delete("John");
        firstArray.showAll();
        System.out.println("----------------");

        // Testing update method
        firstArray.update("David", Layne);
        firstArray.showAll();
    }
}
