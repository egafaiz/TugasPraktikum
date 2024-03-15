<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<book> booklist = new ArrayList<>();
    static ArrayList<Mahasiswa> userstudent = new ArrayList<>();
    static Scanner inputswitchcase = new Scanner(System.in);
    static Scanner inputuser = new Scanner(System.in);
    static String NIM;

    static class book{
        String id, namabuku, author, category;
        int no, stock;

        public book(int no, String id, String namabuku, String author, String category, int stock){
            this.no = no;
            this.id = id;
            this.namabuku = namabuku;
            this.author = author;
            this.category = category;
            this.stock = stock;
        }
    }
    static class Mahasiswa{
        String nama, nim, fakultas, jurusan;
        public Mahasiswa(String nama, String nim, String fakultas, String jurusan){
            this.nama = nama;
            this.nim = nim;
            this.fakultas = fakultas;
            this.jurusan = jurusan;
        }
    }
    static void menu(){
        int menuloop = 0;
        do{
            System.out.println("\n==== Library System ====");
            System.out.print("\n1. Login as student\n2. Login as admin\n3. Exit\n");
            System.out.print("Choose option (1-3): ");

            int pilihan = inputswitchcase.nextInt();
            switch (pilihan) {
                case 1:
                    student.loginstudent();
                    menustudent();
                    break;

                case 2:
                    admin.loginadmin();
                    menuadmin();

                    break;

                case 3:
                    menuloop = 1;
                    break;
            }
        }while(menuloop == 0);
    }

    static void inputNIM(){
        System.out.println("Masukkan NIM: ");
        NIM = inputuser.nextLine();
    }

    static void menuadmin() {

        System.out.println("\n==== Admin Menu ====");
        System.out.println("\n1. Tambah Mahasiswa\n2. Daftar Mahasiswa\n3. Tambah Buku\n4. Logout");
        System.out.print("Choose option (1-3): ");

        int pilihan = inputswitchcase.nextInt();
        switch (pilihan) {
            case 1:
                admin.addstudent();
                break;
            case 2:
                admin.displaystudent();
                break;
            case 3:
                admin.addbook();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.print("Pilih 1-4");
                menuadmin();
        }


    }

    static void menustudent(){

        System.out.println("\n==== Student Menu ====");
        System.out.print("\n1. Daftar buku\n2. Pinjam buku\n3. Pengembalian buku\n4. Logout");
        System.out.println("\n Choose option (1-3): ");

        int pilihan = inputswitchcase.nextInt();
        switch (pilihan){
            case 1:
                student.displaybooks();
                break;
            case 2:
                System.out.println("\n====  Pinjam Buku  ====");
                System.out.println("\nMasukkan id buku: ");
                String idbukudipinjam = inputuser.nextLine();
                for(Main.book i : Main.booklist){
                    if(i.id.equals(idbukudipinjam)){
                        if(i.stock > 0){
                            i.stock--;
                            System.out.println("Buku berhasil dipinjam");
                        }else{
                            System.out.println("Stok buku habis");
                        }
                    }
                }

                break;
            case 3:
                System.out.println("\n====  Pengembalian Buku   ====");
                System.out.print("\nMasukkan id buku: ");
                String idbukupengembalian = inputuser.nextLine();
                for(Main.book i : Main.booklist){
                    if(i.id.equals(idbukupengembalian)){
                        if(i.stock >= 0){
                            i.stock++;
                            System.out.println("Buku berhasil dikembalikan");
                        }
                    }
                }
                break;
            case 4:
                student.logout();

            default:
                System.out.print("Pilih 1-4");
                menustudent();
        }

    }

    public static void main(String[] args) {
        menu();
    }
>>>>>>> 3477bae (second commit)
}