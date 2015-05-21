#include <cstdio>
#include <iostream>
#include <cmath>
using namespace std;

float Plus (float a, float b) { return a+b; }
float Minus (float a, float b) { return a-b; }
float Multiply(float a, float b) { return a*b; }
float Divide (float a, float b) { return a/b; }

void SwitchCalc(float a, float b, char opCode)
{
	float result;
	// execute operation
	switch(opCode){
		case '+' : result = Plus (a, b); break;
		case '-' : result = Minus (a, b); break;
		case '*' : result = Multiply (a, b); break;
		case '/' : result = Divide (a, b); break; 
	}
	cout << "Switch Calc =" << result << endl; // display result
}

void SwitchFunCalc(float (*pUserCalc) (float, float),
		float a, float b)
{
	float result = pUserCalc(a, b);

	//float result = (*pUserCalc) (a, b);
	cout << "Switch Function Pointer Calc =" << result << endl;
	// display result
}

float UserCalc(float a, float b)
{
	return (sqrt(a*b));
}

float UserCalcSqrtRound(float a, float b)
{
	return round(sqrt(a*b));
}

int main (void)
{
	SwitchCalc(4,3, '+');
	SwitchCalc(4,3, '-');
	SwitchCalc(4,3, '*');
	SwitchCalc(4,3, '/');

	SwitchFunCalc(&Plus, 4,3);
	SwitchFunCalc(&Minus, 4,3);

	// if two fuctions(SwitchCalc, SwitchFunCalc) is given to library without source code.
	//--> add root sqare user defined function. how do ?
	//User defined Function Callback.
	SwitchFunCalc(&UserCalc, 4,3);

	SwitchFunCalc(&UserCalcSqrtRound, 4,3);


	//+,-,*,/,sqrt
	//Homework using user define stucture using c.
	//UserData *pUserData = 
	//UserDataFunc(&UserData);
	//free(pUserData);

	//C++ class
	//CalcClass
	

	return 0;
}


/* Home work *
*/
