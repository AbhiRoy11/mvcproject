
<!DOCTYPE html>
<html>
<head>
<script src='https://www.google.com/recaptcha/api.js'></script>
<title>Student Information</title>
</head>
<body>

	<form action="storeData" method="post">
	
		Name: <input type="text" name="name"> <br> 
		Course: <input type="text" name="course"> <br>
		<div class="g-recaptcha"
			data-sitekey="6Le7zG0UAAAAAF-BSsr-knFvQFPPuqYKS5KIdqo2"></div>
		<br> <input type="submit" value="Save Data">
	</form>
</body>
</html>