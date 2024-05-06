const user = {  // everything inside the curly brace is our current context
    // this is our current context
    username: "Aditya",
    price: 6000,
    welcomeMessage: function(){
        console.log(`${this.username}, welcome to website`);
        console.log(this);
    }
}

user.welcomeMessage();
user.username = "Sam";
// // Here we are changing the context
user.welcomeMessage();

console.log(this); // Here our current context is empty,

// Important: In our browser, the global context is the window object, thus if we do console.log(this) in the console of our browser, we get to see the global context, i.e the Window object's properties.
//  The window object is the global object for JavaScript in a browser environment, and it contains all the properties and methods available to the current browser window.

// Whereas in Nodejs, the global context is an empty object


function foo(){
    const username = "aditya";
    console.log(this); // will log a Big oject i.e the global context of the function
    console.log(this.username); // gives undefined
    // This is because, our context works only inside objects and not inside functions
}
foo();

const adi = function() {
    let age = 20;
    console.log(this.age); // gives undefined
}
adi();


// Arrow functions
const arrow = () =>{
    let username="Adi"
    console.log(this); // gives {}
    console.log(this.username); // gives undefined
}
arrow();
// Here, it will log an empty object in the console instead of the global object that we were previosuly getting inside the functional expressions and normal declarative function

// Core arrow function discussions
() => {}

const addTwo = (num1, num2) => {
    return num1+ num2
}

// Implicit return -> one line statement doesn't require return
const addTwoo = (num1, num2) =>  num1+ num2

// parenthesis does not require the return keyword as well(Used in REACT)
const addTwooo = (num1, num2) =>  (num1+ num2)

console.log(addTwo(3, 4))

// How to return objects with arrow functions?
// The object must be wrapped within a pair of parenthesis
const obj = () => ({
    age: 20
});

console.log(obj());

const myArray = [2, 3, 4, 5];
// arrow functions as callback function
myArray.forEach(() => {

})