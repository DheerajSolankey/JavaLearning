package com.dheeraj;

public class practice_array {
    public static void main(String[] args) {
//        float [] marks= {45.5f ,65.6f , 78.9f ,67.8f ,33.4f};
//        float sum=0;
//        for (float element:marks){
//            sum=sum+element;
//        }
//        System.out.println("the sum is \n"+sum);
        /*float [] marks= {45.5f ,65.6f , 78.9f ,67.8f ,33.4f};
        float num=45.55f;
        boolean isInArray=false;
        for (float element:marks){
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is in array");

        }
        else{
            System.out.println("not");
        }*/
//        float [] marks= {45.5f ,65.6f , 78.9f ,67.8f ,33.4f};
//        float sum=0;
//        for (float element:marks){
//            sum=sum+element;
//        }
//        System.out.println("the sum is \n"+sum/ marks.length);
       /* int [][] mat1={{1,2,3},
                      {4,5,6}};
        int [][] mat2={{2,2,3},
                      {4,5,6}};
        int [][] result={{0,0,0},
                         {0,0,0}};
        for (int i=0;i<mat1.length;i++) {
            for (int j=0; j < mat1[i].length; j++) {
                System.out.format("setting value for i=%d and j=%d",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }
        for (int i=0;i<mat1.length;i++) {
            for (int j=0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }*/
        /*int [] arr= {1,2,3,4,5,6};
        int l= arr.length;
        int temp;
        int n= Math.floorDiv(arr.length,2);
        for (int i=0;i<n;i++){
            //swap a[i] and a[l-1-i]
            temp =arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr){
            System.out.print(element + " ");
        }*/
        int [] arr= {1,55,3,66,5,6};
        int max =0;
        for (int element:arr){
            if(element>max){
                max=element;
            }
            System.out.println("the maximum value is:" + max);
        }
    }
}
