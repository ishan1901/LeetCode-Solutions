public class FindKthLargest {
	public static int findKthLargest(int array[], int k) {
		if (array.length == 0) {
			return 0;
		} else if (array.length == 1) {
			return array[0];
		}
		return findKLargestUtil(array, 0 , array.length - 1, array.length - k);
		
	}
	public static int findKLargestUtil(int[] array, int start, int end, int k) {
		if (start > end) {
			return 0;
		}
		int partitionIndex = 0;
		//boolean repeat = true;
		///while (repeat) {
			//Random r = new Random();
			//int randomIndex = r.nextInt(end + 1 - start) + start;
			partitionIndex  = partition(array, start, end);
			//double leftPercentage = (((end-partitionIndex + 1) * 100) / (end - start + 1));
			//double rightPercentage = (((partitionIndex - start + 1) * 100) /(end - start + 1));
			
			//if (leftPercentage >= THRESHOLD && rightPercentage >= THRESHOLD) {
				//repeat = false;
			//}
			
			
		//}
		if (partitionIndex == k) {
			return array[partitionIndex];
		} else if (partitionIndex < k) {
			return findKLargestUtil(array, partitionIndex + 1, end, k);
		} else {
			return findKLargestUtil(array, start, partitionIndex - 1, k);
		}
	}
	
	private static int partition(int[] array, int start, int end) {
		int pivot = array[start];
		int left = start;
		int right = end;
		while (left < right) {
			while (left <= end && array[left] <= pivot) {
				left++;
			}
			while (right >= start && array[right] > pivot) {
				right--;
			}
			if (left < right) {
				swap(array,left,right);
			}	
		}
		array[start] = array[right];
		array[right] = pivot;
		return right;
	}
	
	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}
