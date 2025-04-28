function countDigits(n) {
    let count = 0;           

    while (n > 0) {          
        n = Math.floor(n / 10);  
        count++;            
    }

    return count;           
}

//converting to string and returning the length
function countDigits(n) {
    let numStr = n.toString();    // Step 1: Convert number to string
    return numStr.length;         // Step 2: Return length of the string
}

// Math.floor() is a built-in JavaScript method.
// It rounds DOWN a decimal number to the nearest whole number (integer).

console.log(Math.floor(4.9));  // Output: 4
console.log(Math.floor(7.2));  // Output: 7
console.log(Math.floor(10.99)); // Output: 10


// What does Math.abs() do?
// Math.abs(x) returns the absolute value of x.

// Absolute value means — ignoring minus signs (always positive).

console.log(Math.abs(5));   // Output: 5
console.log(Math.abs(-5));  // Output: 5
console.log(Math.abs(0));   // Output: 0


function countDigits(n) {
    n = Math.abs(n);             // make n positive first
    if (n === 0) return 1;        // special case: 0 has 1 digit

    let count = 0;
    while (n > 0) {
        n = Math.floor(n / 10);   // remove last digit
        count++;
    }
    return count;
}

console.log(countDigits(-789));  // Output: 3
