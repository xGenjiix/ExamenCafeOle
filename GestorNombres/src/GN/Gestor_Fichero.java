package GN;

import java.io.*;

import javax.swing.JOptionPane;

public class Gestor_Fichero {

	String ruta = "C:/Users/adminB4/Documents/Ej_Ficheros/archivo_3.txt";
	BufferedWriter bw_1;
	FileReader fr;
	
public void CrearFichero() throws IOException{//crear fichero
	File archivo_1 = new File(ruta);
	archivo_1.exists();

	if (archivo_1.exists()) {
		JOptionPane.showMessageDialog(null, "El fichero  " + archivo_1
				+ " existe");
		bw_1 = new BufferedWriter(new FileWriter(archivo_1));
		bw_1.write("El text de prueba 2");
		bw_1.close();
	} else {
		JOptionPane.showMessageDialog(null, "El fichero  " + archivo_1
				+ " existe");
		bw_1 = new BufferedWriter(new FileWriter(archivo_1));
		bw_1.write("El text de prueba 2");
		bw_1.close();
	}
}

	public static String muestraContenido(String archivo_1) throws FileNotFoundException, IOException {// leer de fichero
		String aux;
		String cadena="";
		FileReader f= new FileReader(archivo_1);
		BufferedReader br= new BufferedReader(f);
		while((aux = br.readLine())!=null){
				cadena +=aux+"\n";
		}
		br.close();
		return (cadena);}
}
