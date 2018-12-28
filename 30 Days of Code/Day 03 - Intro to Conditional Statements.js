'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const N = parseInt(readLine(), 10);
    let ans = "";

    if (N % 2 == 1) {
        ans = "Weird";
    } else {
        if (N >= 6 && N <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
    }
    console.log(ans);
}
