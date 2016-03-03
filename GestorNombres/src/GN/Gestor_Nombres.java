package GN;

import javax.swing.JOptionPane;

public class Gestor_Nombres {
	
	String [] Nombre = new String [100]; // tamaño de 100 por el ejercicio.
	String NuevoNombre;
	
	public Gestor_Nombres (){
}
	
	public void IntroducirNombre(){
		if(NuevoNombre.length()<=20 && NuevoNombre.length()>=1){
            for (int i=0; i<Nombre.length; i++){
                     Nombre[i]=NuevoNombre;
                  }
			}else{
			JOptionPane.showMessageDialog(null, "Tamaño insuficiente");;
	}

		}

}