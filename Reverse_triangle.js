let rows=5;
let pattern ="";
for(let i = 1;i<=rows;i++){
    for(let j =1;j<=rows-i;j++){
        pattern += j;
    }
   pattern += " \n";
}
console.log(pattern);
