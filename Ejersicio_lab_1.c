#include<stdio.h>
#include<stdlib.h>

void division();
void multiplicacion();
void factorial();
int main(){
	int a,b=1;
	do{
		printf("     Menu  \n");
		printf("1.-Division.\n");
		printf("2.-Multiplicacion.\n");
		printf("3.-Factorial.\n");
		printf("4.-Salir.\n");
		printf("Seleccione una opccion: ");
		scanf("%d",&a);
		switch(a){
			case 1:
				division();
			break;
			case 2:
				multiplicacion();
			break;
			case 3:
				factorial();
			break;
			case 4:
				return 0;
			break;
			default:
				printf("El valor no es correcto\n");
		}
		system("PAUSE");
		system("cls");
	}while(b==1);
	return 0;
}

void division(){
	int a,b,c,cociente;
		printf("   Division de numeros enteros\n");
		printf("Ingresar el valor del dividendo:\n");
		scanf("%d",&a);
		printf("Ingresar el valor del divisor:\n");
		scanf("%d",&b);
		c=a;
		for(cociente=0;a>=b;cociente++){
			a-=b;
		}
		printf("el resultado de %d entre %d es: %d\n",c,b,cociente);
}

void multiplicacion(){
	int a,b,c,d;
	printf("   Multiplicacion de dos numeros\n");
		printf("Ingresa los numero: \n");
		scanf("%d",&a);
		scanf("%d",&b);
		c=a;
		for(d=1;d<b;d++){
			c+=a;
		}
		printf("el resultado de multipicar %d x %d es: %d\n",a,b,c);
}

void factorial(){
	int a,b,facto;
	printf("ingrese un numero:");
	scanf("%d",&a);
	if(a==0){
		printf("El factorial de 0 es: 1\n");
	}
	else{
		b=a-1;
		for(facto=a;b>0;b--){
			facto*=b;
		}
		printf("el factorial de %d es: %d\n",a,facto);
	}
}
