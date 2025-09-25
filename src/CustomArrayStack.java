public class CustomArrayStack {

//    c.Implement a single dimensional array as a private property of the CustomArrayStack class.
    private int [] dataArray;

    public CustomArrayStack(int arraySize) {
        this.dataArray = new int[arraySize];
    }

//    d.Implement a method called push that takes a value and adds it at the beginning of the array.
    public void push(int value){
        for(int i = dataArray.length - 1; i > 0; i--){
            dataArray[i] = dataArray[i-1];
        }
        dataArray[0] = value;
    }

//    e.Implement a method called pop that removes and returns the first element of the array.
    public int pop(){
        for(int i = 0; i < dataArray.length; i++){
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();//skipping a line

        int removeNum = dataArray[0];
        for(int i = 0; i < dataArray.length - 1; i++){
            dataArray[i] = dataArray[i+1];
            dataArray[i+1] = 0;//set element to default value
        }

        System.out.println("The first element of the array is " + removeNum);
        return removeNum;
    }
}