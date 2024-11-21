# Reveal Cards In Increasing Order

**Difficulty**: Medium

---

## Problem Statement  

You are given an integer array `deck`. Each card in the deck has a unique integer value, where the integer on the \(i\)-th card is `deck[i]`.  

You can reorder the deck in any way you want. Initially, all cards are face down (unrevealed) in one deck.  

You perform the following steps repeatedly until all cards are revealed:  

1. Take the top card of the deck, reveal it, and take it out of the deck.  
2. If there are still cards in the deck, move the next top card to the bottom of the deck.  
3. If there are still unrevealed cards, go back to step 1. Otherwise, stop.  

Return an ordering of the deck such that the cards are revealed in increasing order.  

The first entry in the returned array is considered to be the top of the deck.  

---

## Examples  

### Example 1  

**Input**:  
```plaintext
deck = [17, 13, 11, 2, 3, 5, 7]
```  

**Output**:  
```plaintext
[2, 13, 3, 11, 5, 17, 7]
```  

**Explanation**:  
We can reorder the deck as follows:  
1. Start with the deck in the order \([17, 13, 11, 2, 3, 5, 7]\) (the specific order doesn't matter yet).  
2. After reordering, the deck becomes \([2, 13, 3, 11, 5, 17, 7]\), where 2 is the top of the deck.  

Perform the steps:  
- Reveal 2. Move 13 to the bottom. Deck becomes \([3, 11, 5, 17, 7, 13]\).  
- Reveal 3. Move 11 to the bottom. Deck becomes \([5, 17, 7, 13, 11]\).  
- Reveal 5. Move 17 to the bottom. Deck becomes \([7, 13, 11, 17]\).  
- Reveal 7. Move 13 to the bottom. Deck becomes \([11, 17, 13]\).  
- Reveal 11. Move 17 to the bottom. Deck becomes \([13, 17]\).  
- Reveal 13. Move 17 to the bottom. Deck becomes \([17]\).  
- Reveal 17.  

The revealed cards are in increasing order: \([2, 13, 3, 11, 5, 17, 7]\).  

---

### Example 2  

**Input**:  
```plaintext
deck = [1, 1000]
```  

**Output**:  
```plaintext
[1, 1000]
```  

---

## Constraints  

- \(1 \leq \text{deck.length} \leq 1000\)  
- \(1 \leq \text{deck}[i] \leq 10^6\)  
- All the values in `deck` are unique.  

--- 