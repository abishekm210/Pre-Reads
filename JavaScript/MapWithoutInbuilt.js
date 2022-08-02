var arr_list = [1 ,2 ,3 ,4 ,5];

calculate = (arr, calculate) => {
    var result = [];
    for(var i = 0 ; i < arr.length ; i++){ 
        result[i] = calculate(arr[i]);
    }
    return result;
};

multiplyBy2 = (number) => {
    return number + 3;
};

console.log(calculate(arr_list, multiplyBy2));