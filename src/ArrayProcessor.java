import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class ArrayProcessor {
    private ArrayList<Integer> intArray = new ArrayList<Integer>();

    public void readArray() {
        Integer i = 1, x;
        String num = "00";

        while (true) {
            if (i == 1) {
                num = JOptionPane.showInputDialog("please enter the" + i + "st element");i++;
            } else if (i == 2) {
                num = JOptionPane.showInputDialog("please enter the" + i + "nd element");i++;
            } else {
                num = JOptionPane.showInputDialog("please enter the" + i + "th element");i++;
            }
                 if (num.equals("")) {
                break;
                }

             x = Integer.parseInt(num);
              intArray.add(x);

        }
    }

public void processArray (){
    Integer arr[]=new Integer[intArray.size()];
    arr=intArray.toArray(arr);
    Integer toRev[]=ArrayUtil.reverse(arr);
    Integer toCopy[]=ArrayUtil.copyArray(arr);
    Double[] doubleArray = Arrays.stream(arr).map(Double::valueOf).toArray(Double[]::new);

    Integer rand;
    rand=(int)((Math.random()*100)+1);

            //arr= ArrayUtil.reverse(arr);
    System.out.print("\nthe sum : "+ ArrayUtil.sum(arr));
    System.out.print("\nthe average : "+ArrayUtil.average( doubleArray));
    System.out.print("\nthe max : "+ArrayUtil.max(arr));

    System.out.print("\nrandom number between 1 and 100 : "+rand);


    System.out.print("\nprint copy arraylist : ");
    System.out.print(Arrays.toString(ArrayUtil.copyArray(toCopy)));

    System.out.print("\nUsing the printArray method of ArrayUtil ->print the original intArray : ");
    ArrayUtil.printArray(intArray);
    System.out.print("\nUsing the printArray method of ArrayUtil ->print the copy of intArray : ");
    ArrayUtil.printArray(toCopy);



}






}

