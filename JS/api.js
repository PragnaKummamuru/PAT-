//setTimeout is a callback function i.e., after certain time js will call that fn automatically
/*console.log('1st task');
setTimeout(function(){
    console.log("2nd");
} , 5000)
console.log('3rd task');
setTimeout(function(){
    console.log("4th");
} , 5000)
console.log('5th task');
*/

const prm = new Promise(function(resolve,reject)){
    console.log("fetching data from database");
    setTimeout (() =>{
        resolve("got data from database");
    } , 3000)
}
  // pending , fullfilled , reject - 3 states of promise

  prm.then() 
  prm.catch()