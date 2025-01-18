def floor_square_root(n):
  
    #function for finding the floor value of the square root of n.
    
    if n == 0 or n == 1: # when the nuber is 0 or 1
        return n

    start, end = 1, n
    result = 1

    while start <= end:
        mid = (start + end) // 2

        # Checking if mid*mid is equal to n
        if mid * mid == n:
            return mid
        
        # If mid*mid is less than n, move to the right half
        if mid * mid < n:
            start = mid + 1
            result = mid
        else:
            # If mid*mid is greater than n, move to the left half
            end = mid - 1

    return result

def main():
    # Example inputs to test the function
    test_cases = [5, 4, 36]
    
    print("Result:")
    for n in test_cases:
        print(f"Input: {n}, Floor Square Root: {floor_square_root(n)}")

if __name__ == "__main__":
    main()
