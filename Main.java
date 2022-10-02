public class Main {
    public static void main(String[] args) {
      int[] number={3,1,2,4,5};
        insertionsort(number);
        for (int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }


    }
    public static void insertionsort(int array[]){
        for(int j = 1; j <array.length; j++){
            int key=array[j];
            int first= j -1;
            while (first>=0 && array[first]>key){
                array[first+1]=array[first];
                first=first-1;
            }
                array[first+1]=key;

        }

    }
}