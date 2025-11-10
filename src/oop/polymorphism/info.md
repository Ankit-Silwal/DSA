Polymorphism as a word means many way to represent single entity or item!

Types of polymorphism:
1.Compile time /Static polymorphism
Achieved via method called overloading
Same name but types ,arguments ,return types ,ordering.. can be different
Ex:Multiple constructor
//Mehtod overloading
A a new A();
A a2=new A(3,4);

2.Run time /dynamic polymorphism:
Achieved by method overriding .
for Parent obj=new Child();
here which method will be called depends on this is known as upcasting 
this is how overriding works
to prevent overriding we can prevent overriding cause we cannt override the methods whihc is final