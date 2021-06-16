/**
 * Purpose This program sort the data using bubble sort technique. 
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package sort;
import java.util.ArrayList;
import java.util.List;

import oopsutil.*;

public class BubbleSort {

	public static void main(String[] args) {
		new OopsUtil();
		List<Integer> list= new ArrayList<Integer>();
		System.out.println("Enter the size of list:");
		int n=OopsUtil.inputInt();
		System.out.println("Enter values in to the list:");
		for(int i=0;i<n;i++)
		{
			list.add(OopsUtil.inputInt());
		}
		Integer[] array=new Integer[list.size()];
		array=list.toArray(array);
		OopsUtil.bubbleSort(array);	

	}

}
