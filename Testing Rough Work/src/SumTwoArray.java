public class SumTwoArray {
    public static void main(String []args) {
        int[] arr1 = {9, 9,9,2,8};
        int[] arr2 = { 9,8,5};
        int l1 = arr1.length-1;
        int l2 = arr2.length-1;
        //int max = Math.max(arr1.length, arr2.length);
        //int[] sum = new int[max+1];

        int[] sum = new int[arr1.length > arr2.length ? arr1.length+1 : arr2.length > arr1.length? arr2.length+1 : arr1.length+1];

        int l3 = sum.length-1;
        int c =0;
        while (l3 >= 0){
            int d = c;
            if(l1>=0){
                d =d+arr1[l1];
            }
            if(l2>=0){
                d = d+arr2[l2];
            }
            c = d/10;
            d = d%10;
            sum[l3] = d;
            l1--;
            l2--;
            l3--;
        }
        for(int x : sum) {
            System.out.println(x+" ");
        }
    }
}
