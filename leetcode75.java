class Solution {
    public void sortColors(int[] nums) {
        
        bubbleSort(nums);
    }
    //가장 작은것을 선택해서 제일 앞으로 보내면 어떨까?
    // 선택정렬
    public void selectionSort(int[] nums)
    {
        int min = 0;
        int tmp = 0;
        int index = 0;
        
        for(int i = 0; i<nums.length; i++)
        {
            min = Integer.MAX_VALUE; //Min값을 초기 셋팅 (매번 룹이 돌때마다 작은값을 찾아야됨)
            for(int j = i; j<nums.length; j++)  // i-1은 항상 sorted가 되어있는 상태 , 그 이후부터 작은값을 찾는다
            {
                if(min>nums[j])
                {
                    min = nums[j]; // 해당 min값을 저장
                    index = j;  // 해당 min 값의 인덱스를 저장
                }
            }
            tmp = nums[i]; // 현제 i의 위치와 해당 index의 위치의 원소를 바꿔준다 
            nums[i] = nums[index];
            nums[index] = tmp;
        }
    }
    
    //Bubble sort
    // 옆에있는 값과 비교해서 더 작은 값을 앞으로 보내면 어떨까?
    // 효율성 가장 떨어짐 
    // 가장 큰값이 제일 뒤로 간다 (각 iteration마다)
    public void bubbleSort(int[] nums)
    {
        int temp = 0;
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = 0; j<nums.length-1-i; j++) // 가장 큰값이 제일 뒤로가기에 정렬
            {
                if(nums[j] > nums[j+1]) // 앞에값이 뒤에 값보다 크면 업데이트 
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}