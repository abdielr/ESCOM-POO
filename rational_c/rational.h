#ifndef __rational__
#define __rational__

typedef struct{
    float numerator;
    float denominator;
}rational;

typedef rational *rat;

    rat createRational();
    
    rat assignNum(rat n, float num);
    rat assignDen(rat n, float den);

    rat sum(rat n1, rat n2);
    rat subtract(rat n1,rat n2);
    float getNum(rat n);
    float getDen(rat n);
#endif
