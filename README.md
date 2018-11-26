# In-memory-Authentication

A Quick Spring Security in-memory authentication Application.

This application was created to test how Spring security matches entered password with the one in database. 

Turns out, UserDetailsService which was injected into SpringSecurity class and 
which was given as a parameter to AuthenticationManagerBuilder.userDetailsService(..). does password matching for us.
No need for us to manually check entered password against the password stored in DB.

To check where /login endpoint was configured, look inside com.example.secure.config.WebConfig.java

It uses H2 database. 

Since this project has devtools as dependencies, you can view what's inside the database by logging into:

http://localhost:8080/h2-console

Keep everything default but change JDBC URL to jdbc:h2:mem:testdb
