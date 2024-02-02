package OtherClasses;

public class Common<T> {
    T data1;
    T data2;
    public Common(T data1, T data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public void printData() {
        System.out.println(data1 + " , " + data2);
    }
}
