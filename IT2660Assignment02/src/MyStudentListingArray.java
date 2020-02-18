// StudentArray Class of IT2660 Assignment 2

public class MyStudentListingArray {
    private int next;
    private int size;
    private StudentListing[] data;

    // Create an ArrayNode of size 100
    public MyStudentListingArray(){
        next = 0;
        size = 100;
        data = new StudentListing[size];
    } // end of constructor

    // Create a ArrayNode of size s
    public MyStudentListingArray(int s){
        next = 0;
        data = new StudentListing[s];
        size = s;
    } // end of constructor

    public boolean insert (StudentListing newStudentListing){
        if (next >= size) // array is full
            return false;
        data[next] = newStudentListing.deepCopy(); // Stores a deep copy of
                                         // the student's node
        if (data[next] == null)
            return false;
        next = next + 1; // prepare for next insert
        return true;
    }

    public StudentListing fetch(String targetKey){
        StudentListing studentListing;
        StudentListing temp;
        // access the node using a sequential search
        int i = 0;
        while (i < next && !(data[i].compareTo(targetKey) == 0)){
            i++;
        }
        if (i == next) // StudentListing not found
            return null;
        // deep copy the StudentListing's information into the student's node
        studentListing = data[i].deepCopy();
        // move the node up one position in the array, unless it is the first node.
        if (i !=0){
            temp = data[i - 1];
            data[i - 1] = data[i];
            data[i] = temp;
        }
        return studentListing;
    } // end of fetch method

    public boolean delete(String targetKey){
        // access the studentlisting using a sequential search
        int i = 0;
        while(i < next && !(data[i].compareTo(targetKey) == 0)){
            i++;
        }
        if (i == next) // node not found
            return false;
        // move the last node into the deleted node's position
        data[i] = data[next - 1];
        data[next - 1] = null;
        next = next - 1;
        return true; // node found and deleted
    }
    public boolean update(String targetKey, StudentListing newStudentListing){
        if (delete(targetKey) == false) // node not in the structure
            return false;
        else if (insert(newStudentListing) == false) // insufficient memory
            return false;
        else
            return true; // node found and updated
    }   // end of update method

    public void showAll(){
        for (int i = 0; i < next; i++)
            System.out.println(data[i].toString());
    }   // end of showAll method
}   // end of class MyStudentListingArray
