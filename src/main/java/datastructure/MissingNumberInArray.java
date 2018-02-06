package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberInArray {
	List<Integer> misingNumberList;
	public List<Integer> missingNumbers(int[] nums){
		int missingNum;
		int temp =0;
		misingNumberList = new ArrayList<Integer>();
			for(int i=0;i<nums.length;){
			if(temp==nums[i]){
					i++;
					temp++;
				}
				else{
				  missingNum = temp;
				  temp++;
				  misingNumberList.add(missingNum);
				}
			
		}
	   return misingNumberList;
	}
public static void main(String[] args) {
	int[] arr = {6,7,8,19,41,56,1,2,4};
	Arrays.sort(arr);
	MissingNumberInArray mna = new MissingNumberInArray();
	System.out.println(mna.missingNumbers(arr));
}
}
