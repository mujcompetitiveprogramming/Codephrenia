javac Solution.java
echo Compile: Solution.java
java Solution < input/input00.txt > java_output/output00.txt
echo Gen: java 00
java Solution < input/input01.txt > java_output/output01.txt
echo Gen: java 01
java Solution < input/input02.txt > java_output/output02.txt
echo Gen: java 02
java Solution < input/input03.txt > java_output/output03.txt
echo Gen: java 03
java Solution < input/input04.txt > java_output/output04.txt
echo Gen: java 04
java Solution < input/input05.txt > java_output/output05.txt
echo Gen: java 05
java Solution < input/input06.txt > java_output/output06.txt
echo Gen: java 06

gcc solution.c
echo Compile solution.c
./a.out < input/input00.txt > c_output/output00.txt
echo Gen: c 00
./a.out < input/input01.txt > c_output/output01.txt
echo Gen: c 01
./a.out < input/input02.txt > c_output/output02.txt
echo Gen: c 02
./a.out < input/input03.txt > c_output/output03.txt
echo Gen: c 03
./a.out < input/input04.txt > c_output/output04.txt
echo Gen: c 04
./a.out < input/input05.txt > c_output/output05.txt
echo Gen: c 05
./a.out < input/input06.txt > c_output/output06.txt
echo Gen: c 06

diff c_output/output00.txt java_output/output00.txt
echo test_complete: 00
diff c_output/output01.txt java_output/output01.txt
echo test_complete: 01
diff c_output/output02.txt java_output/output02.txt
echo test_complete: 02
diff c_output/output03.txt java_output/output03.txt
echo test_complete: 03
diff c_output/output04.txt java_output/output04.txt
echo test_complete: 04
diff c_output/output05.txt java_output/output05.txt
echo test_complete: 05
diff c_output/output06.txt java_output/output06.txt
echo test_complete: 06

