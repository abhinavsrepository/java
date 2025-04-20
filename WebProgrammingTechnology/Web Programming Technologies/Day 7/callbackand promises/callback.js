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

    function createblog(newblog,funct1){
        setTimeout(()=>{
            console.log("in createblog")
            blogs.push(newblog);
            console.log(blogs)
            funct1();
        },2000)
        
    }

    console.log("before createblog")
    createblog({name:"blog5",contents:"blog5 contents"},getblogs)
    
    console.log("After getblogs")