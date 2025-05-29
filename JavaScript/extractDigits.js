function extractDigits(N){
let ans = [];
while(N>0){
let lastDigit = N%10;
ans.push(lastDigit);
N = Math.floor(N/10); 
}
return ans.reverse();
}

let N = 329823;
console.log("N: " + N);
let digits = extractDigits(N);
console.log("Extracted Digits: " + digits.join(" "));
                            
