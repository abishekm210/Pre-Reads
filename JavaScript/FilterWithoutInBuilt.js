var age_list = [22, 55, 14, 31, 20, 11];

filterFunc = (age, calculate) => {
    var result = [];
    var index = 0;
    for(var i = 0 ; i < age.length ; i++) {
        if(calculate(age[i]))
            result[index++] = age[i]; 
    }
    return result;
};

checkAdult = (age) => {
        return age >= 18;
};

console.log(filterFunc(age_list, checkAdult));