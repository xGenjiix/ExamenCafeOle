package E_POO;
import java.util.Scanner;
public class Main_ExamnCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		int decision;
		String owner;
		String model;
		int cafeini;
		int aguaini;
		int lcafeini;
		int laguaini;
		Scanner dec=new Scanner(System.in);
		Scanner ms=new Scanner(System.in);
		

		System.out.println("Introduzca modelo de la cafetera.");
		model=ms.nextLine();
		System.out.println("Introduzca nombre del propietario.");
		owner=ms.nextLine();
		System.out.println("Cantidad inicial de cafe en deposito.");
		cafeini=ms.nextInt();
		System.out.println("Cantidad inicial de agua en deposito.");
		aguaini=ms.nextInt();
		System.out.println("Cantidad total de cafe en deposito.");
		lcafeini=ms.nextInt();
		System.out.println("Cantidad total de agua en deposito.");
		laguaini=ms.nextInt();
		Examn_cafe NC = new Examn_cafe( model,  owner,  cafeini,  aguaini, lcafeini, laguaini);
		/*En la sentencia superio le asignamos el nombre del modelo, propietario,
		cantidad incial de agua y cafe y cantidad limite de agua y cafe.*/
		
		do{//creamos un bucle para que usuario realizer todas las opciones que requiera.
			System.out.println("¿Qué opción quiere llevar acabo?: "
					+ "\n1. Saber Modelo cafetera."
					+ "\n2. Empresa propietaria de la cafetera."
					+ "\n3. Servir un impresionantemente delicioso CapuChino."
					+ "\n4. Rellenar depositos de agua y cafe."
					+ "\n5. Cantidad de cafe restante."
					+ "\n6. Cantidad de agua restante."
					+ "\n7. Cantidad de cafes servidos.");
			menu=ms.nextInt();
			switch(menu){
				case 1://Informa al usuario del modelo de la cafetera.
					NC.ModeloCafetera();
					break;
				case 2:// Informa al usuario del propietario de la cafetera.
					NC.EmpresaPropietaria();
					break;
				case 3:// Sirve al usuario un ESPECTACULAR CapuChino.
					NC.CapuChino();
					break;
				case 4:// Rellena la maquina de cafe.
					NC.Rellenar();
					break;
				case 5:// Informa al usuario de la cantidad de cafe restante.
					NC.getCafeRestante();
					break;
				case 6:// Informa al usuario de la cantidad de agua restante.
					NC.getAguaRestante();
					break;
				case 7:// Informa al usuario de la cantidad de cafes que ha servido.
					NC.getTotalCafesServidos();
					break;
				default:// Por si el usuario apreta botones que ni deberian exisitir.
					System.out.println("Opción no valida");
					break;
			}
		System.out.println("¿Desea realizar algúna otra acción? \n1. Si. \n2. No.");
		decision=dec.nextInt();
		}while(decision!=2);
			System.out.println("Gracias usar nuestra "+model+" Deseamos que haya sido de su agrado");
		ms.close();
		dec.close();

		}
	

	}


