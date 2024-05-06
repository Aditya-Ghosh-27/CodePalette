// A function along with its lexical scope bundled together forms a closure

function x(){
    var a = 7;
    // return function y(){
    //     console.log(a);   Here a means the reference of the variable a which is 7
    // }
    
    // The above code snippet and the below one means the same

    function y(){
        console.log(a);
    }
    a = 1000;
    return y;
}
var z = x();
console.log(z);
// .........
z();  // y remembers its lexical Scope, like from where it came from 
// The output is 1000 because the manipulation is taking place at the reference of a