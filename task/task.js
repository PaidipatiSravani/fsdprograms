function clickSubmitButton(){
   var array={};
    array["name"]=document.getElementById("name").value;
    array.des=document.getElementById("designation").value;
    array.sal=document.getElementById("salary").value;
    // console.log(array) 
    insertNewRow(array)
    resetForm();
}  
function insertNewRow(data){
    var table = document.getElementById("table");
    var row = table.insertRow();
    var cell1 = row.insertCell(0);
    cell1.innerHTML = data.name;
    var cell2 = row.insertCell(1);
    cell2.innerHTML = data.des;
    var cell3 = row.insertCell(2);
    cell3.innerHTML = data.sal;
    var cell4 = row.insertCell(3);
    cell4.innerHTML = "<button id='btnEdit' class='btn btn-success' onclick='edit()'>Edit</button> <button id='btnDel'  class='btn btn-danger'>Delete</button>";
    
}
function resetForm(){
    document.getElementById("name").value="";
    document.getElementById("designation").value="";
    document.getElementById("salary").value="";
}
function deleteRow(){
    
         
}


