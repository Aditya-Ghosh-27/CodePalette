// A function along with its lexical scope is closure

function x(){
    var a = 7;
    function y(){
        console.log(a);
    }
    y();
}
x();