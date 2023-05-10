const textbox = document.getElementById("output");

function gainAccess(event){
    const curElement = event.target;
    var value= curElement.innerText;
    var prevValue = textbox.value;
    if(value=='='){
        const res = eval(prevValue);
        textbox.value=res;
    }else{
        console.log(prevValue);
        textbox.value = prevValue +"" +value;
    }
}
const boxes = document.querySelectorAll('.calci');
for(const elements of boxes ){
    elements.addEventListener("click",gainAccess);
}