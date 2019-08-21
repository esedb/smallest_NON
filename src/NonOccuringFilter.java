
public class NonOccuringFilter {
	public static void main(String ags[]) {
		int array[] = {1,3,6,4,1,2};
		NonOccuringFilter filter = new NonOccuringFilter();
		int number = filter.getSmallestNonOccuring(array);
		System.out.println("Nuber found: " + number);
		
	}
	
	public int getSmallestNonOccuring(int array[]) {
		int max =  NonOccuringFilter.max(array);
		int smallest = NonOccuringFilter.smallest(array);
		int sm_it = smallest;
		int n_number = 0;
		
		for(int i = 0; i<array.length; i++) {
			sm_it = sm_it + 1;			
			boolean found = NonOccuringFilter.find(sm_it, array);
			if(!found && sm_it > 0) {
				n_number = sm_it;
				break;			
			}
			if(i == array.length -1 ) {
				n_number = sm_it + 1;
			}
			
		}
		
		return n_number;
		
	}
	
	public static int max(int array[]) {
		int max = array[array.length - 1];
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			
		}
		return max;
		
	}
	public static int smallest(int array[]) {
		int smallest = array[array.length - 1];
		for(int i=0; i<array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
			
		}
		return smallest;		
	}
	
	public static boolean find(int j, int array[]) {
		for(int i = 0; i<array.length; i++) {
			if(j == array[i]) {
				return true;
			}
			
		}
		return false;
	}

}
