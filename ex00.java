{\rtf1\ansi\ansicpg949\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 AndaleMono;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;}
{\colortbl;\red255\green255\blue255;\red171\green173\blue176;\red35\green37\blue41;}
{\*\expandedcolortbl;;\cssrgb\c72549\c73333\c74510;\cssrgb\c18431\c19216\c21176;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.Random;\
import java.util.Scanner;\
\
/*\

\f1 \'c1\'b6\'b0\'c7\'b9\'ae
\f0 \
1. if 
\f1 \'b9\'ae
\f0 \
\
- 
\f1 \'b4\'dc\'bc\'f8
\f0  if : 
\f1 \'c1\'b6\'b0\'c7\'c0\'cc
\f0  
\f1 \'c2\'fc\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec\'bf\'a1\'b8\'b8
\f0  
\f1 \'bd\'c7\'c7\'e0
\f0 \
	if(
\f1 \'c1\'b6\'b0\'c7\'bd\'c4
\f0 )\{\
		
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\}\
\
- if ~ else : 
\f1 \'c1\'b6\'b0\'c7\'c0\'cc
\f0  
\f1 \'c2\'fc\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec\'bf\'cd
\f0  
\f1 \'b0\'c5\'c1\'fe\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec\'b8\'a6
\f0  
\f1 \'b0\'a2\'b0\'a2
\f0  
\f1 \'bd\'c7\'c7\'e0
\f0 \
	if(
\f1 \'c1\'b6\'b0\'c7\'bd\'c4
\f0 )\{\
		
\f1 \'c1\'b6\'b0\'c7
\f0  
\f1 \'c2\'fc\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\} else \{\
		
\f1 \'c1\'b6\'b0\'c7
\f0  
\f1 \'b0\'c5\'c1\'fe\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\}\
	\
- if ~ else if .... else : 
\f1 \'c1\'b6\'b0\'c7\'c0\'cc
\f0  
\f1 \'bf\'a9\'b7\'af\'b0\'b3
\f0  
\f1 \'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0 \
	if(
\f1 \'c1\'b6\'b0\'c7\'bd\'c4
\f0 1)\{\
		
\f1 \'c1\'b6\'b0\'c7
\f0 1 
\f1 \'c2\'fc\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\} else if(
\f1 \'c1\'b6\'b0\'c7\'bd\'c4
\f0 2)\{\
		
\f1 \'c1\'b6\'b0\'c7
\f0 2 
\f1 \'c2\'fc\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\} ...... \{\
	  ......\
	\} else \{\
		
\f1 \'b8\'f0\'b5\'e7
\f0  
\f1 \'c1\'b6\'b0\'c7
\f0  
\f1 \'b0\'c5\'c1\'fe\'c0\'ce
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
	\}\
	\
\
- 
\f1 \'c1\'d6\'c0\'c7
\f0 !!!! : dangling else\
else 
\f1 \'b9\'ae\'c0\'e5\'c0\'ba
\f0  
\f1 \'b0\'a1\'c0\'e5\'b0\'a1\'b1\'ee\'bf\'ee
\f0  if
\f1 \'bf\'cd
\f0  
\f1 \'c2\'a6\'c0\'cc\'b6\'f3\'b0\'ed
\f0  
\f1 \'c2\'f8\'b0\'a2\'c7\'d1\'b4\'d9
\f0 .\
if 
\f1 \'b9\'d7
\f0  else 
\f1 \'b1\'b8\'b9\'ae\'c0\'bb
\f0  
\f1 \'bd\'c7\'c7\'e0\'b9\'ae\'c0\'c7
\f0  
\f1 \'b0\'b9\'bc\'f6\'c0\'c7
\f0  
\f1 \'b0\'fc\'b0\'e8\'be\'f8\'c0\'cc
\f0  \{ \}
\f1 \'c0\'b8\'b7\'ce
\f0  
\f1 \'b9\'ad\'be\'ee\'c1\'d8\'b4\'d9
\f0 \
\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		int a = 199;\
		if (a < 100) \{\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 ");\
			System.out.println("100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'b8\'e9
\f0  
\f1 \'c3\'e2\'b7\'c2
\f0  
\f1 \'be\'c8\'b5\'ca
\f0 ");\
		\}\
		System.out.println("100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'b8\'e9
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c1\'b6\'b0\'c7
\f0  
\f1 \'bd\'c7\'c7\'e0
\f0 ");\
		if (a > 100) \{\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100 
\f1 \'ba\'b8
\f0  
\f1 \'c5\'a9\'b4\'d9
\f0 ");\
		\}\
		\
		// 
\f1 \'b4\'dc\'bc\'f8
\f0  if -> if ~ else\
		 * \
		System.out.println("--- if ~ else
\f1 \'b7\'ce
\f0  
\f1 \'ba\'af\'c8\'af
\f0  ---");\
		\
		if (a < 100) \{\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 ");\
		\} else \{\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100 
\f1 \'ba\'b8
\f0  
\f1 \'c5\'a9\'b4\'d9
\f0 ");\
		\}\
		\
		System.out.println("--- if ~ else
\f1 \'b8\'a6
\f0  
\f1 \'c1\'df\'b0\'fd\'c8\'a3
\f0  
\f1 \'be\'f8\'c0\'cc
\f0  
\f1 \'ba\'af\'c8\'af
\f0  ---");\
		\
		if (a < 100)\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 ");\
		else\
			System.out.println("
\f1 \'b1\'d7\'b7\'b8\'b4\'d9
\f0 ...100 
\f1 \'ba\'b8
\f0  
\f1 \'c5\'a9\'b4\'d9
\f0 ");\
	\}\
\}\
\
\
// dsngling else\
 \
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		\
		int a = 3, b = 5;\
		if (a < 2) \{\
			if (a == 1) \{\
				System.out.println("a : " + a);\
			\}\
		\} else \{\
				System.out.println("a : " + (a+2));\
		\}\
	\}	\
\}\
	\
	
\f1 \'b9\'ae\'c1\'a6
\f0 ) 
\f1 \'bc\'fd\'c0\'da
\f0  10
\f1 \'c0\'bb
\f0  
\f1 \'ba\'af\'bc\'f6
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c8\'c4
\f0  
\f1 \'c2\'a6\'bc\'f6\'c0\'ce\'c1\'f6
\f0  
\f1 \'c8\'a6\'bc\'f6\'c0\'ce\'c1\'f6
\f0  
\f1 \'c6\'c7\'b4\'dc\'c7\'cf\'bd\'c3\'bf\'c0
\f0 .\
	\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
\
		Scanner scan = new Scanner(System.in);// 
\f1 \'c5\'ac\'b7\'a1\'bd\'ba\'c0\'c7
\f0  
\f1 \'b0\'b4\'c3\'bc
\f0  
\f1 \'bb\'fd\'bc\'ba
\f0  : 
\f1 \'c5\'ac\'b7\'a1\'bd\'ba\'c5\'b8\'c0\'d4
\f0  
\f1 \'c5\'ac\'b7\'a1\'bd\'ba\'ba\'af\'bc\'f6
\f0  = new 
\f1 \'c5\'ac\'b7\'a1\'bd\'ba\'bb\'fd\'bc\'ba\'c0\'da
\f0 ();\
		\
		System.out.println("
\f1 \'bc\'fd\'c0\'da\'b8\'a6
\f0  
\f1 \'c0\'d4\'b7\'c2\'c7\'cf\'bc\'bc\'bf\'e4
\f0  : ");\
		int a = scan.nextInt(); \
		\
		if (a % 2 == 0) \{\
			System.out.println("
\f1 \'c2\'a6
\f0 ");\
		\} else \{\
			System.out.println("
\f1 \'c8\'a6
\f0 ");\
		\}\
	\}\
	\
\}\
\
\
\
// 
\f1 \'c1\'df\'c3\'b8
\f0  if
\f1 \'b9\'ae
\f0 \
public class SecondDay \{\
\
	public static void main(String[] args) \{\
\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (0
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'ab
\f0  
\f1 \'c0\'da\'bf\'ac\'bc\'f6
\f0 ) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'b4\'c2
\f0 (
\f1 \'c0\'ba
\f0 )");\
		if (a > 50) \{\
			if (a < 100) \{\
				System.out.println("50
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'c1\'f6\'b8\'b8
\f0  100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 .");\
			\} else \{\
				System.out.println("100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'b4\'d9
\f0 ");\
			\}\
		\} else \{\
			System.out.println("50
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 ");\
		\}\
		\
	\}\
	\
\}\
\
\
//
\f1 \'c1\'df\'c3\'b8
\f0  if
\f1 \'b9\'ae
\f0  -> if ~ else if ~ else\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (0
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'ab
\f0  
\f1 \'c0\'da\'bf\'ac\'bc\'f6
\f0 ) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'b4\'c2
\f0 (
\f1 \'c0\'ba
\f0 )");\
		if (a > 50 && a < 100) \{\
			System.out.println("50
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'c1\'f6\'b8\'b8
\f0  100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 .");\
		\} else if (a >= 100) \{\
			System.out.println("100
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c5\'a9\'b4\'d9
\f0 ");\
		\} else \{\
			System.out.println("50
\f1 \'ba\'b8\'b4\'d9
\f0  
\f1 \'c0\'db\'b4\'d9
\f0 ");\
		\}\
	\}\
\}\
\
2. switch ~ case : if ~ else if ~ else 
\f1 \'b0\'b3\'bc\'b1
\f0 \
\
switch(
\f1 \'b0\'aa
\f0 ) \{\
	case 
\f1 \'b0\'aa
\f0 1:\
		
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
		break; // switch 
\f1 \'b9\'ae\'c0\'bb
\f0  
\f1 \'ba\'fc\'c1\'ae\'b3\'aa\'bf\'c2\'b4\'d9
\f0 \
	case 
\f1 \'b0\'aa
\f0 2:\
		
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
		break; // switch 
\f1 \'b9\'ae\'c0\'bb
\f0  
\f1 \'ba\'fc\'c1\'ae\'b3\'aa\'bf\'c2\'b4\'d9
\f0 \
	......\
	case 
\f1 \'b0\'aa
\f0 n:\
		
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
		break; // switch 
\f1 \'b9\'ae\'c0\'bb
\f0  
\f1 \'ba\'fc\'c1\'ae\'b3\'aa\'bf\'c2\'b4\'d9
\f0 \
	default:\
		
\f1 \'bd\'c7\'c7\'e0\'b9\'ae
\f0 ;\
		break;\
\}\
\
\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (1~4) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'b4\'c2
\f0 (
\f1 \'c0\'ba
\f0 )");\
		\
		switch (a) \{\
		case 1:\
			System.out.println("
\f1 \'c4\'bf\'c7\'c7
\f0 ");\
			break;\
		case 2:\
			System.out.println("
\f1 \'c4\'dd\'b6\'f3
\f0 ");\
			break;\
		case 3:\
			System.out.println("
\f1 \'bb\'e7\'c0\'cc\'b4\'d9
\f0 ");\
			break;\
		case 4:\
			System.out.println("
\f1 \'b9\'b0
\f0 ");\
			break;\
		default:\
			System.out.println("
\f1 \'bc\'fd\'c0\'da\'bf\'c0\'b7\'f9
\f0 (1~4
\f1 \'b8\'b8
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0 )");\
			break;\
		\}\
	\}\
	\
\}\
\
\
\
// if ~ else if ~ else -> switch ~ case\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (1~4) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'b4\'c2
\f0 (
\f1 \'c0\'ba
\f0 )");\
		\
		if (a == 1) \{\
			System.out.println("
\f1 \'c4\'bf\'c7\'c7
\f0 ");\
		\} else if (a == 2) \{\
			System.out.println("
\f1 \'c4\'dd\'b6\'f3
\f0 ");\
		\} else if (a == 3) \{\
			System.out.println("
\f1 \'bb\'e7\'c0\'cc\'b4\'d9
\f0 ");\
		\} else if (a == 4) \{\
			System.out.println("
\f1 \'b9\'b0
\f0 ");\
		\} else \{\
			System.out.println("
\f1 \'bc\'fd\'c0\'da\'bf\'c0\'b7\'f9
\f0 (1~4
\f1 \'b8\'b8
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0 )");\
		\}\
		\
	\}\
\}\
\
\
\
// switch
\f1 \'b9\'ae\'c0\'bb
\f0  
\f1 \'c0\'cc\'bf\'eb\'c7\'cf\'bf\'a9
\f0  
\f1 \'b3\'af\'c2\'a5\'b8\'a6
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c8\'c4
\f0  
\f1 \'c7\'d8\'b4\'e7
\f0  
\f1 \'b3\'af\'c2\'a5\'c0\'c7
\f0  
\f1 \'bf\'e4\'c0\'cf\'c0\'bb
\f0  
\f1 \'c3\'e2\'b7\'c2
\f0  
\f1 \'c7\'cf\'bd\'c3\'bf\'c0
\f0 . 
\f1 \'b4\'dc
\f0 , 
\f1 \'c7\'f6\'c0\'e7
\f0  
\f1 \'bf\'f9\'c0\'bb
\f0  
\f1 \'b1\'e2\'c1\'d8\'c0\'b8\'b7\'ce
\f0  
\f1 \'c0\'db\'bc\'ba
\f0  
\f1 \'c7\'d2
\f0  
\f1 \'b0\'cd
\f0 .\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (1~31) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'b3\'af\'c2\'a5\'b4\'c2
\f0 ");\
		\
		switch (a%7) \{\
		case 0:\
			System.out.print("
\f1 \'b8\'f1
\f0 ");\
			break;\
		case 1:\
			System.out.print("
\f1 \'b1\'dd
\f0 ");\
			break;\
		case 2:\
			System.out.print("
\f1 \'c5\'e4
\f0 ");\
			break;			\
		case 3:\
			System.out.print("
\f1 \'c0\'cf
\f0 ");\
			break;\
		case 4:\
			System.out.print("
\f1 \'bf\'f9
\f0 ");\
			break;\
		case 5:\
			System.out.print("
\f1 \'c8\'ad
\f0 ");\
			break;				\
		default:\
			System.out.print("
\f1 \'bc\'f6
\f0 ");\
			break;\
		\}\
		System.out.println("
\f1 \'bf\'e4\'c0\'cf
\f0  
\f1 \'c0\'d4\'b4\'cf\'b4\'d9
\f0 .");\
	\}\
\}\
\
\
\
// 1. if ~ else if ~ else 
\f1 \'b7\'ce
\f0  
\f1 \'c7\'d0\'c1\'a1
\f0  
\f1 \'b0\'e8\'bb\'ea
\f0  
\f1 \'c7\'c1\'b7\'ce\'b1\'d7\'b7\'a5
\f0  
\f1 \'c0\'db\'bc\'ba
\f0 . 95~100 : A+, 90~94 : A, 85~89 : B+, 80~84 : B, \
//										   75~79 : C+, 70~74 : C, 65~69 : D+, 60~64 : D, 
\f1 \'b1\'d7\'bf\'dc
\f0  F\
// 2. if ~ else if ~ else -> switch 
\f1 \'ba\'af\'c8\'af
\f0 \
\
\
\
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (0~100) : ");\
		\
		int a = scan.nextInt();\
		System.out.println("
\f1 \'c0\'d4\'b7\'c2\'c7\'d1
\f0  " + a + "
\f1 \'c1\'a1\'bc\'f6\'b4\'c2
\f0 ");\
		\
		if (a >= 95) \{\
			System.out.println("A+");\
		\} else if (a >= 90) \{\
			System.out.println("A");\
		\} else if (a >= 85) \{\
			System.out.println("B+");\
		\} else if (a >= 80) \{\
			System.out.println("B");\
		\} else if (a >= 75) \{\
			System.out.println("C+");\
		\} else if (a >= 70) \{\
			System.out.println("C");\
		\} else if (a >= 65) \{\
			System.out.println("D+");\
		\} else if (a >= 60) \{\
			System.out.println("D");\
		\} else \{\
			System.out.println("F");\
		\}\
		\
		\
//		switch (a/5) \{\
//		case 20:\
//		case 19:\
//			System.out.println("A+");\
//			break;\
//		case 18:\
//			System.out.println("A");\
//			break;\
//		case 17:\
//			System.out.println("B+");\
//			break;\
//		case 16:\
//			System.out.println("B");\
//			break;\
//		case 15:\
//			System.out.println("C+");\
//			break;\
//		case 14:\
//			System.out.println("C");\
//			break;\
//		case 13:\
//			System.out.println("D+");\
//			break;\
//		case 12:\
//			System.out.println("D");\
//			break;\
//		default:\
//			System.out.println("F");\
//			break;\
//		\}\
		\
		switch (a/10) \{\
		case 10:\
		case 9:	\
			System.out.print("A");\
			break;\
		case 8:	\
			System.out.print("B");\
			break;\
		case 7:	\
			System.out.print("C");\
			break;\
		case 6:	\
			System.out.print("D");\
			break;\
		default:\
			System.out.print("F");\
			break;\
		\}\
		if (a % 10 >= 5 && a >= 60) \{\
			System.out.println("+");\
		\}\
	\}\
	\
\}\
\
*/\
\
// 
\f1 \'b9\'ae\'c1\'a6
\f0 ) 
\f1 \'b0\'a1\'c0\'a7
\f0 , 
\f1 \'b9\'d9\'c0\'a7
\f0 , 
\f1 \'ba\'b8
\f0  
\f1 \'b0\'d4\'c0\'d3
\f0 \
\
public class SecondDay \{\
\
	public static void main(String[] args) \{\
		Scanner scan = new Scanner(System.in);\
		System.out.println("
\f1 \'b0\'a1\'c0\'a7
\f0  
\f1 \'b9\'d9\'c0\'a7
\f0  
\f1 \'ba\'b8
\f0  
\f1 \'b0\'d4\'c0\'d3\'c0\'d4\'b4\'cf\'b4\'d9
\f0 . 
\f1 \'bc\'fd\'c0\'da
\f0  
\f1 \'c0\'d4\'b7\'c2
\f0  
\f1 \'c7\'cf\'bc\'bc\'bf\'e4
\f0 (1. 
\f1 \'b0\'a1\'c0\'a7
\f0   2. 
\f1 \'b9\'d9\'c0\'a7
\f0   3. 
\f1 \'ba\'b8
\f0 ) : ");\
		int user = scan.nextInt();\
	\
		Random rand = new Random();\
		int com = rand.nextInt(3)+1;\
		\
		System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da
\f0  
\f1 \'b9\'f8\'c8\'a3
\f0  : " + user);\
		System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd
\f0  
\f1 \'b9\'f8\'c8\'a3
\f0  : " + com);\
		\
		// 
\f1 \'bb\'e7\'bf\'eb\'c0\'da\'bf\'cd
\f0  
\f1 \'c4\'c4\'c7\'bb\'c5\'cd\'c0\'c7
\f0  
\f1 \'b9\'f8\'c8\'a3\'b8\'a6
\f0  
\f1 \'ba\'f1\'b1\'b3\'c7\'d8\'bc\'ad
\f0  
\f1 \'bd\'c2\'c0\'da\'bf\'cd
\f0  
\f1 \'c6\'d0\'c0\'da\'b8\'a6
\f0  
\f1 \'c3\'e2\'b7\'c2
\f0 \
// 1. 
\f1 \'b0\'a1\'c0\'e5
\f0  
\f1 \'c0\'cf\'b9\'dd\'c0\'fb\'c0\'ce
\f0  
\f1 \'b9\'e6\'b9\'fd
\f0 \
		\
//		if (user == 1) \{\
//			if (com == 2) \{\
//				System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else if (com == 3) \{\
//				System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else \{\
//				System.out.println("
\f1 \'b9\'ab\'bd\'c2\'ba\'ce
\f0 ");\
//			\}\
//		\} else if (user == 2) \{\
//			if (com == 1) \{\
//				System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else if (com == 3) \{\
//				System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else \{\
//				System.out.println("
\f1 \'b9\'ab\'bd\'c2\'ba\'ce
\f0 ");\
//			\}\
//		\} else if (user == 3) \{\
//			if (com == 1) \{\
//				System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else if (com == 2) \{\
//				System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da
\f0  
\f1 \'bd\'c2
\f0 ");\
//			\} else \{\
//				System.out.println("
\f1 \'b9\'ab\'bd\'c2\'ba\'ce
\f0 ");\
//			\}\
//		\}\
		\
// 2. 
\f1 \'c1\'b6\'c7\'d5\'c0\'bb
\f0  
\f1 \'c0\'cc\'bf\'eb\'c7\'d1
\f0  
\f1 \'be\'cb\'b0\'ed\'b8\'ae\'c1\'f2
\f0  
\f1 \'b9\'e6\'b9\'fd
\f0 \
//		if (user == com) \{\
//			System.out.println("
\f1 \'ba\'f1\'b1\'e8
\f0 ");\
//		\} else if (user + com == 4) \{  // 
\f1 \'c1\'ef
\f0 , 
\f1 \'c7\'d5\'c0\'cc
\f0  
\f1 \'bb\'e7\'c0\'cf
\f0  
\f1 \'b0\'e6\'bf\'ec\'bf\'a1\'b4\'c2
\f0  
\f1 \'bc\'fd\'c0\'da\'b0\'a1
\f0  
\f1 \'c0\'db\'c0\'ba
\f0  
\f1 \'c2\'ca\'c0\'cc
\f0  
\f1 \'c0\'cc\'b1\'e4\'b4\'d9
\f0 .(
\f1 \'bf\'b9\'bf\'dc\'bb\'f3\'c7\'d7
\f0 )\
//			if (user < com) \{\
//				System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da\'bd\'c2
\f0 ");\
//			\} else \{\
//				System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd\'bd\'c2
\f0 ");\
//			\}\
//		\} else \{\
//			if (user < com) \{\
//				System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd\'bd\'c2
\f0 ");\
//			\} else \{\
//				System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da\'bd\'c2
\f0 ");\
//			\}\
//		\}\
//	\}\
//\}\
\
//3. 
\f1 \'c1\'b6\'c7\'d5\'c0\'bb
\f0  
\f1 \'c0\'cc\'bf\'eb\'c7\'d1
\f0  
\f1 \'be\'cb\'b0\'ed\'b8\'ae\'c1\'f2
\f0  
\f1 \'b9\'e6\'b9\'fd
\f0 \
		if (user == com) \{\
			System.out.println("
\f1 \'ba\'f1\'b1\'e8
\f0 ");\
		\} else if (com > (user+1)%3) \{ // 
\f1 \'b0\'a1\'c0\'a7\'b9\'d9\'c0\'a7\'ba\'b8\'b8\'a6
\f0  
\f1 \'bc\'fd\'c0\'da\'c0\'c7
\f0  
\f1 \'b0\'e6\'bf\'ec\'b8\'a6
\f0  
\f1 \'bc\'f6\'b8\'a6
\f0  
\f1 \'b4\'c3\'bf\'a9\'bc\'ad
\f0  
\f1 \'c8\'ae\'c0\'ce\'c7\'d1
\f0  
\f1 \'c8\'c4
\f0 , \
									   //
\f1 \'b9\'ab\'c1\'b6\'b0\'c7
\f0  
\f1 \'bf\'c0\'b8\'a5\'c2\'ca
\f0  
\f1 \'b9\'d9\'b7\'ce
\f0  
\f1 \'bf\'b7\'bc\'f6\'b0\'a1
\f0  
\f1 \'c0\'cc\'b1\'e4\'b4\'d9
\f0 .\
			System.out.println("
\f1 \'bb\'e7\'bf\'eb\'c0\'da\'bd\'c2
\f0 ");\
		\} else \{\
			System.out.println("
\f1 \'c4\'c4\'c7\'bb\'c5\'cd\'bd\'c2
\f0 ");\
		\}\
	\}\
	\
\}}