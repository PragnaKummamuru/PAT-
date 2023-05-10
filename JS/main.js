//var abc="random string"
//console.log(abc);

/*var student={
    name:"Pragna",
    age:21,
    roll:'20951a04c1',
    address:{
        city:'Tpt',
        state:'AP',
        pin:50094
    }
}

                            //for...of	for...in
//The for...of loop is used to iterate through the values of an iterable.	
//The for...in loop is used to iterate through the keys of an object.
for(const key in student){
    if(key=='address'){
        for(const value in student[key]){

        }
    }else{

        console.log(key,student[key])
    }
}
*/

//TO CHECCK EVEN , ODD NUMS IN AN ARRAY
 /*var arr=[1,2,3,4,5,6,7]
 var res=[]
 for(const i in arr){
    if(i%2==0){
        res.push(i)
    }
 }
 console.log(res);
 */

 /*to perform abive using built in "filter method"
 var arr=[1,2,3,4,5,6,7]
 var res=arr.filter(function(value){
    return value%2==0
 })
 console.log(res)
 */

//3 imp methods used in arrays of js : arr.map() , arr.filter() , arr.reduce()
//map takes one arguement i.e, entire array and perfrom some operation on them by iterating.
//filter - it filter outs the values based on a condition
//reduce - it is used to iterate array and combine that entire array into one entity (ex:sum of all ele in arr)

//map example
var arr=[1,2,3,4,5,6,7]
arr.map(function(element){
    console.log("printing the element",element);
})

//reduce example
var sum= arr.reduce(function(acc,ele){
    return acc+ele
})
console.log("sum of elements is",sum)