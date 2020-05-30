package e31190279_queue;

import java.util.Scanner;//memanggil kelas java untuk melakukan input dari keyboard(scanner)

/**
 *
 * @author AJI SAMPURNO
 */
public class run 
{
    public static void main(String[] args){
        //membuat variabel dengan type data integer
        int pilihan;
        int data;
        
        //membuat outputan untuk memilih menu dengan memanggil kesal Queue
        Queue result = new Queue();
        //membuat perulangan untuk menjalankan program
        do{
            System.out.println("============================================");
            System.out.println(" MENU                                       ");
            System.out.println("============================================");
            System.out.println(" 1. ENQUEUE                                 ");
            System.out.println(" 2. DEQUEUE                                 ");
            System.out.println(" 3. LIHAT QUEUE                             ");
            System.out.println(" 4. KELUAR                                  ");
            System.out.println("============================================");
            System.out.print("Pilih Menu : ");
            //scanner untuk memasukkan menu yang akan dipilih
            Scanner input = new Scanner(System.in);//memanggil scanner
            pilihan = input.nextInt();//scanner untuk memasukkan data yang ingin dimasukkan
            
            //jika memilih menu 1
            if(pilihan==1){
                System.out.print("Data yang di tambahkan : ");//menampilkan pesan untuk memasukkan data
                data = input.nextInt();//scanner untuk memasukkan data yang ingin dimasukkan
                result.enQueue(data);//memanggil method queue
            }
            //jika memilih menu 2
            else if(pilihan==2){
                result.deQueue();//memanggil method dequeue
            }
            //jika memilih menu 3
            else if(pilihan==3){
                result.show();//memanggil method show
            }
            //jika memilih menu 0
            else if(pilihan==0){
                System.exit(0);//mengakhiri sesi
            }
            //jika menu yang dipilih tidak ada
            else{
                System.out.println("Pilihan tidak ada");//menampilkan pesan 
            }
        }while(pilihan !=0);//akhir perulangan
    }
}
