

Task 1<br />
  a.) Create an IAM role for managing ec2 instances (read the following task and choose the roles appropriately)<br />
  b.) Create two EC2 instance (amazon linux)<br />
  c.) Use one VM as the production environment and one as a deployment VM where the application is (jar, application.properties, application-aws.properties) first and deployment is triggered from.<br />
  d.) Make the port found in the application-aws.properties /test url available to call from outside.<br />
  e.) Bonus point if the application is in an s3 bucket (jar, application.properties, application-aws.properties)<br />


Task 2<br />
  a.) 2nd version of the application (jar, application.properties, application-aws.properties) <br />
  b.) set up postgres (VM or RDS)<br />
  c.) Add a user postgres (superuser, username: application-username, password: application-password)<br />
  d.) Update the application.properties spring.datasource.url=URL_HERE<br />
  e.) Deploy the 2nd version of the application<br />
  f.) Test the second version with the /test-db endpoint<br />


Task 3<br />
  a.) Have 2 production servers set up, take into account the changes to the deployment and load balance the 2 applications.<br />



