/*document.getElementsByClassName()  //returns array of elements with that classname
document.getElementsByTagName()  // returns array of elements with that certain tag  name
document.getElementsByName()*/


var firstName = document.getElementById("fname"); // retruns first element (only 1) with that id
console.log(firstName); // u can access the element
firstName.type = "password" // u can manipulate
firstName.style="background-color:blue"; 
alert("Success");
function myfuncion(event){
    console.log(event);
    event.preventDefault();
    var currentele = event.target;
    console.log(currentele);
    currentele.innerText = "nice try..don't paste!!";

}
var area= document.getElementById("demo");
area.addEventListener("paste",myfuncion);