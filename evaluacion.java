import java.util.Scanner;
public class Program
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	switch (n){
	
	case 1 : //calculadora

  Scanner teclado=new Scanner(System.in);
    int n1;
    int n2;
    int resultado1;
    int resultado2;
    int resultado3;
    System.out.println("primer numero ");
    n1=teclado.nextInt();
     System.out.println(n1);
        System.out.println(" segundo numero ");
    n2=teclado.nextInt();
     System.out.println(n2);
    resultado1 = n1+n2;
    resultado2 = n1-n2;
    resultado3 = n1*n2;
    System.out.println("la suma de los dos numeros es: "+resultado1);
    
    System.out.println("la resta de los dos numeros es: "+resultado2);
    
    System.out.println("la multiplicacion de los dos numeros es: "+resultado3);


	break ;
	case 2 :// numeros aleatorios
double rand;
	    rand=Math.round(Math.random()*75); 
	    System.out.println(rand);
		
	break;
	case 3 : //tabla de multiplicar de numero introucido
	
    int entrada;
    Scanner sc = new Scanner(System.in);
    System.out.println(" ingresar numero para ver la tabla de multiplicar");
    entrada = sc.nextInt();
    for(int i = 1; i <= 10; i++){
      int multiplicacion = entrada * i;
      System.out.println(entrada+"*"+i+"="+multiplicacion);
    


	break ;
	case 4 ://calcular edad
public class Calcular {

    public static void main(String[] args) {
        int aActual; //anio actual
        int aNacimiento; //Anio de nacimiento.
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Anio de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("Anio actual: ");
        aActual = sc.nextInt();
        
        edad = aActual - aNacimiento; 
        
        System.out.println("Su edad es: " +edad + " anios.");
    }
    
}
	break ;


	case 6 : // convertir temperatura 

public class convertir{
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("ingrese la temperatura en farenheit.");
        double farenheit=temp.nextDouble();
       double celsuis=((farenheit-32)*5)/9;
       
        System.out.println(farenheit + " grados Farenheit  " + celsuis + "en celsuis .");
    
    }

case 7: // concatenar

 public static void main(String[] args) {
      
Scanner n=new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nom=n.next();
        System.out.println("ingrese el apellido");
String apellido=n.next();
System.out.println("ingrese la direccion");
String dir=n.next();
       System.out.println("ingrese el correo");
String correo=n.next();
 System.out.println("ingrese el telefono");
String tl=n.next();
        System.out.print(nom.concat("").concat(apellido).concat("").concat(dir).concat(correo).concat("").concat(tl));
    }


		default :
		System.out.println(" numero invalido");
	
}}			
