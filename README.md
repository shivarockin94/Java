package ioprograms;
import java.io.*;
class Book implements Serializable
{
	int bno;
	String bname;
	double price;
	public Book(int bno, String bname, double price) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	public Book() {}
	public String toString()
	{
		return bno +" "+ bname+" "+ price;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		FileOutputStream fos = new FileOutputStream("C:/Users/BSSK/eclipse-workspace/MyProject/src/ioprograms/book.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book(111,"Spring", 500.0);
		oos.writeObject(b);
		oos.close();
		fos.close();
		
		// DeSerialization 
		FileInputStream fis = new FileInputStream("C:/Users/BSSK/eclipse-workspace/MyProject/src/ioprograms/book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book b1 = (Book) ois.readObject();
		System.out.println(b1);
		ois.close();
		fis.close();
	}

}
