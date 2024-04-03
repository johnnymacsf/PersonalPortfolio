import subprocess
#python wrapper script to run the 4 different programs 

#matlab executable establishes a path to the actual matlab application
matlab_executable = '/Applications/MATLAB_R2023b.app/bin/matlab'

print("Running Matlab code 1")
#run the subprocess for matlab code 1 to get the first textfile input.txt
matlab_process = subprocess.run([matlab_executable, "-batch", "run('matlabcode1.m');pause(1);"],capture_output=True)

#run the c program to get the black and white image of the original (uses the threshold value checker in the code)
print("Running C program")
with open('input.txt','r') as file:
    line = file.readline()
    input_array = [int(value) for value in line.split()]
    input_array = [str(value) for value in input_array]

#subproces runs the c compiler and executable program with the input_array, which is the converted input.txt after the tresholding
subprocess.run(["gcc","cprog.c", "-o", "cprog"])
process = subprocess.run(["./cprog"] + input_array, capture_output=True, text = True)

#output it to a c_output.txt 
output_variable = process.stdout.strip()
with open('c_output.txt', 'w') as f:
    f.write(output_variable)

#run the haskell program to flip the colors of the original image by running ghc and the haskell program
print("Running Haskell program")
subprocess.run(['ghc', 'hprog.hs'])
process = subprocess.run(['./hprog'] + [str(x) for x in input_array],text=True, capture_output=True)
result = process.stdout.strip()

#take the output of the haskell program and put it in a text file to use for later with the other two text files
with open('haskell_output.txt', 'w') as f:
    f.write(result)

#run the prolog program to flip the image upside down by reversing the list
print("Running Prolog program")
prolog_input = "[" + ",".join(map(str,input_array))+"]."
result = subprocess.run(['swipl','-q','-g','main','-t','halt','prologProgram.pl'],input=prolog_input,capture_output=True,text=True)
output_results = result.stdout.strip()
#change the output of the prolog program so that it is better and easier to read and input into a text file (remove the [] and , so it is no longer in list form)
prolog_input_list = output_results.strip('[]').split(',')
prolog_results = ' '.join(map(str, prolog_input_list))

#write the output to the prolog_output.txt
with open('prolog_output.txt', 'w') as f:
    f.write(prolog_results)


#for the second matlab code, we take the three respective text files from C, haskell, and prolog and run the matlab code with it to display each respective, modified image of mickey mouse
print("Running Matlab code 2")

with open('matlabcode2.m','r') as file:
    matlabcode = file.read()

matlab_process = subprocess.run([matlab_executable, "-batch", "run('matlabcode2.m');pause(1);"],capture_output=True)