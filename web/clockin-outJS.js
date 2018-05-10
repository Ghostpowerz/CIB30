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

function downloadCSV(csv, fileName){
	var csvFile;
	var downloadLink;
	
	csvFile = new Blob([csv], {type:"text/csv"});
	downloadLink = document.createElement("a");
	downloadLink.download = fileName;
	downloadLink.href = window.URL.createObjectURL(csvFile);
	downloadLink.style.display = "none";
	document.body.appendChild(downloadLink);
	
	downloadLink.click();
}

function exportTableToCSV(fileName){
	var csv = [];
	var rows = document.querySelectorAll("table tr");
	for (var i = 0; i< rows.length; i++){
		var row = [], cols = rows[i].querySelectorAll("td, th");
		for(var j = 0; j< cols.length; j++)
			row.push(cols[j].innerText);
		csv.push(row.join(","));
	}
	downloadCSV(csv.join("\n"), fileName);
}

function downloadXML(xml, fileName){
	var xmlFile;
	var downloadLink;
	
	xmlFile = new Blob([xml], {type:"text/xml"});
	downloadLink = document.createElement("a");
	downloadLink.download = fileName;
	downloadLink.href = window.URL.createObjectURL(xmlFile);
	downloadLink.style.display = "none";
	document.body.appendChild(downloadLink);
	
	downloadLink.click();
}

function exportTableToXML(fileName){
	var xml = [];
	var rows = document.querySelectorAll("table tr");
	for (var i = 0; i< rows.length; i++){
		var row = [], cols = rows[i].querySelectorAll("td, th");
		for(var j = 0; j< cols.length; j++)
			row.push(cols[j].innerText);
		xml.push(row.join(","));
	}
	downloadCSV(xml.join("\n"), fileName);
}

function checkReport(){
	var selection = document.getElementById("reportSelection");
	var selectionResult = selection.options[selection.selectedIndex].text;
	if(selectionResult == "Report 1"){
		window.open("/reports/showReport1.php","_self");
	}else if(selectionResult == "Report 2"){
		window.open("/reports/showReport2.php","_self");
	}else if(selectionResult == "Report 3"){
		window.open("/reports/showReport3.php","_self");
	}else if(selectionResult == "Report 4"){
		window.open("/reports/showReport4.php","_self");
	}else if(selectionResult == "Report 5"){
		window.open("/reports/showReport5.php","_self");
	}else if(selectionResult == "Report 6"){
		window.open("/reports/showReport6.php","_self");
	}
}
	

