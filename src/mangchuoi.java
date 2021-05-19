import java.util.Scanner;

public class mangchuoi {
    void mangxau() {
        System.out.print("Nhập số phần tử của mảng chuỗi: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[]=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+" : ");
            Scanner sc2 = new Scanner(System.in);
            String s = sc2.nextLine();
            str[i]=s;
        }
        System.out.println("Các phần tử của mảng chuỗi là: ");
        for (int i =0; i<n;i++){
        System.out.println(str[i]);
        }
        int dem =0;
        for (int i=0; i<n; i++) {
            if(str[i].equals("Java")){
                dem++;
            }
        }
        System.out.println("Số lần từ Java xuất hiện: "+dem);
        System.out.print("Nhập chuỗi bất kỳ: ");
        Scanner sc3 = new Scanner((System.in));
        String s2= sc3.nextLine();
        System.out.print("Chuỗi "+ s2+ " ở vị trí: ");
        for (int i=0; i<n;i++){
            if (str[i].equals(s2)){
                System.out.println(i+1);
            }
        }
    }
}
