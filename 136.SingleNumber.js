/**
 * @param {number[]} nums
 * @return {number}
 */
 var singleNumber = function(nums) {
     var count = 0;
     var flag = false;
    nums.forEach(item => {
        let x = item;
        count = 0;
        nums.forEach(y => {
            if(x==y)
            {
                count++;
            }
            
            
        })       
        if (count<2)
            {
                console.log(x);
            }
    });
};
var nums = [1,2,5,3,2,3]
singleNumber(nums);