# mental-benchmark
An android app that helps to test  mental abilities through a range of activities , and puzzles   

. In order to compile the app ;
-Navigate to the root directory of this repository
-Enter the following commands ;

gradlew.bat assembleRelease
-Now navigate to the following relative folder -
app/build/outputs/apk/release ;
Enter the following command
-zipalign -p -v 4 app-release-unsigned.apk verse.apk
-apksigner sign --ks-key-alias stated --ks-pass pass:moderneinstein --ks ../noted.jks --out verse4.apk verse.apk -The compiled app is now called verse4.apk
