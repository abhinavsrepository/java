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


    //to send the ajax request
    //try for this url also
    //data will be in response.data
   p2= fetch("https://jsonplaceholder.typicode.com/posts")
    //in fetch function to retrieve data we need to write then function 2 times
    p2.then((result)=>{
        //checks whetehr fetch is successful
        if(result.status===200 && result.ok){
            return result.json();
        }
        throw "error in fetch"
    }).then((response)=>{
        console.log(response)
        displaytable(response);
    })
    .catch((err)=>{
        console.log(err)
    })