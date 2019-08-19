g++ generator.cpp -o gen.out
echo Compile Builder
gcc soln.c
echo Compile Solution

./gen.out 5 > input/input00.txt
./a.out < input/input00.txt > output/output00.txt
echo gen test00
./gen.out 7 > input/input01.txt
./a.out < input/input01.txt > output/output01.txt
echo gen test01

./gen.out 20 > input/input02.txt
./a.out < input/input02.txt > output/output02.txt
echo gen test02

./gen.out 45 > input/input03.txt
./a.out < input/input03.txt > output/output03.txt
echo gen test03

./gen.out 69 > input/input04.txt
./a.out < input/input04.txt > output/output04.txt
echo gen test04

./gen.out 666 > input/input05.txt
./a.out < input/input05.txt > output/output05.txt
echo gen test05

./gen.out 343 > input/input06.txt
./a.out < input/input06.txt > output/output06.txt
echo gen test06