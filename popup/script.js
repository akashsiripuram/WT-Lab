function showAlert() {
    alert("This is an alert box!");
}

// Confirm box
function showConfirm() {
    let userResponse = confirm("Do you agree?");
    if (userResponse) {
        document.getElementById("result").innerText = "User agreed!";
    } else {
        document.getElementById("result").innerText = "User disagreed!";
    }
}

// Prompt box
function showPrompt() {
    let userName = prompt("Please enter your name:", "Guest");
    if (userName != null && userName.trim() !== "") {
        document.getElementById("result").innerText = "Hello, " + userName + "!";
    } else {
        document.getElementById("result").innerText = "No name entered.";
    }
}