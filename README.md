# 99bottles

## Chapter 1.1 -> First Solution to 99 Bottles of Beer song

My Solution has the following problems:
1) Embeds a great deal of logic into the verse strings: Each time there are different cases based on number of bottles, it changes the logic used to retrieve a new verse line

2) Has multiple copies of strings. "of beer on the wall" and "Bottle(s) of beer" are duplicated many times. The bottom verse method also duplicates most of the code as well. 

3) Has duplication of logic. The same `when` case can be seen on both verse methods and do mostly the same stuff: get a new verse based on its quantity of beer on the wall

**While multiple copies of strings are easy to see and understand, the when logic is harder.** In this case, the user has to compare the different strings to understand that this logic separation is caused because of the pluralization of the world "Bottle.

**Duplication of logic suggest that there are concepts hidden in the code because they haven't been isolated and named.** Having to say "bottles" or "bottles" mean something and having to use `n` and sometimes `n-1` means something else and the code gives no clue.