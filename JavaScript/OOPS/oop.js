// Object literal
const user = {
    username: "adi",
    loginCount: 9,
    signedIn: true,
    getUserDetails: function(){
        // console.log("Got user details from database");
        // console.log(`Username: ${this.username}`);
        console.log(this);
    }
}

// console.log(user.username);
// console.log(user["username"]);


// const promiseOne = new Promise();
const date = new Date();

// the above new is keyword is actually a constructor function. new keyword helps us to create new context

// I already have a variable named username
function User(username, loginCount, isLoggedIn){
    // username: username
    // Js will get confused as to understand which username is which one's
    this.username = username;
    this.loginCount = loginCount;
    this.isLoggedIn = isLoggedIn;
    // console.log(`${this.username}`);
    // console.log(this);

    return this; // The output is same as console.log(this) -> returning the current context
}

const userOne = User("Aditya", 20, true);
const userTwo = User("Tanisha", 20, false);
console.log(userOne); // Here the output is showing the execution context(Big object + properties) of tanisha which means userOne's context is getting overwritten by tanisha's context

// Object [global] {
//   global: [Circular *1],
//   clearImmediate: [Function: clearImmediate],
//   setImmediate: [Function: setImmediate] {
//     [Symbol(nodejs.util.promisify.custom)]: [Getter]
//   },
//   clearInterval: [Function: clearInterval],
//   clearTimeout: [Function: clearTimeout],
//   setInterval: [Function: setInterval],
//   setTimeout: [Function: setTimeout] {
//     [Symbol(nodejs.util.promisify.custom)]: [Getter]
//   },
//   queueMicrotask: [Function: queueMicrotask],
//   structuredClone: [Function: structuredClone],
//   atob: [Getter/Setter],
//   btoa: [Getter/Setter],
//   performance: [Getter/Setter],
//   navigator: [Getter],
//   fetch: [Function: fetch],
//   crypto: [Getter],
//   username: 'Tanisha',
//   loginCount: 20,
//   isLoggedIn: false
// }

const aditya = new User("aditya", 20, true); // creates a new instance and returns the instance of aditya
// User { username: 'aditya', loginCount: 20, isLoggedIn: true }
const tanisha = new User("tanisha", 20, false); // creates a new instance and returns the context of tanisha
// User { username: 'tanisha', loginCount: 20, isLoggedIn: false }
console.log(aditya);
console.log(tanisha);

// Whenever we declare a variable with new keyword, a new empty object is created called instance
// The constructor function is invoked due to the new keyword
// The arguements get injected to our variables due to this keyword