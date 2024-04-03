%prolog code to reverse a list.
%it takes an inputted list and recursively changes it so that the tail is at the front of the new list.
%it then returns that new list

reverse_list(Input, Result) :-
    reverse_list_acc(Input, [], Result).

reverse_list_acc([], Acc, Acc).
reverse_list_acc([Head|Tail], Acc, Result) :-
	reverse_list_acc(Tail, [Head|Acc],Result).

main() :-
	read(Input),
	reverse_list(Input,Result),
	write(Result).
