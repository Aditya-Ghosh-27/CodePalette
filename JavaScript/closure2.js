// Closure er pati banglay mane holo sobchey bhetor kaar (nested most)function taar kache, oor sob parent function er variable er access thakbe, byass

function z(){
    var b = 900;
    function x(){
        var a = 7;
        // If I would have returned y, still it would have returned the same output due to lexical scoping
        function y(){
            console.log(a, b);
        }
        y();
    }
    x();
}
z();

// uses of closure
// 1. Module design pattern
// 2. Currying
// 3. Function like once
// 4. memoize 
// 5. maintaining state in async world 
// 6. setTimeout 
// 7. Iterators
// 8. and many more...