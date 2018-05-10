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
	alert("CLOCK IN/OUT SYSTEM\n\n Employee Codes: \n\n - Lunch: 999999; \n - Annual Leave: 999998; \n - Sickness: 999997; \n - Compassionete Leave: 999996. \n - Other: 999995 \n-------------------------\n TASK CODES: \n Task1: 100810 \n Task2: 100374 \n Task3: 990873 \n Task4: 200713 \n Task5: 201937 \n -------------------------\n ACTIVITY CODES: \n Activity 1: A0N001 \n Activity 2: A0N002 \n Activity 3: A0N003 \n Activity 4: A0N004 \n Activity 5: A0N005 \n  ")
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

