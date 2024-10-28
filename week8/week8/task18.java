package week8;

public class task18 {
    //无需输入
    public static void main(String[] args) {
        int[] list1={1,2,3,4,5};
        int[] list2=reverse(list1);
        System.out.println("list1:");
        for(int value:list1){
            System.out.print(value+" ");
        }
        System.out.println("list2:");
        for(int value:list2){
            System.out.print(value+" ");
        }
    }
    public static int[] reverse(int[] list) {
        int[] result=new int[list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[j]=list[i];
        }
        return result;

    }
}
