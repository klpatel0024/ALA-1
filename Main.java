public class Main
{
    public static void main(String[] args)
    {
        Employee beth = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", "484-222-4433",
         "bdown@gmail.com", "System Administrator", 75000.00);

        Student paul = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", 
        "610-331-7177", "pleister@gmail.com", "CSE");

        Faculty mark = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", "610-333-2211", 
        "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");

         //System.out.println(beth);
         Person[] array = new Person[3];
        array[0] = beth;
        array[1] = paul;
        array[2] = mark;

        printArray(array);
        // System.out.println("-------------------------------------");
        sortArray(array, false);
        printArray(array);
        // System.out.println("-------------------------------------");
        sortArray(array, true);
        printArray(array);
    }

    public static void printArray(Person[] arr)
    {
        for(int i = 0; i <= 2; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sortArray(Person[] arr, boolean bool)
    {
        if (bool == true)
        {
            for(int i=0; i<arr.length; i++){
                int minIndex = i;
                for(int j=i+1; j<arr.length; j++){ 
                    char a = arr[i].getName().charAt(0);
                            // System.out.println("a:" + a);
                            
                    char b = arr[j].getName().charAt(0);
                            // System.out.println("b:" + b);
                    if(b < a)
                            // System.out.println("swap");
                           minIndex=j;
                Person temp = new Employee();            
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
              }
            }
        }
        else {
            for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++)     
                if(arr[j].getID() < arr[minIndex].getID())
                        minIndex=j;
                        
            Person temp = new Employee();            
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            }
        }   
    }

}