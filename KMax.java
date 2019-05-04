class KMax {

	int[] nums;
	int k;
	int[] result;

	public KMax(int[] nums, int k) {
		this.nums = nums;
		this.k = k;
		this.result = new int[nums.length - k + 1];
	}
	













	public static void main(String[] args) {
		int[] nums = new int[]{10,5,2,7,8,7};
		Jren.p(new KMax(nums, 3).result);
	}
}