// let js;
// js="Amazing";
// console.log(js);
// js=30;


// let output = 123;
// alert(typeof output); // boolean

//  output = String(output); // now value is a string "true"
//  alert(typeof output); // string

// let test = "Anshu"*"3";
// console.log( test);


// var age=16;
// var ageStatus = (age >= 18) ? "Adult" : "Minor";
// console.log(`Keerthi is  ${ageStatus}`);

// let myAge = "45";
// let myRealAge = 45;

// console.log(myAge == myRealAge);

// Control Structure Example:

// //While loop
// let i = 0;
// while (i < 3) { 
//   console.log( i );
//   i++;
// }

//Do While:

// let i = 0;
// do {
//   console.log( i );
//   i++;
// } while (i < 3);


// for (let i = 0; i < 3; i++) { 
//     console.log(i);
//   }
 //Break:
//   let sum = 0;

 

//   while (true) {

//   let value = +prompt("Enter a number", '');
//   if (!value) break;
//   sum += value;
// }

//Switch statement
// let a = 2 + 2;

// switch (a) {
//   case 3:
//     console.log( 'Too small' );
//     break;
//   case 4:
//     console.log( 'Exactly!' );
//     break;
//   case 5:
//     console.log( 'Too big' );
//     break;
//   default:
//     console.log( "I don't know such values" );
// }


// function showMessage() {
//     return ( 'Hello everyone!' );
//   }

// console.log(showMessage());


// var getName = function (myName) {
//     return (`Hello ${myName}`);
//   }
//   console.log(getName("Anshu"))

// (function( num1,num2 ){

//     let test = num1+num2;
// 	function two(test,num3){

//     }
//     two();



// })(5,6);

// let add=  (a) => {
//     return a + 100;
//   }
//   console.log(add(50));


// let user = {     // an object
//     name: "Jeigyanshu",  // by key "name" store value "Jeigyanshu"
//     age: 45,        // by key "age" store value 45
//     Address : {
//        street: "Kathirguppe",
//        locality: "ShivajiNagar",
//        city: "Banglore"
//    },
//    hobbies : ["fifa","Badminton"]
//   };

//   console.log(user);

//   user.gender = "male";
//   console.log(user);
  
//   console.log(user);

//   console.log(user.age);
//   console.log(user.Address.street);
// console.log(user[age]);

// let fruit = prompt("Which fruit to buy?","Grapes");

// let bag = {
//   fruit: 5 
// };

// console.log(bag);


// let arr = {
//     name: "Anshu",
//     age: 45,
//     isAdmin: true
//   };

//   let user =[1,2,"",4];
  
//   for (let key in user) {
//     console.log( user[key] ); // Anshu, 30, true
//   }
  
// let fruits = ["Apple", "Orange", "Plum"];
// fruits.splice(2,0,"Grapes");
// console.log(fruits);
// console.log(fruits.length);

// let arr = ["I", "study", "JavaScript", "right", "now"];
// arr.splice(0,3,"I","want","to","dance","with","Alia");
// console.log(arr);


// let alpha = ["t", "e", "s", "t"];

// console.log(alpha.slice(1,3));
// console.log(alpha.slice(-2));
// let num1=[1,2]
// let num2=[9,10]
// console.log(num1.concat(num2));

// let fruits=["Apple", "orange", "grapes"]
// fruits.forEach((items,index,array)=>{
//     console.log(`${items}----->${index}--->${array}`);
// })

// console.log(Array.isArray(fruits));
// let para = document.getElementsByTagName("p");
// function colorFunction(){
//     document.querySelector(".young").style.backgroundColor = "red";
//     document.querySelector('#mature').style.backgroundColor = "orange";
//     document.querySelector('.senior').style.backgroundColor = "green";
//     document.querySelector("button").innerHTML="submit";
//     document.querySelector("div>button").style.backgroundColor = "yellow";;
// }

// function newWindow(){
//     window.open();
// }

// console.log(screen.width);


// // get the form
// let form = document.forms.myLogin; // <form name="myLogin"> element

// // get the element
// let elem = form.elements.password; // <input name="one"> element
// console.log(elem);
// console.log(elem.value);


// function colorFunction(){
//     console.log(form.length)

// }


// //select.options[1].selected = true;
// //select.selectedIndex = 2;
// select.value = 'banana';

// let myName = document.forms.myLogin
// let email = myName.elements.email;
// let password = document.forms.myLogin.password.value; 

// function validate(){
//     if(email==null || email==""){
//         alert("This field cannot be blank");
//         return false;
//     }
// }



// let str = "We will, we will rock you";
// let result = str.match(/we/g)
// console.log(result[0]);
// console.log(result.length);
// console.log(result.input);

// let matches = "JavaScript".match(/html/gi);
// if(!matches.length){
//     console.log("Error reading null property 'length' of null");
// }

// let replacement = str.replace(/we/gi,"I");
// console.log(replacement);


// let mob = "+(91)-7019344625";
// regexp = /\d/g;
// let mobNum = mob.match(regexp).join('');
// console.log(mobNum);
// console.log(typeof mobNum);

// function OuterFunction(outsideVariable){
//     return function innerFunction(insideVariable){
//         console.log(`Outer Function : ${outsideVariable}`);
//         console.log(`Inner Function : ${insideVariable}`);
//     }
// }


// let newFunction = OuterFunction("Outside");
// newFunction("inner");


// function myCalculator(num1,num2,num3,myCallback){
//     let sum= num1+num2+num3;
//     myCallback(sum);
// }

// function myDisplayer(some){
//     document.getElementById("demo").innerHTML=some;
// }

// let myResult = myCalculator(10,10,10,myDisplayer);

// setInterval(myDateFunction,2000);

// function myDateFunction(){
//     let d = new Date();
//     document.getElementById("demo").innerHTML=`${d.getHours()}:${d.getMinutes()}:${d.getSeconds()}`;
// }



// function myDisplayer(output){
//     document.getElementById("result").innerHTML = output;
//   }

// function myCalculator(num1,num2,num3,myDisplay){
//     let myOutput = num1+num2+num3;
//     myDisplay(myOutput);
// }  

// let mySumResult = myCalculator(36,24,36,myDisplayer);

// setInterval(timeDisplay,5000);

// function timeDisplay(){
//     let myTime = new Date();
//     document.getElementById("clock").innerHTML=`${myTime.getHours()}:${myTime.getMinutes()}:${myTime.getSeconds()}`;
// }


// let myName = "Jeigyanshu";

// function nameChange(){
//     myName="Anshu";
// }

// nameChange();

// console.log(myName);

// let jsonObj = {
//     name:"Jeigyanshu",
//     City: "banglore",
//     kids:38,
//     Job: "Java Developer"
// }

// console.log(jsonObj);

// let myJsonStr = JSON.stringify(jsonObj);
// console.log(myJsonStr);

// let newJsonObj = JSON.parse(myJsonStr);
// console.log(newJsonObj);


// let p = new Promise((resolve,reject)=>{
//     let a = 1+2;
//     if(a==2){
//         resolve("Successful");
//     }else{
//         reject("Failed");
//     }
// })


// p.then((message)=>{
//     console.log(`This is inside then ${message}`);
// }).catch((message)=>{
//     console.log(`This is in the catch ${message}`);
// })

// let str = "We will, we will rock you";
// let stringVariable = str.match(/il /gi);
// stringVariable.reverse
// console.log(stringVariable+"Ansh");

// let str = "We will, we will rock you";
// // /pattern/flag(s),text I wanna replace
// let replacement = str.replace(/we/gi,"I");
// console.log(replacement);

// let mob = "+(91)-7019344625";
// regexp = /\D/g;
// let mobNum = mob.match(regexp).join('');
// console.log( mobNum);


// let num = 10;
// function myClouser(num1,num2){
//     const num3 =19;
//     return num1+num2+num3;
// }

// function calculateSum(num1,num2,shaban){
//     let sumResult= num1+num2;
//     shaban(sumResult);
// }

// function myDisplayer(result){
//     document.getElementById("result").innerHTML=result;
// }

// function myClassDisplayer(result){
//     document.getElementsByClassName("result")[0].innerHTML=result;
// }

// //let myResult mymyClassDisplayerDisplayer= calculateSum(50,2);

// //alert("Hi I am Jeigyanshu!")

// calculateSum(4545,737,myClassDisplayer);

// // function timeFunction(){
// //     let myTime = new Date();
// //     document.getElementById("clock").innerHTML=`${myTime.getHours()}:${myTime.getMinutes()}:${myTime.getSeconds()}`
// // }

// setInterval(()=>{
//     let myTime = new Date();
//     document.getElementById("clock").innerHTML=`${myTime.getHours()}:${myTime.getMinutes()}:${myTime.getSeconds()}`
// },2000);


// let jsonObj = {
//     "name":"Shaban",
//     "City": "banglore",
//     "kids": 38,
//     "Job" : "Jawu fuuuuullllllll stacku developerru",
//     "hobbies" : ["Fifa","Badminton","Snooker","Kiriket with Puttu as captain"],
//     "Fav player":{"Name":"Messi","Jersey":30,"Country":"Argentina"},
//     "skills": null,
//     "Husband's Name": ["Pawan","Johnny","Imran","etc."],
//     "isMarried": false
// }


// console.log( jsonObj);

// let stringJsonObj = JSON.stringify(jsonObj);
// console.log(stringJsonObj);
// console.log(typeof stringJsonObj);

// let parsedData = JSON.parse(stringJsonObj);

// console.log(parsedData);
// console.log(typeof parsedData);

// //SPREAD, because on RIGHT side of =
// const arr = [1, 2, ...[3, 4]];
// console.log(arr);

// // REST, because on LEFT side of =
// const [a, b, ...others] = [1, 2, 3, 4, 5];
// console.log(a, b, others);


// const restaurant = {
//     name: 'Classico Italiano',
//     location: 'Via Angelo Tavanti 23, Firenze, Italy',
//     categories: ['Italian', 'Pizzeria', 'Vegetarian', 'Organic'],
//     starterMenu: ['Focaccia', 'Bruschetta', 'Garlic Bread', 'Caprese Salad'],
//     mainMenu: ['Pizza', 'Pasta', 'Risotto'],
  
//     order(starterIndex, mainIndex) {
//       return [this.starterMenu[starterIndex], this.mainMenu[mainIndex]];
//     },
  
//     orderDelivery({ starterIndex = 1, mainIndex = 0, time = '20:00', address }) {
//       console.log(
//         `Order received! ${this.starterMenu[starterIndex]} and ${this.mainMenu[mainIndex]} will be delivered to ${address} at ${time}`
//       );
//     },
  
//     orderPasta(ing1, ing2, ing3) {
//       console.log(
//         `Here is your declicious pasta with ${ing1}, ${ing2} and ${ing3}`
//       );
//     },
  
//     orderPizza(mainIngredient, ...otherIngredients) {
//       console.log(mainIngredient);
//       console.log(otherIngredients);
//     },
//   };
  
// let myIngredients = restaurant.orderPasta("Cheese","Peporoni","Olives");

// restaurant.orderPizza(myIngredients,...["chicken","oregano"]);


//Spread Operator:
let someArr = [1,2,3,4,3,4,5,6,7,7,8,9];
//let myNewArr =[5,6,7,someArr[0],someArr[1],someArr[2]];
let myNewArr = [5,6,7]
//let myComboArr = [someArr[0],someArr[1],someArr[2],myNewArr[0],myNewArr[1],myNewArr[2]]
//console.log(myComboArr);
// let myComboArr = [...someArr,...myNewArr];
// console.log(myComboArr);

//  const restaurant = {
//         name: 'Pawans Paradise',
//         location: 'Adity Pg, Room no: 309,2nd floor,Tyagraj Nagar',
//         categories: ['Italian', 'Pizzeria', 'Vegetarian', 'Organic'],
//         starterMenu: ['Focaccia', 'Bruschetta', 'Garlic Bread', 'Caprese Salad'],
//         mainMenu: ['Pizza', 'Pasta', 'Risotto'],
      
//         order(starterIndex, mainIndex) {
//           return [this.starterMenu[starterIndex], this.mainMenu[mainIndex]];
//         },
      
//         orderDelivery({ starterIndex = 1, mainIndex = 0, time = '20:00', address }) {
//           console.log(
//             `Order received! ${this.starterMenu[starterIndex]} and ${this.mainMenu[mainIndex]} will be delivered to ${address} at ${time}`
//           );
//         },
      
//         orderPasta(ing1, ing2, ing3) {
//           console.log(
//             `Here is your declicious pasta with ${ing1}, ${ing2} and ${ing3}`
//           );
//         },
      
//         orderPizza(mainIngredient, ...otherIngredients) {
//           console.log(mainIngredient);
//           console.log(otherIngredients);
//         },
//       };

//       let newMenu = [...restaurant.mainMenu,"Maggi","Noodles","SwangiBath","Sushla","Figure Rice"];
// // console.log(newMenu);
// console.log(restaurant);
// restaurant.mainMenu = newMenu;
// console.log(restaurant);

// function newFun(...myMenu){
//     console.log(myMenu);
// }

// newFun(newMenu);


// let p = new Promise((resolve,reject)=>{
//     let question = prompt("Do you love me?","");
//     let answer=question.toLowerCase();

//     if(answer == "yes"){
//         resolve("I love you to the moon and back!")
//     }else {
//         reject("I will die!")
//     }
// })

// p.then((message)=>{
//     console.log(message);
// }).catch((message)=>{
// console.log(message);
// })



// function sum(n1,n2){
//  if(typeof n1 === 'number' && typeof n2 === 'number'){
//    return n1+n2;
//  }else{
//     return +n1 + +n2;
//  }

// }

// let num1= '5';
// let num2=10;

// console.log(sum(num1,num2));

// let a = 2 + 2;

// switch (a) {
//   case 3:
//     console.log( 'Too small' );
//     break;
//   case 4:
//     console.log( 'Exactly!' );
//     break;
//   case 5:
//     console.log( 'Too big' );
//     break;
//   default:
//     console.log( "I don't know such values" );
// }


function showMessage() {
  console.log( 'Hello everyone!' );
}

showMessage();


var getName = function (myName) {
  return (`Hello ${myName}`);
}
console.log(getName('Anshu'));


(function( num1,num2 ){
	console.log(num1+num2);
})(5,6);


add= (a) => {
  return a + 100;
}
console.log(add(50));




let user = {     // an object
  name: "Jeigyanshu",  // by key "name" store value "Jeigyanshu"
  age: 45,        // by key "age" store value 45
  Address : {
	 street: "Kathirguppe",
	 locality: "ShivajiNagar",
	 city: "Banglore"
 },
 hobbies : ["fifa","Badminton"]
};

console.log(user);

user.isAdmin = true;
console.log(user);
delete user.age;
console.log(user);

// let fruit = prompt("Which fruit to buy?", "apple");
// let bag = {
//   [fruit]: 5, // the name of the property is taken from the variable fruit
// };

// console.log(bag);



for(let key in user){
  
  console.log(`${key}:${user[key]}`);
}


let myName="Jeigyanshu";
let myNewName=myName;


myNewName="Anshu";

console.log(myName);
console.log(myNewName);




let firstUser ={
  name:'Jeigyanshu',
  age:25
}

let secondUser = firstUser;
secondUser.name='Anshu';
console.log(firstUser);
console.log(secondUser);


let name="Jeigyanshu";
console.log(name.length);


console.log('Interface'.toUpperCase());
console.log('Interface'.toLowerCase());


let str = 'Widget with id';
console.log( str.indexOf("id") );

console.log( "Widget with id".includes('Widget') );


var myStr = "I am Lord Varys";

if(myStr.includes("Lord", 5)){
    console.log("word found.");
}
else{
    console.log("word NOT found");
}


let stringValue = "stringify";
console.log(stringValue.slice(1,5));
console.log(stringValue.substring(1,5));
console.log(stringValue.substr(1,5));


console.log(Math.round(4.45)); // 4
console.log(Math.ceil(4.45)); //5
console.log(Math.floor(4.95)); //4


let date = new Date("2021-10-25");
console.log(date);


let arr = [];
arr=["Anshu","Jeigyanshu"];
console.log(arr);


let fruits = ["Apple", "Orange", "Plum",30];

console.log( fruits[0] ); // Apple
console.log( fruits[1] ); // Orange
console.log( fruits[2] ); // Plum
console.log( fruits[3] );

console.log( fruits.shift() );


["Apple", "orange", "grapes"].forEach(console.log);

["Apple", "orange", "grapes"].forEach((test1,test2,test3) => {
  console.log(`${test1} is at index ${test2} in ${test3}`);
});
