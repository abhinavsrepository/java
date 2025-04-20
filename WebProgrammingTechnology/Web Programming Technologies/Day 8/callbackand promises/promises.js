var p1=new Promise((resolve,reject)=>{
    var n=5;
    if(n>10)
          resolve("valid number")
    else
         reject( "invalid number")
    })
  console.log(p1);
    p1.then((result)=>{console.log(result);return 10;})
    .then((num)=>{console.log(num)})
    .catch((err)=>{console.log(err)});

    const sendrequestbyid=()=>{
        //retrieve id selected by user
       var v=document.getElementById('id');
       var pos=v.selectedIndex;
       var val=v.options[pos].value;
        alert(val);
        p2= fetch("https://jsonplaceholder.typicode.com/posts/"+val)
    //in fetch function to retrieve data we need to write then function 2 times
    p2.then((result)=>{
        console.log(result)
        //checks whetehr fetch is successful
        if(result.status===200 && result.ok){
            return result.json();
        }
        throw "error in fetch"
    }).then((response)=>{
        console.log(response)
        var str=`Id : ${response.id} userId: ${response.userId}`
        console.log(str)
    })
    .catch((err)=>{
        console.log(err)
    })
    }

    const displaydropdown=(arr)=>{
        var str="<select name='id' id='id' onchange='sendrequestbyid()'>"
        for(let ob of arr){
            str+=`<option value='${ob.id}'>${ob.id}</option>`
        }
        str+="</select>"
        document.getElementById("mydiv1").innerHTML=str;
    };

    const displaytable=(arr)=>{
        var str="<table border='2'><tr><th>Id</th><th>user Id</th><th>title</th><th>body</th></tr>";
        for(let ob of arr){
            str+=`<tr><td>${ob.id}</td><td>${ob.userId}</td><td>${ob.title}</td><td>${ob.body}</td></tr>`
        }
        str+="</table>"
        document.getElementById("mydiv").innerHTML=str;

    }

    //to send the ajax request
    //try for this url also
    //data will be in response.data
   p2= fetch("https://jsonplaceholder.typicode.com/posts")
    //in fetch function to retrieve data we need to write then function 2 times
    p2.then((result)=>{
        console.log(result)
        //checks whetehr fetch is successful
        if(result.status===200 && result.ok){
            return result.json();
        }
        throw "error in fetch"
    }).then((response)=>{
        console.log(response)
        displaytable(response);
        displaydropdown(response);
    })
    .catch((err)=>{
        console.log(err)
    })