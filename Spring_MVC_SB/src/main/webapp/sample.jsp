<html>
	<body>
		<h1>Welcome JSP</h1>
		<hr>
		<h2>
			<%! int a = 100, b = 20; %>
			<% int c = a+b; %>
			The value of a is: <%= a %>
			<br>
			The value of b is: <%= b %>
			<br>
			Sum of a and b: <%= c %>
			<br>
		</h2>
	</body>
</html>