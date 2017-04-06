## Motivation
In our work, we open want to delete some liferay portal bundle folder, but after few days using, the portal will get larger and larger and many cache files generated, so deleting such folder will be very slow on windows. And this is a simple tool to help windows user to delete large folder fast. The mechanism is using java to call windows command `rmdir /s /q folderName`

## For developer
Use mvn clean package to get the jar and then use Jar2Exe to convert the jar file to exe file.