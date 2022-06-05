var containsDuplicate = function(nums) {
    
    let flag = false;
    nums.forEach((item)=>{
        var x = item;
        nums.forEach((item2)=>{
            var y = item2;
            if (x===y)
                {
                    flag = true;
                }
            
        })
        
    })
    
    if (flag == false)
        {
            return true;
        }
    else {
        return false;
    }
    
};
console.log('hello world');

var nums = [1,2,3,1]
console.log(containsDuplicate(nums));