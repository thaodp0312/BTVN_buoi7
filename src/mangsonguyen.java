import java.util.Scanner;

public class mangsonguyen {
    void mangnguyen(){
        System.out.print("Nhập số phần tử cho mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mang[];
        mang = new int[n];
        for (int i=0; i< n; i++){
            System.out.print("Nhập phần tử thứ "+ (i+1) +" của mảng: ");
            mang[i]= sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng là: ");
        for (int i=0; i< n; i++) {
            System.out.print(mang[i] + "\t");
        }
        int max=0;
        for (int i=0; i<n; i++){
            if (max<mang[i]){
                max=mang[i];
            }
        }
        System.out.println();
        System.out.println("Phần tử lớn nhất là: "+max);
        for (int i=0; i<n; i++){
            if (max == mang[i]){
                System.out.println("Index của phần tử lớn nhất là: "+i);
            }
        }
        int max2=0;
        for (int i=0; i<n; i++) {
            if ((max2 < mang[i])&&(mang[i] != max)) {
                max2 = mang[i];
            }
        }
        System.out.println("Phần tử lớn thứ hai là: "+max2);
        for (int i=0; i<n; i++){
            if (max2 == mang[i]){
                System.out.println("Index của phần tử lớn thứ hai là: "+i);
            }
        }
        int min=mang[0];
        for (int i=0; i<n; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất là: "+min);
        for (int i=0; i<n; i++){
            if (min == mang[i]){
                System.out.println("Index của phần tử nhỏ nhất là: "+i);
            }
        }
    }

}
