import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz : ");
        a = inp.nextInt();

        System.out.print("2.Sayiyi giriniz : ");
        b = inp.nextInt();

        System.out.print("3.Sayiyi giriniz : ");
        c = inp.nextInt();

        // küçükten büyüye doğru sıralama

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.print( "a < b <c  ");
            }else {
                System.out.print("a < c < b  ");}}
        else if ((b<a) && (b<c)){
            if (a<c){
                System.out.print("b < a < c  ");
            } else {
                System.out.print("b < c < a  ");}}
        else {
            if (b<a){
                System.out.print("c < b <a  ");
            }else {
                System.out.print("c < a < b  ");}}
    }
}
