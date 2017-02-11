For me it is working for those.

vegan@vegan:~$ $JAVA_HOME/bin/javac -sourcepath src Downloads/audit-reporter-blank/src/com/caneraydinbey/utils/auditreporter/Runner.java -d bin

vegan@vegan:~$ $JAVA_HOME/bin/java -cp bin com.caneraydinbey.utils.auditreporter.Runner Downloads/audit-reporter-blank/resources/users.csv Downloads/audit-reporter-blank/resources/files.csv -c

jpublic,audit.xlsx,1638232
jpublic,movie.avi,734003200
jpublic,marketing.txt,150680
atester,pic.jpg,5372274
atester,holiday.docx,570110


vegan@vegan:~$ $JAVA_HOME/bin/java -cp bin com.caneraydinbey.utils.auditreporter.Runner Downloads/audit-reporter-blank/resources/users.csv Downloads/audit-reporter-blank/resources/files.csv -c --top 4
movie.avi,jpublic,734003200
pic.jpg,atester,5372274
audit.xlsx,jpublic,1638232
holiday.docx,atester,570110


vegan@vegan:~$ $JAVA_HOME/bin/java -cp bin com.caneraydinbey.utils.auditreporter.Runner Downloads/audit-reporter-blank/resources/users.csv Downloads/audit-reporter-blank/resources/files.csv --top 4
Top #4 Report
============
* movie.avi ==> user jpublic,734003200 bytes
* pic.jpg ==> user atester,5372274 bytes
* audit.xlsx ==> user jpublic,1638232 bytes
* holiday.docx ==> user atester,570110 bytes


When top is bigger than files size, it only writes of files size.

vegan@vegan:~$ $JAVA_HOME/bin/java -cp bin com.caneraydinbey.utils.auditreporter.Runner Downloads/audit-reporter-blank/resources/users.csv Downloads/audit-reporter-blank/resources/files.csv --top 7
Top #5 Report
============
* movie.avi ==> user jpublic,734003200 bytes
* pic.jpg ==> user atester,5372274 bytes
* audit.xlsx ==> user jpublic,1638232 bytes
* holiday.docx ==> user atester,570110 bytes
* marketing.txt ==> user jpublic,150680 bytes


vegan@vegan:~$ $JAVA_HOME/bin/java -cp bin com.caneraydinbey.utils.auditreporter.Runner Downloads/audit-reporter-blank/resources/users.csv Downloads/audit-reporter-blank/resources/files.csv --top 7 -c
movie.avi,jpublic,734003200
pic.jpg,atester,5372274
audit.xlsx,jpublic,1638232
holiday.docx,atester,570110
marketing.txt,jpublic,150680

When gets --top, it only writes largest files.
When gets -c, it only writes as csv.
