import random

def main():
    # Player hand
    suits = ["Diamonds", "Spades", "Clubs", "Hearts"]
    ranks = ["Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"]

    rank1 = random.choice(ranks)
    rank2 = random.choice(ranks)
    suit1 = random.choice(suits)
    suit2 = random.choice(suits)

    card1 = rank1 + " of " + suit1
    card2 = rank2 + " of " + suit2

    num1 = countCard(rank1)
    num2 = countCard(rank2)
    playerSum = num1 + num2

    # if two aces, change one to a 1
    if playerSum > 21:
        num1 = 1

    print(f'The player\'s first card is a {card1}.')
    print(f'The player\'s second card is a {card2}.')
    printCurrentSum(num1, num2)

    # Dealer hand
    dealerRank1 = random.choice(ranks)
    dealerRank2 = random.choice(ranks)
    dealerSuit1 = random.choice(suits)
    dealerSuit2 = random.choice(suits)
    dealerCard1 = dealerRank1 + " of " + dealerSuit1
    print(f'The dealer\'s first card is a {dealerCard1}.')
    dealerCard2 = dealerRank2 + " of " + dealerSuit2
    num3 = countCard(dealerRank1)
    num4 = countCard(dealerRank2)
    dealerSum = num3 + num4

    # if two aces, change one to a 1
    if dealerSum > 21:
        num3 = 1
        dealerSum = num3 + num4

    while(playerSum < 21):
        inp = input("Hit or Stand?")
        if inp == "Stand":
            break
        elif inp == "Hit":
            playerSum = hitMe(playerSum, ranks, suits)
        else:
            print("Invalid input, please enter 'Hit' or 'Stand'.")
    if playerSum > 21:
        print("The player busts, you LOSE!")
    else:
        print("Dealer goes")
        print(f'The dealer reveals their face down card to be a {dealerCard2}.')
        if(dealerSum > 16):
            print('The dealer has a hand over 16 and is forced to stand.')
        else:
            while(dealerSum < 17):
                print("Dealer draws a card...")
                dealerSum = hitMe(dealerSum, ranks, suits)
        if dealerSum > 21:
            print("Dealer busts, YOU WIN!")
        else:
            compare(playerSum, dealerSum)


def countCard(rank):
    if rank == "Two":
        return 2
    elif rank == "Three":
        return 3
    elif rank == "Four":
        return 4
    elif rank == "Five":
        return 5
    elif rank == "Six":
        return 6
    elif rank == "Seven":
        return 7
    elif rank == "Eight":
        return 8
    elif rank == "Nine":
        return 9
    elif rank == "Ten" or rank == "Jack" or rank == "Queen" or rank == "King":
        return 10
    elif rank == "Ace":
        return 11

def printCurrentSum(x, y):
    sum = x + y
    print(f'Your current card total is {sum}.')

def hitMe(sum, x, y):
    rank = random.choice(x)
    suit = random.choice(y)
    newCard = rank + " of " + suit
    print(newCard)
    sum = sum + countCard(rank)
    return sum

def compare(player, dealer):
    print(f'The player ends with {player}.')
    print(f'The dealer ends with {dealer}.')
    if(player > dealer):
        print("The player has a greater hand than the dealer, YOU WIN!")
    elif(dealer > player):
        print("The dealer has a greater hand than the player, YOU LOSE!")
    else:
        print("The game ends in a tie.")

if __name__ == "__main__":
    main()

