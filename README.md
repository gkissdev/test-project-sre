

Task 1
  a.) Create an IAM role for managing ec2 instances (read the following task and choose the roles appropriately)<br />
  b.) Create two EC2 instance (amazon linux)
  c.) Use one VM as the production environment and one as a deployment VM where the application is (jar, application.properties, application-aws.properties) first and deployment is triggered from.
  d.) Make the port found in the application-aws.properties /test url available to call from outside.
  e.) Bonus point if the application is in an s3 bucket (jar, application.properties, application-aws.properties)


Task 2
  a.) 2nd version of the application (jar, application.properties, application-aws.properties) 
  b.) set up postgres (VM or RDS)
  c.) Add a user postgres (superuser, username: application-username, password: application-password)
  d.) Update the application.properties spring.datasource.url=URL_HERE
  e.) Deploy the 2nd version of the application
  f.) Test the second version with the /test-db endpoint


Task 3
  a.) Have 2 production servers set up, take into account the changes to the deployment and load balance the 2 applications.



