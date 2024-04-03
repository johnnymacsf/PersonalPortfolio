#include <stdio.h>
#include <stdlib.h>
//c program for lab 5
int main(int argc,char *argv[]){
	//allocate memory for argc - 1
	int *arrayPtr;
	int sum = 0;
	//dynamically allocate the arrayPtr based on the argc provided
	arrayPtr = (int *) malloc((argc-1) * sizeof(int));
	if(arrayPtr == NULL){
		printf("Halting: uable to allocate array.\n");
		exit(1);
	}
	//convert each element of argv from a char to int
	for(int i = 1; i < argc; i++){
		arrayPtr[i-1] = atoi(argv[i]);
	}
	//originally for the day 1 part of the lab this would merely print out the element at index i
	//changed the code for day 2 to check if it was greater than the threshold value for the image of mickey mouse
	//if it was greater than the threshold value of 170, it would be 255. else 0
	for(int i = 0; i < argc-1; i++){
		arrayPtr[i]++;
		if(arrayPtr[i] > 170){
			printf("255 ");
		}else{
			printf("0 ");
		}
	}
	printf("\n");
	free(arrayPtr);
	return 0;
}
