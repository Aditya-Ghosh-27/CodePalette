"use strict";
// Prototypes

// Summary: Each and every function in JS automatically has a property called prototype and that includes of course constructor functions

const Person = function(firstName, birthYear){
    this.firstName = firstName;
    this.birthYear = birthYear;
}
const adi = new Person("Aditya", 2003);
console.log(adi);
console.log(Person.prototype);

Person.prototype.calcAge = function(){
    console.log(2050 - this.birthYear);
};

console.log(adi.calcAge());