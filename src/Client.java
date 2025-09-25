public class Client {
    public static void main(String[] args) {
        CustomArrayStack myArray = new CustomArrayStack(5);

        myArray.push(10);
        myArray.push(3);
        myArray.push(9);
        myArray.push(6);
        myArray.push(1);

        myArray.pop();
        myArray.pop();
    }
}
