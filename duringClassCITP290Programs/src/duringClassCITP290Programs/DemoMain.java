package duringClassCITP290Programs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class DemoMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstName("James");
		p.setLastName("Hoffmann");
		p.setAge(3);
		p.setHeight(20.0);
		p.setWeight(100.0);
		
		Person p2 = new Person();
		p2.setFirstName("Billy");
		p2.setLastName("Bob");
		p2.setAge(33);
		p2.setHeight(220.0);
		p2.setWeight(1100.0);
		
		File f = new File("data.txt");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Could not create file.");
				System.exit(-1);
			}
		}
		
		PrintWriter pw = null;
		
		try {
			// The true in the FOS constructor ensures that
			// this will append to the file instead of write
			// over it.
			pw = new PrintWriter(new FileOutputStream(f, true));
		} catch (FileNotFoundException e) {
			System.out.println("Could not locate file.");
		}
		
		if (pw != null) {
			pw.write(p.getFirstName()+"\t");
			pw.write(p.getLastName()+"\t");
			pw.write(Integer.toString(p.getAge())+"\t");
			pw.write(Double.toString(p.getHeight())+"\t");
			pw.write(Double.toString(p.getWeight())+"\n");
			pw.write(p2.getFirstName()+"\t");
			pw.write(p2.getLastName()+"\t");
			pw.write(Integer.toString(p2.getAge())+"\t");
			pw.write(Double.toString(p2.getHeight())+"\t");
			pw.write(Double.toString(p2.getWeight()));
		}
		
		pw.close();
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file.");
		}
		
		for (int i = 0; i < 2; i++) {
			String in = sc.nextLine();
			String[] fields = in.split("\t");
			System.out.println("First Name: " + fields[0]);
			System.out.println("Last Name: " + fields[1]);
			System.out.println("Age: " + fields[2]);
			System.out.println("Height: " + fields[3]);
			System.out.println("Weight: " + fields[4]);
		}

	}

}









