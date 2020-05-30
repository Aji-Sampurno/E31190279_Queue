package e31190279_queue;

/**
 *
 * @author AJI SAMPURNO
 */
public class Queue 
{
    //membuat variabel yang digunakan dalam program
    boolean kosong = true;//boolean untuk data kosong
    boolean penuh = false;//boolean untuk data penuh
    int maksimal = 5;//panjang maksimal untuk array
    int queue[] = new int[maksimal];//nama array dan panjang array
    int size;//variabel untuk mengisi array
    int front;//variabel untuk memindahkan awal array
    int rear;//variabel untuk memindahkan akhir array
    
    //method untuk mengecek niali dari boolean penuh
    public boolean isPenuh(){
        return(penuh); //mengembalikan nilai
    }
    //method untuk mengecek niali dari boolean kosong
    public boolean isKosong(){
        return(kosong); //mengembalikan nilai 
    }
    
    //membuat method untuk melakukan enqueue
    public void enQueue(int data)
    {
        //membuat kondisi
        if(!isPenuh())//jika queue belum penuh
        {
            queue[rear]=data;//memasukkan nilai data pada array dari inputan
            rear = (rear+1)%5;//menentukan akhiran array agar dapat berubah 
            size = size+1;//menambah ukuran dari panjang array
            kosong = false;//mengganti boolean kosong menjadi false
            System.out.println("Queue Telah di Tambahkan\n");//menampilkan pesan
            //membuat kondisi 
            if(size == maksimal)//jika size sudah mencapai panjang maksimal dari array
            {
                penuh = true; //nilai boolean penuh menjadi true
            }
        }
        else // jika kondisi if tidak terpenuhi
        {
            System.out.println("Queue telah penuh\n");//maka akan menampilkan pesan
        }
    }
    
    //membuat method untuk melakukan dequeue
    public int deQueue()
    {
        //membuat kondisi
        if(!isKosong())//jika queue tidak kosong
        {
            int data = queue[front];//menentukan isi dari array
            front = (front+1)%5;//memindahkan posisi awal dari array ( menghapus awal array) 
            size = size-1;//mengurangi nilai size untuk mengurangi data yang ada pada array
            penuh = false;//mengganti boolean penuh
            System.out.println("Queue Telah di Hapus\n");//menampilkan pesan
            //membuat kondisi
            if(size==0)//jika nilai size sama dengan 0
            {
                kosong = true;//mengganti boolean kosong menjadi true
            }
        }
        else//jika kondisi if tidak terpenuhi
        {
            System.out.println("Tidak Ada Queue\n");//menampilkan pesan
        }
        return 0;//mengembalikan nilai
    }
    
    //membuat method untuk melakukan show
    public void show()
    {
        System.out.println("Queue : ");//menampilkan pesan
        //membuat kondisi
        if(isKosong())//jika queue masih kosong
        {
            System.out.println("Tidak Ada Queue\n");//menampilkan pesan
        }
        else//jika kondisi if tidak terpenuhi
        {
            for (int i = 0; i < size; i++) //prulangan untuk menampilkan nilai pada array
            {
                System.out.println(queue[(front+i)%5]+" ");//menampilkan outputan untuk data pada array
                System.out.println("");
            }
        }
    }
}
