var containsDuplicate = function(nums) {
    
    var count = 0;
    let flag = false;
        for(let i=0;i<nums.length;i++){
        var x = nums[i];
        count = 0;
        for(let j=0;j<nums.length;j++){
            var y = nums[j];
            if (x===y)
                {
                    count++;
                    if (count >= 2)
                    {
                        flag = true;
                    }
                }
                else{
                }
            
        }
        
    }
    
    return flag;
    
};
var nums = [2,7,4,1,9]
console.log(containsDuplicate(nums));