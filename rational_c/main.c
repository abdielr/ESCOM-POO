/*
 * Reyes Rodríguez Enrique Abdiel
 * 2CM11
 * POO
 */
#include <stdio.h>
#include <stdlib.h>
#include "rational.h"
#include <time.h>

void handleError(int);
void freeMem(rat,rat,rat);
void requestNumber(rat);
void autogenNumber(rat);
void displayRational(rat);
void menu();


int main(){
    
    srand((unsigned)time(NULL));     
    menu();

    return 0;
}
void menu(){

    char o;
    rat n1,n2,n3;
    n1 = createRational();
    n2 = createRational();
    n3 = createRational(); 
    
    printf("Type your choose\n");
    printf("\t(a) auto generate numbers\n");
    printf("\t(b) type yourself\n");
    printf("\t(c)exit\n");
    scanf(" %c",&o);
    
    switch(o){
	case 'b':
	    requestNumber(n1);
	    requestNumber(n2);
	    displayRational(n1);
	    displayRational(n2);
	    printf("\t\tSuma\n");
	    n3 = sum(n1,n2);
	    displayRational(n3);
	    printf("\t\tResta\n");
	    n3 = subtract(n1,n2);
	    displayRational(n3);
	    break;
	case 'a':
	    autogenNumber(n1);
	    autogenNumber(n2);
	    displayRational(n1);
	    displayRational(n2);
	    printf("\t\tSuma\n");
	    n3 = sum(n1,n2);
	    displayRational(n3);
	    printf("\t\tResta\n");
	    n3 = subtract(n1,n2);
	    displayRational(n3);
	     break;
	case 'c':
	    exit(0);
	default:
	    menu();
    }
    menu();
    
    	
}
void displayRational(rat n){
    printf("**********************\n");
    printf("%.0f \n",getNum(n));
    printf("--\n");
    printf("%.0f \n",getDen(n));
}
void requestNumber(rat n){
    float num,den;
    printf("Type the numerator\n");
    scanf("%f",&num);
    printf("Type the denominator\n");
    scanf("%f",&den);
    n = assignNum(n,num);
    n = assignDen(n,den);
}
void autogenNumber(rat n1){
    n1 = assignNum(n1,(rand()%100) +1);
    n1 = assignDen(n1,(rand()%100) +1); 
}

void handleError(int e){
    char *errors[] = {"No memory left."};
    printf("%s",errors[e]);
}
void freeMem(rat n1,rat n2,rat n3){
    free(n1);
    free(n2);
    free(n3);
}
