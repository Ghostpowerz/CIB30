function checkForm(e){
	var workCode = document.getElementById("workCode").value;
		//check form OK to submit
		if(workCode!=511){
			//if OK enable submit button
			document.getElementById("workDescription").disabled = true;
		}else{
			//if not disable submit
			document.getElementById("workDescription").disabled = false;
		}
	}
	
//get firstname input and attach an eventlister to the change event
var el = document.getElementById("workCode");
el.addEventListener('mouseover', checkForm, false);

function helpFunction(){
var helptext = document.getElementById('help');
	if(helptext.style.display === "none"){
		helptext.style.display = "block";
	}else{
		helptext.style.display = 'none';
	}
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
