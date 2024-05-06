// Lexical scoping in JavaScript is all about where variables are defined and how other parts of your code can access them. It's based on the location in your code where a variable is created, not where it's used. This can be a bit different from how some other languages work.

const firstName = "Aditya";

function sayHi(){
    const age = 20;
    console.log("My name is "+firstName+" and my age is "+age);
}

sayHi();

// the variable name is defined globally (outside any function). The function sayHi has its own local variable, age. Even though sayHi is called later in the code, it can still access the globally defined name because it's within the same lexical scope (the entire code). But sayHi cannot access anything outside its own scope, so other code can't use age.

function outerFunc(){
    const outerVariable = "outer";
    function innerFunc(){
        const innerVariable = "inner";
        console.log(outerVariable); // Can access outerVariable
        console.log(innerVariable);
    }
    innerFunc();
}

outerFunc();

// Here, outerFunction creates a variable outerVar. Then, it defines another function innerFunction inside of it. Even though innerFunction is defined later, it can access outerVar because outerFunction is its parent scope. This shows how lexical scoping works across nested functions.


// Some trickier examples 

for(let i = 0; i < 3; i++){
    setTimeout(function(){
        console.log(i);
    }, 1000);
}

function createLogger(){
    const message = "Hello";
    function logMessage(){
        console.log(message);
    }
    return logMessage;
}

const logger = createLogger();
logger();