import java.util.Arrays;

class CustomArrayList {
    private static int DEFAULT_SIZE = 3; // Initial Size of the Array
    private int pointer;
    private Object[] data;

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
        // THIS CREATES THE ARRAY OF SIZE:: DEFAULT SIZE
    }

    //  LET'S CREATE THE METHOD TO ADD THE OBJECT
    public void add(Object ele){
        // Check if the Current capacity is exhausted or not like in Arrays
        if(isFull()){
            resize();
        }
            data[pointer++] = ele;
    }

    public Object getElement(int index){
        return data[index];
    }

    public void setElement(int index, Object ele){
        data[index] = ele;
    }

    public void removeElementAtIndex(int index){
        for (int i = index; i < pointer; i++) {
            data[i] = data[i + 1];
        }
        pointer--;
    }

    public void removeFirst(){
        for (int i = 0; i < pointer; i++) {
            data[i] = data[i+ 1];
        }
        pointer--;
    }

    private void resize(){
        // Then we need to increase the size to double
        // But directly we cannot update/ increase the size of Data as
//        this.data = new Object[DEFAULT_SIZE * 2]; // This will create new Array and all old elements will be reset to null

        //Step to create/Resize
        //Step1: Create new temp array of increased size
        var temp = new Object[DEFAULT_SIZE * 2];

        //Step 2: Copy all elements of Data in temp array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        //Step3: Copy the Temp array into Data Array
        data = temp;

        //Step4: Update the Default Size
        DEFAULT_SIZE = DEFAULT_SIZE * 2;
    }

    private boolean isFull(){
        return pointer == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "pointer=" + pointer +
                ", data=" + Arrays.toString(data) +
                '}';
    }


}
public class WithoutGenerics {

    public static void main(String[] args) {
        CustomArrayList obj = new CustomArrayList();
        // We can add any Data type , no type checking which can be achieved using Generics
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add("Seven");
        System.out.println(obj);
        System.out.println("The value at index 4 using getElement Method:: " + obj.getElement(4));
        obj.setElement(0,199);
        System.out.println(obj);
        obj.removeFirst();
        System.out.println(obj);
        obj.removeElementAtIndex(4);
        System.out.println("After removing 4th index i.e 6 element ie " + obj);
        obj.add(99999);
        System.out.println(obj);
    }
}
