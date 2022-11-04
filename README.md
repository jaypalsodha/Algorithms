# Algorithms
- Understanding algorithms and Data Structure.

#Stable Sort
- In the sorted array, the duplicate items will preserve the order of the item.

#Unstable Sort
- In the shorted array, duplicate item will not preserve the order of item.

#Bubble sort
- In the bubble sort algorithm we go swap the element and move the largest element 
to the end and decrease the unsorted index by 1. So in this case, everytime we iterate the largest element
  will move to the end of array.
  
#Selection Sort


# Insertion Sort
 - In place algorithm
 - O(n2) Complexity - Quadratic
 - It will take 100 steps to sort 10 elements, or 10,000 steps to sort 100 elements.
 
 Understanding the algorithm
 
| index-0 |index-1 | index-2|index-3|index-4|index-5| 
| --------| -------|--------|-------|-------|-------|
| 35      | 25     |10      |7      |  8    |31     |

 - Making first element as sorted element i.e sorted element at index -0
 - Keeping firstUnsort element to a element at first index. i.e 25
 - Comparing elements from right to left and swaping elemnts based on their value.


# Shell Short

- In Place algorithm
- It is more efficient then insertion sort. 
- After some point of time it will also be using the insertion short only.
- Instead of replacing the single element and moving forward, it will increase 
  the gap and moving the elements.     


# Recursion

- Doing same task again and again is called recursion.
- Using recursion performance will be degrade, but at the same time it makes code more cleaner.

let's look at find the factorial of a number.

* Factorial of 0 means 1 (i.e 0!)
* Factorial of 1 means 1 * 0! = 1 * 0! (i.e 1)
* Factorial of 2 means 2 * 1! = 2 * 1 * 0! = 2

As you can see same calculation is going repeatedly.

So, we can say that 

    Factorial(n) = n * (n-1)!

Problem can be solved using iteration as well as recursion.


