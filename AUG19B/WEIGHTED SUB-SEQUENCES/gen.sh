javac Builder.java
echo Compile Builder

java Builder > input/input06.txt
java Solution < input/input06.txt > output/output06.txt
echo Gen test06
java Builder > input/input07.txt
java Solution < input/input07.txt > output/output07.txt
echo Gen test07
java Builder > input/input08.txt
java Solution < input/input08.txt > output/output08.txt
echo Gen test08
java Builder > input/input09.txt
java Solution < input/input09.txt > output/output09.txt
echo Gen test09
