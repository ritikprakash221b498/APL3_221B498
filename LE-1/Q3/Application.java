/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Application {
 public static void main (String args[]){
 Mother m= new Mother ( );
 m.show( ); // show of Mother is called
 Child ch=new Child ( ); 
 ch. show ( ); // show ( ) inherited in Child from Mother is called
 Mother m1=new Child ( ); // used for polymorphism
 m1.show();
 }
}
