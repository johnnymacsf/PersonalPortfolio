%Matlabcode1 takes an image of everyone's favorite mouse, reshapes it to a
%one dimensional matrix, that being an array, and writes it to a text file
img = imread('mickey.png');
img_id = reshape(img, 1, []);
dlmwrite('input.txt', img_id, 'delimiter', ' ');
exit;
