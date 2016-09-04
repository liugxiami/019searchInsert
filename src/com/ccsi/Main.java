package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] a={1,3,5,6};
        int res=insertPosition(a,7);
        System.out.println(res);
    }
    //Given a sorted array and a target value,return the index if the target is found. if not,return the index
    //where it would be if it were inserted in order
    public static int insertPosition(int[] array,int target){
        if(array==null||array.length==0) return 0;
        int li=0,hi=array.length-1;
        while(li<=hi){
            int mi=li+(hi-li)/2;
            if(array[mi]==target){
                return mi;
            }else if(array[mi]>target){
                hi=mi-1;
            }else{
                li=mi+1;
            }
        }
        return li;
    }
}
