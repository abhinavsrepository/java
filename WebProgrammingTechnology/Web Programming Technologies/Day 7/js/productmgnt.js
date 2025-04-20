/*productarr=[
    {pid:111,pname:"chair",qty:34,price:3000},
    {pid:112,pname:"table",qty:45,price:7000},
    {pid:113,pname:"shelf",qty:55,price:5000}
]*/
productarr=JSON.parse(localStorage.ptab);

//copy prodarr in searcharr
//var searcharr=[...prodarr];

var displaytable=(mytab=productarr)=>{
    localStorage.ptab=JSON.stringify(productarr);
    var str="<table border='2'><tr><th>Product Id</th><th>Name</th><th>Quantity</th><th>Price</th></tr>"
    for(let prod of mytab){
        str+=`<tr><td>${prod.pid}</td><td>${prod.pname}</td><td>${prod.qty}</td><td>${prod.price}</td></tr>`

    }
    str+="</table>"
   // alert(str)
    document.getElementById("mydiv").innerHTML=str;
}
const  clearform=()=>{
    document.getElementById("pid").value="";
    document.getElementById("pname").value="";
    document.getElementById("qty").value="";
    document.getElementById("price").value="";
    document.getElementById("pid").focus();
}
const addNewProduct=()=>{
    var pid=parseInt(document.getElementById("pid").value);
    var pname=document.getElementById("pname").value;
    var qty=parseInt(document.getElementById("qty").value);
    var price=parseFloat(document.getElementById("price").value);
    //var ob={pid:pid,pname:pname,qty:qty,price:price}
    var ob={pid,pname,qty,price}
    clearform();
    productarr.push(ob);
    displaytable();
}

const deleteProduct=()=>{
    //retrieve pid
    var pid=parseInt(document.getElementById('pid').value);
    //search object
    var pos=productarr.findIndex(p=>p.pid===pid);
       if(pos!==-1){  //check whether product found
        //delete from the given position
        productarr.splice(pos,1);
        alert("deleted succefully")
        displaytable();
        clearform()
    }else{
        alert("not found")
      }
}

const updateProduct=()=>{
   //retrieve pid
   var pid=parseInt(document.getElementById('pid').value);
   //search object
   var pos=productarr.findIndex(p=>p.pid===pid);
      if(pos!==-1){  //check whether product found
       //delete from the given position
       var pname=document.getElementById("pname").value;
       var qty=parseInt(document.getElementById("qty").value);
       var price=parseFloat(document.getElementById("price").value);
       //update data --- one method
       productarr.splice(pos,1,{pid,pname,qty,price});
        //update data --- second method
       /*prodarr[pos].pname=pname;
       prodarr[pos].qty=qty;
       prodarr[pos].price=price;*/
       alert("updated succefully")
       displaytable();
       clearform() 
      }
      else{
        alert("not found")
      }
}
//write a function to search products by range of price

const searchdata=(ev)=>{
  //alert("keyup event")
  console.log(ev.key)
  console.log("value :"+ev.target.value)

  var searchtxt=ev.target.value;
  if(searchtxt==="")
  {
    //if searchtxt is empty then both arrays are same
    var searcharr=[...productarr];
  }else{
    searcharr=productarr.filter(p=>p.pname.includes(searchtxt))
  }
  displaytable(searcharr)
  //console.log(ev.which)
}