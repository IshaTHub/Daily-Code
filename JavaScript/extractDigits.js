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
                            
//optimal approach to count digit

function countDigit(N){
  if(N == 0){
    return 1
  }
  let count = Math.floor(log10(N) + 1);
  return count;
}
