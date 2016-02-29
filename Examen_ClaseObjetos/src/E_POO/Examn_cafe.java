package E_POO;

public class Examn_cafe {
	private String modelo=""; //Nombre del modelo de la maquina de cafe. Se nombran como privadas para no modificarlas en el main por error
	private String propie=""; // Nombre de la empresa que posee dicha maquina. Se nombran como privadas para no modificarlas en el main por error.
	private int cafe; // cantidad de cafe total. Se nombran como privadas para no modificarlas en el main por error
	private int agua; // cantidad de agua total. Se nombran como privadas para no modificarlas en el main por error
	int ncafe; // cantidad de coste del cafe
	int nagua; // cantidad de coste del agua
	private int lcafe; // canditad limite de cafe
	private int lagua; // cantidad limite de agua
	int CStotal; // cantidad de cafes servidos
	int fillcafe; // cantidad a rellenar de cafe
	int fillagua; // cantidad a rellenar de agua
	
public Examn_cafe(String modelo, String propie, int cafe, int agua, int lcafe, int lagua){//Para asiganar valores al crear objeto
	this.modelo=modelo;
	this.propie=propie;
	this.cafe=cafe;
	this.agua=agua;
	this.lcafe=lcafe;
	this.lagua=lagua;
}
public String ModeloCafetera(){//Metodo para mostrar el Modelo de cafetera del cual forma parte el objeto
	System.out.println("Cafetera modelo "+modelo);
	return(modelo);
}
public String EmpresaPropietaria(){//Metodo para mostrar la empresa propietaria del cual forma parte el objeto
	System.out.println("Cafetera propiedad de "+propie);
	return(propie);
}
public void CapuChino(){//Metodo para servir cafe
	ncafe=2;//Cantidad de cafe necesaria para nuestro CapuChino
	nagua=6;//Cantidad de agua necesaria para nuestro CapuChino
	if(cafe>2 && agua>6){// verificamos que CapuChino necesita un minimo de agua y cafe para hacerse.
		System.out.println("Su CapuChino esta listo.");
		cafe= cafe-ncafe;//Restamos a la cantidad de cafe total la necesaria para nuestro CapuChino
		agua= agua-nagua;//Restamos a la cantidad de agua total la necesaria para nuestro CapuChino
		CStotal=CStotal+1;//Por cada CapuChino servido aumenta en 1 el total de Cafes Servidos
	}else{// Si no dira que no hay suficiente recursos para el CapuChino
		System.out.println("No hay recursos para su CapuChino");}
}
public void Rellenar(){//Metodo para rellenar los depositos
	/*if(cafe+fillcafe>100){
		cafe=cafe+fillcafe;// con esta operación rellenamos el deposito de cafe
	}else{
		
	}*/
	fillcafe=lcafe-cafe;//Con esta operación nos seguramos que no se desborde el deposito de cafe
	fillagua=lagua-agua;//Con esta operación nos seguramos que no se desborde el deposito de agua
	cafe=cafe+fillcafe;// con esta operación rellenamos el deposito de cafe
	agua=agua+fillagua;// con esta operación rellenamos el deposito de agua
}
public int getCafeRestante(){//Metodo para mostrar cantidad de cafe 
	System.out.println("Dispone de "+cafe+" de cafe.");
	return(cafe);
}
public int getAguaRestante(){//Metodo para mostrar cantidad de agua
	System.out.println("Dispone de "+agua+" de agua.");
	return(agua);
}
public int getTotalCafesServidos(){//Metodo para mostrar la cantidad de cafes totales servidos
	System.out.println("La cantidad total de cafes servidos es de :"+CStotal+" cafes servidos.");
	return(CStotal);
}
}
