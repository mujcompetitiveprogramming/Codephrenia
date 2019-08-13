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
java Solution < input/input07.txt > java_output/output07.txt
echo Gen: java 07
java Solution < input/input08.txt > java_output/output08.txt
echo Gen: java 08
java Solution < input/input09.txt > java_output/output09.txt
echo Gen: java 09
java Solution < input/input10.txt > java_output/output10.txt
echo Gen: java 10

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
./a.out < input/input07.txt > c_output/output07.txt
echo Gen: c 07
./a.out < input/input08.txt > c_output/output08.txt
echo Gen: c 08
./a.out < input/input09.txt > c_output/output09.txt
echo Gen: c 09
./a.out < input/input10.txt > c_output/output10.txt
echo Gen: c 10

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
diff c_output/output07.txt java_output/output07.txt
echo test_complete: 07
diff c_output/output08.txt java_output/output08.txt
echo test_complete: 08
diff c_output/output09.txt java_output/output09.txt
echo test_complete: 09
diff c_output/output10.txt java_output/output10.txt
echo test_complete: 10

