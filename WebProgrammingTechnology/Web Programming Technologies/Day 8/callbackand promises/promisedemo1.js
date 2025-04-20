blogs=[{name:"blog1",contents:"blog1 contents"},
    {name:"blog2",contents:"blog2 contents"},
    {name:"blog3",contents:"blog3 contents"}];

    function getblogs(){
        setTimeout(()=>{
            console.log("in getblogs")
           str="<ul>"
           for(let v of blogs){
            str+=`<li>${v.name}-----${v.contents}</li>`
           }
           str+="</ul>"
           document.getElementById("mydiv").innerHTML=str;
        },1000)
        
    }

    function createblog(newblog){
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                console.log("in createblog")
                blogs.push(newblog);
                console.log(blogs)
                n=12;
                if(n>10)
                   resolve("success")
                else
                   reject("error")
               
            },2000)
        })

        
        
    }

    p1=createblog({name:"blog7",contents:"blog contents"})
    p1.then((result)=>{console.log(result);getblogs()})
    .catch((err)=>{
        console.log(err);
    })
    console.log("after p1")

    p2=new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("in p2 promise")
            resolve(10)
        },1000)
    })
    p3=new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("in p3 promise")
            resolve(20)
        },2000)
    })
    p4=new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("in p4 promise")
            resolve(30)
        },3000)
    })

    Promise.all([p2,p3,p4])
    .then((result)=>{
        console.log(result);
        ans=result.reduce((acc,num)=>acc+num);
        console.log("addition : "+ans)
    })
    .catch((err)=>{
        console.log(err)
    })
    