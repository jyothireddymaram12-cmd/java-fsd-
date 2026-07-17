import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    // bad: Array with fixed size
    private Product[] items = new Products[10];
    // good: Arraylist with dynamic size
    private List<Product> items = new ArrayList<>();
    public void addProduct(Product product){
        items.add(product)
    } 
}
/*// 2.ADDING ELEMENTS
student.add("jyothi")
student.add("jyothi")
student.add("jyothi")

//3.ADDING AT SPECIFIC POSITION
student.add(1, "eve")

//4.ADD ALL FROM ANOTHER COLLECTION 
list<string> moreStudents = Arrays.asList("frank" , "grace")
students.addall(morestudents) : list1.addall(list2)

//5. ACCESSING ELEMENTS:
string first = string.get(0) : for accessing collection.get(index number);

//6. REMOVING ELEMENTS
students.remove(1); // remove eve by index collevction.get(index number)
students.remove("bob")(by the name)

//7.remove all elements at a time
students.removeIf(name -> name.startsWith("F"));
System.out.println("After removeIf " + students)

//8. for checking contents
boolean hasAlice = students.contains("Alice")//true
boolean hasbob = students.contains("bob")//false

//finding the index value for particular elements
int index = students.indexOf("Charlie");

//9.SIZE AND CAPACITY
int size = students.size();
boolean empty = students.isEmpty();
 
//10. ITERATION - multiple ways 
System.out.println()
for(String student : students)


 */

