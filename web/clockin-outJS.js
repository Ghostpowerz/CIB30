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

// Get the modal
var modal = document.getElementById('codesModal');

// Get the button that opens the modal
var btn = document.getElementById("helpBtn");

// Get the <span> element that closes the modal
var closeBtn = document.getElementsByClassName("closeBtn")[0];

btn.addEventListener('click', openModal);

closeBtn.addEventListener('click', closeModal);

function openModal(){
	modal.style.display = 'block';
}

function closeModal(){
	modal.style.display = 'none';
}

