const displaytable=(arr)=>{
    var str="<table border='2'><tr><th>Id</th><th>user Id</th><th>title</th><th>body</th></tr>";
    for(let ob of arr){
        str+=`<tr><td>${ob.id}</td><td>${ob.userId}</td><td>${ob.title}</td><td>${ob.body}</td></tr>`
    }
    str+="</table>"
    document.getElementById("mydiv").innerHTML=str;

}
async function f1(){
    return "hello"
}

ans=f1()
ans.then((result)=>{
    console.log(result)
})
//console.log(ans);

async function fetchdata(){
result=await fetch("https://jsonplaceholder.typicode.com/posts");
if(result.status===200 && result.ok){
   data=await result.json();
    console.log(data);
    displaytable(data);
}
}


fetchdata();
console.log("after fetchdata")
