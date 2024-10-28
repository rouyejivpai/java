package week8;



public class task21 {
    public static void main(String[] args) {
        int[] list ={2,4,7,10,11,45,50,59,60,66,69,70,79};

        int j=binarySearch(list,2);
        int k =binarySearch(list,1);

        System.out.println("The key index:"+j);
        System.out.println("The key index:"+k);

    }
    //Binary search to find the key in the list
    public static int binarySearch(int[]list,int key){
        int low =0;
        int high =list.length -1;
        while(high >=low){
            int mid =(low+high)/2;
            if(key<list[mid]){
                high =mid -1;
            }
            else if(key ==list[mid]){
                return mid;
            }
            else //key >list[mid]
                low =mid+1;
        }
        return -low -1;//Now high<low,key not found//Returning -low-1 indicates not only that the key//is not in the list,but also where the key would be inserted.
    }

}
