"use strict";

// We can use constructor functions to build an object using a function.
// The only difference between a regular function and a constructor function is that we call a constructor function with a new operator


// Creating a constructor function
const Person = function(firstName, birthYear){
    console.log(this);
}
new Person("Aditya", 2003);

// Output: Person {}  -> empty object of type Person

const Personn = function(firstName, birthYear){
    // Instance properties
    this.firstName = firstName;
    this.birthYear = birthYear;

    // Never do this
    // this.calcAge = function() {
    //     console.log(this.birthYear);
    // }
}

const aditya = new Personn("Aditya", 2003);
console.log(aditya);  // Personn { firstName: 'Aditya', birthYear: 2003 }

// 1. New empty object is created 
// 2. Afterwards, the function is called and the this keyword will be set to this newly created object (this = {})

// So basically, in the execution context of the person function, the this keyword will point to this new object here(created in step 1)

// 3. Newly created object {} is linked to the prototype
// 4. function automatically returns {} (that empty object from the beginning)

const narula = new Personn("Narula", 2004);
console.log(narula);
// Constructor function has been used in Javascript since its beginning to simulate classes

const abc = "ABC";
console.log(aditya instanceof Personn); // true
console.log(abc instanceof Personn); // false