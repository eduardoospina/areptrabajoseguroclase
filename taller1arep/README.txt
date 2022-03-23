'Mi primer proyecto' 


keytool -genkeypair -alias ecikeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ecikeystore.p12 -validity 3605

C:\Users\clases\Pictures\taller arep\taller1arep\Keystores>keytool -genkeypair -alias ecikeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ecikeystore.p12 -validity 3605
Enter keystore password:
Re-enter new password:
What is your first and last name?
  [Unknown]:  localhost
What is the name of your organizational unit?
  [Unknown]:  AREP
What is the name of your organization?
  [Unknown]:  ECI
What is the name of your City or Locality?
  [Unknown]:  Bogota
What is the name of your State or Province?
  [Unknown]:  Bogota DC
What is the two-letter country code for this unit?
  [Unknown]:  co
Is CN=localhost, OU=AREP, O=ECI, L=Bogota, ST=Bogota DC, C=co correct?
  [no]:  yes


mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.SparkWebApp"
