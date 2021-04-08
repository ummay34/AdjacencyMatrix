# Find the least dominating set in a adjacency matrix. 
This program wil find the smallest dominating set for an undirected graph.
The function called isDominatingSet will receive as a parameter a subset of the nodes in the graph.
To find the minimum, we simply compare all dominating sets to eachother and return the smallest


Notice that all undirected graphs have a dominating set. For completely disconnected graphs, the minimum dominating set will be the entire set of nodes.

The code assumes that the user will use input redirection. The program uses stdin to read the values.

More information about Dominating Sets can be found at:
 * https://mathworld.wolfram.com/DominatingSet.html
 * https://mathworld.wolfram.com/MinimumDominatingSet.html
 * https://en.wikipedia.org/wiki/Dominating_set

These are the expected outputs for the different test files:

* testDominatingSet3.txt: <br>
  Result is: [ ZERO ] <br>
  The size of the smallest dominating set is: 1

* testDominatingSetI3.txt: Result is: <br>
[ ZERO ONE TWO ] <br>
The size of the smallest dominating set is: 3

* testDominatingSetI4.txt: Result is:<br>
[ ZERO ONE TWO THREE ]<br>
The size of the smallest dominating set is: 4

* testDominatingSet20.txt: Result is: <br>
[ NINETEEN ]<br>
The size of the smallest dominating set is: 1

* testDominatingSet28.txt: Result is:<br> 
[ TWENTYSEVEN ]<br>
The size of the smallest dominating set is: 1

* testDominatingSet29.txt: Result is <br>
[ ZERO TWENTYEIGHT ]<br>
The size of the smallest dominating set is: 2
