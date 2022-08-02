var fruits = ["apple", "orange", "cherry"];

forEachFun = (fruits, print) => {
    for(var i = 0 ; i < fruits.length ; i++) {
        print(fruits[i]);
    }
};

printValue = item => {
    console.log(item);
};

forEachFun(fruits, printValue);