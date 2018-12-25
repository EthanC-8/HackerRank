//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

'use strict';

const fs = require('fs');

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

// Complete the jumpingOnClouds function below.
function jumpingOnClouds(n, c, k) {
    let energy = 100;
    let pos = k % n;
    energy -= ((c[pos] == 1) ? 3 : 1);
    while (pos != 0) {
        pos = (pos + k) % n;
        energy -= ((c[pos] == 1) ? 3 : 1);
    }
    return(energy);
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nk = readLine().split(' ');

    const n = parseInt(nk[0], 10);

    const k = parseInt(nk[1], 10);

    const c = readLine().split(' ').map(cTemp => parseInt(cTemp, 10));

    let result = jumpingOnClouds(n, c, k);

    ws.write(result + "\n");

    ws.end();
}
