%matlab code 1 takes a text file input of the values of the pixels
%it then turns it to an integer array, resizes it, and writes the 
%image to a png file with a respective title
output_var = fileread('input.txt');
original_array = uint8(str2num(output_var));
resized_original = reshape(original_array, 256, 256);
imwrite(resized_original, 'original_mickey.png');
imshow(resized_original);
title('Original image');

pause(5);

output_variable = fileread('c_output.txt');
output_array = uint8(str2num(output_variable));
resized_matrix = reshape(output_array, 256, 256);
imwrite(resized_matrix, 'matlab_coutput.png');
imshow(resized_matrix);
title('Black and white image using C program');

pause(5);

output_variable2 = fileread('haskell_output.txt');
output_array2 = uint8(str2num(output_variable2));
resized_matrix2 = reshape(output_array2, 256, 256);
imwrite(resized_matrix2, 'matlab_haskelloutput.png');
imshow(resized_matrix2);
title('Color flipped image using Haskell program');

pause(5);

output_variable3 = fileread('prolog_output.txt');
output_array3 = uint8(str2num(output_variable3));
resized_matrix3 = reshape(output_array3, 256, 256);
imwrite(resized_matrix3, 'matlab_prologoutput.png');
imshow(resized_matrix3);
title('Upside down photo using prolog program');

pause(5);
exit;