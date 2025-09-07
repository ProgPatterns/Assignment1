//    b.	Implement a class called CustomArrayStack.
public class CustomArrayStack {

//    c.	Implement a single dimensional array as a private property of the CustomArrayStack class.
    private int [] dataArray;

    public CustomArrayStack(int arraySize) {
        this.dataArray = new int[arraySize];
    }

//    d.	Implement a method called push that takes a value and adds it at the beginning of the array.
    public void push(int value){
        for(int i = dataArray.length - 1; i > 0; i--){
            dataArray[i] = dataArray[i-1];
        }
        dataArray[0] = value;
    }

//    e.	Implement a method called pop that removes and returns the first element of the array.
    public int pop(){
//        for(int i = 0; i < dataArray.length; i++){
//            System.out.print(dataArray[i] + " ");
//        }
        System.out.print("The first element of the array is " + dataArray[0]);
        return dataArray[0];
    }
}