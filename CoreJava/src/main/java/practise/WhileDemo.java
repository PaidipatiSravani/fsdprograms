package practise;

public class WhileDemo {
	public int[] removeDuplicatesInArray(int nums[]) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (!(nums[i] == nums[j] && i != j)) {
					boolean report=false;
					for (int k = 0; k < nums.length; k++) {
						if (nums[i] != result[k]) {
								report=true;
						}else{
							report=false;
						}
					}
					if(report){
						result[i]=nums[i];
					}
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 1 };
		WhileDemo obj = new WhileDemo();
		for (int k : obj.removeDuplicatesInArray(a)) {
			System.out.println(k);
		}
	}

}
