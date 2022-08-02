var arr_list = [1 ,2 ,3 ,4 ,5];

calculate = function calculate(arr, multiplyBy2) {
    var result = [];
    for(var i = 0 ; i < arr.length ; i++){ 
        result[i] = multiplyBy2(arr[i]);
    }
    return result;
};

multiplyBy2 = function multiplyBy2(number) {
    return number + 3;
};

console.log(calculate(arr_list, multiplyBy2));