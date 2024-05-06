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