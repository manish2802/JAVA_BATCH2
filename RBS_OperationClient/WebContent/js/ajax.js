function f() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("target").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "home", true);
	xhttp.send();
}