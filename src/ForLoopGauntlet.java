
public class ForLoopGauntlet {
public static void main(String[] args) {
//	1. Display all numbers from 0 to 100
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
//	2. Display all numbers from 100 to 0
	for (int j = 100; j > 0; j--) {
		System.out.println(j);
	}
//	3. Display all even numbers from 2 to 100
	for (int h = 0; h < 101; h++) {
		if(h%2==0){
		System.out.println(h);
	}
	}
//	4. Display all odd numbers from 1 to 99
	for (int k = 0; k < 101; k++) {
		if(k%2==1){
		System.out.println(k);
	}
	}
//	5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
//		Ex:	1 odd
//			2 even
//			3 odd
//			4 even
//			5 odd...etc.
	for (int l = 0; l < 501; l++) {
		if(l%2==0){
			System.out.println(l+ " even");
		}
		if(l%2==1){
			System.out.println(l+ " odd");
		}
	}
//	6. Display all multiples of 7 from 0 to 777.
	for (int m = 0; m < 784; m+=7) {
		System.out.println(m);
	}
//	7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
for (int n = 2002; n < 2017; n++) {
	System.out.println("In "+n+ ", I was "+ (n-2002));
}
//	Nested For-Loops (a for loop inside of a for loop)
//	Write a nested for loop to do the following:
//
//	1. Display this output: 
//		0 0
//		0 1
//		0 2
//		1 0
//		1 1
//		1 2
//		2 0
//		2 1
//		2 2
//
for (int o = 0; o < 3; o++) {
	for (int p = 0; p < 3; p++) {
		System.out.println(o+" "+p);
	}
}

//	2. Display the numbers 1 through 9 in a 3x3 square grid like this:
//		1 2 3
//		4 5 6
//		7 8 9
for (int q = 0; q < 3; q+=3) {
	for (int r = 0; r < 3; r++) {
		
	System.out.println();
	}
}

//	3. Display the numbers 1 through 100 in a 10x10 square grid
//	4. Display the following output:
//		*
//		**
//		***
//		****
//		*****
//		******
//
//	*BONUS*
//	1. Write a for loop that counts down from 100 to 0. However, the for loop must start with for(int i = 0;  and you may not have any code above your for loop.

}
}
