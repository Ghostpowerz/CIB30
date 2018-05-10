function checkForm(e){
	var workCode = document.getElementById("workCode").value;
		if(workCode!=511){
			document.getElementById("workDescription").disabled = true;
		}else{
			document.getElementById("workDescription").disabled = false;
		}
	}
var el = document.getElementById("workCode");
if(el){
	el.addEventListener('mouseover', checkForm, false);	
}

function timeSheetApproved(){
	alert("Timesheet successfuly approved.")
}

function timeSheetDenied(){
	alert("Timesheet successfuly denied.")
}

function submitAssignment(){
	alert("Successfully assigned.")
}

function clockInOut(){
	alert("Clocking accepted.")
}

function helpFunction(){
	alert("Codes: \n\n - Lunch: 999999; \n - Annual Leave: 999998; \n - Sickness: 999997; \n - Compassionete Leave: 999996.")
}

function logInFunction(){
	var username = document.getElementById("usernameField").value;
	var password = document.getElementById("passwordField").value;
	if(username == "Emp" && password == 1234){
		window.open("clockin-out.html","_self");
	}else if(username == "Admin" && password == 1234){
		window.open("adminClockin-out.html","_self");
	}else{
		alert("Wrong username or password. Please try again.");
	}
}

var input = document.getElementById("usernameField");
input.addEventListener("keyup",function(event) {
	event.preventDefault();
		if(event.keyCode === 13){
	document.getElementById("logInBtn").click();
	}
});

var input = document.getElementById("passwordField");
input.addEventListener("keyup",function(event) {
	event.preventDefault();
		if(event.keyCode === 13){
	document.getElementById("logInBtn").click();
	}
});



