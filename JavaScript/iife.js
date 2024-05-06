// IIFE - Immidiately invoked function expression

// IIFE prevents the global scope from polluting the IIFEd functional scope
function immidiateCall(){
    console.log("Database connected");
}
immidiateCall();

// Global scope er pollution er jonno problem hoy onek baar toh oi global scope er jaa declaration ba variables ache, taar pollution k hatanor jonno amra IIFE use kori

// Now convert the above function into an IIFE
// Wrapping the function definition inside a parenthesis will create a block
(function immidiateCall(){
    console.log("Database connected");
})();

// IIFE gets invoked but it doesn't know where to stop it's context at. So to stop its context, we need to add a semi-colon at its end to stop its execution context

// ()()
// The 1st parenthesis will contain the function definition
// The 2nd parenthesis is for the execution call like immidiateCall()

(function cappuccino(){
    console.log("Aditya Ghosh");
})()


// How to write IIFE using arrow function syntax ??

(() => {
    console.log(`DB CONNECTED 2`);
})();

// Treat it just like a normal function
((age) => {
    console.log("My age is "+age);
})(20);