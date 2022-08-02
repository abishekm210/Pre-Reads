var number_list = [100, 200, 300, 400, 500];

reductFun = (number_list, calculate) => {
    var total = 0;
    for(var i = 0 ; i < number_list.length ; i++) {
        total = calculate(total, number_list[i]);
    }
    return total;
};

add = (total, number) => {
    return total + number;
};

console.log(reductFun(number_list, add));