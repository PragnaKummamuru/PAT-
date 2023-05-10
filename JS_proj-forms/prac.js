var i1=document.getElementById("fname");

var ip=document.createElement("input");
ip.type="email";
ip.placeholder="enter your mail id";
ip.className="form-control";
ip.id="user mail";

var ip1=document.createElement("input");
ip1.type="password";
ip1.placeholder="enter your password";
ip1.className="form-control";
ip1.id="user pw";

i1.appendChild(ip);
i1.appendChild(ip1);

var btn = document.createElement("button");
btn.className="btn btn-primary btn-block mt-3";
btn.innerText="Submit now";
i1.appendChild(btn);


/*function createInputElement(type,className="",id="",placeholder="",labelText){
    const label=document.createElement("label");
    label.for=id
    label.innerText = labelText
    
}*/

function handleSubmit(event){
    event.preventDefault();
    var email=document.getElementById("user mail");
    console.log(email.value);
    var password=document.getElementById("user pw");
    console.log(password.value);
}
function validateForm() {
    let x = document.getElementById("user pw");
    if (x.value == "") {
      alert("Password must not be empty");
    }
  }

btn.addEventListener("click",validateForm);
btn.addEventListener("click",handleSubmit);