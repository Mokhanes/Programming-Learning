//ARRAY
let arr=[5,8,10,7,9,11];
console.log(arr);

arr.splice(3,3,17,19,111);
console.log(arr);

arr.splice(0,0,100);
console.log(arr);

let len=arr.length;
arr.splice(len-1,0,200);
console.log(arr);

arr.splice(len+1,0,1000);
console.log(arr);

let len1=arr.length;
arr.splice(len1/2,0,0);
console.log(arr);


//IF ELSE

let a=5;
if(a<10){
    console.log("Yes");
}
else if(a==0){
    console.log("Zero");
}
else{
    console.log("No");
}