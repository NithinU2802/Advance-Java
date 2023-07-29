/******************************************************************************

    Graph Implementation.
    
Input:
n=6
Enter Neighbour of A: B C
Enter Neighbour of B: D E 
Enter Neighbour of C: F 
Enter Neighbour of D:
Enter Neighbour of E: F 
Enter Neighbour of F:

Output:
From this Graph has been Implemented..!


*******************************************************************************/
import java.util.*;

class Graph{
    char element;
    char[] next;
}

public class CreateGraph
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	Graph[] graph=new Graph[n];
	x.nextLine();
	for(int i=0;i<n;i++){
	    graph[i]=new Graph();
	    graph[i].element=(char)('A'+i);
	    System.out.print("Enter Neighbour of "+graph[i].element+" : ");
	    graph[i].next=x.nextLine().toCharArray();
	}
	int[] visited=new int[n];
	System.out.println("From this Graph has been Implemented..!");
	}
}
