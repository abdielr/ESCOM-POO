#include <stdlib.h>
#include <math.h>
#include "rational.h"

void handleError(int);


rat createRational(){
    rat r;
    r = (rat)malloc(sizeof(rational));
    if(r == NULL){
	handleError(0);
	exit(0);
    }
    return r;
}
rat assignNum(rat r, float num){
    r->numerator = num;
    return r;
}
rat assignDen(rat r, float num){
    r->denominator = num;
    return r;
}
float getNum(rat r){
    return(r->numerator);
}
float getDen(rat r){
    return(r->denominator);
}
rat sum(rat n1, rat n2){
    rat n3;
    n3 = createRational();
    n3 = assignNum(n3,((getNum(n1)*getDen(n2))+(getNum(n2)*getDen(n1))));
    n3 = assignDen(n3,getDen(n1)*getDen(n2));
    return n3;
}

rat subtract(rat n1, rat n2){
    rat n3;
    n3 = createRational();
    n3 = assignNum(n3,((getNum(n1)*getDen(n2))-(getNum(n2)*getDen(n1))));
    n3 = assignDen(n3,getDen(n1)*getDen(n2));
    return n3;
}




