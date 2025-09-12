let boolName=false;let boolPh=false;let boolMail=false;let boolCity=false;let boolPin=false;
function nameCheck(){
    var fname=document.getElementById("fname").value;
    var lname=document.getElementById("lname").value;
    var outname=document.getElementById("ou");
    fname.trim();
    lname.trim();
    if(/^[A-Za-z]+( [A-Za-z]+)?$/.test(lname)&&/^[A-Za-z]+( [A-Za-z]+)?$/.test(fname)){
        outname.innerHTML="&#9989";
        boolName=true;
    }
    else if(fname===""&&lname===""){
        outname.innerHTML="";
        boolName=false;
    }
    else{
        outname.innerHTML="&#10060";
        boolName=false;
    }
}
function phCheck(){
    var ph=document.getElementById("phNo").value;
    var phId=document.getElementById("phId");
    ph.trim();
    if(/^[6-9]\d{9}$/.test(ph)){
        boolPh=true;
        phId.innerHTML="&#9989";
    }
    else if(ph===""){
        phId.innerHTML="";
        boolPh=false;
    }
    else{
        phId.innerHTML="&#10060";
        boolPh=false;
    }
}
function mailCheck(){
    var mails=document.getElementById("eMail").value;
    var mailId=document.getElementById("mailId");
    mails.trim();
    if(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-z]{2,}$/.test(mails)){
        mailId.innerHTML="&#9989";
        boolMail=true;
    }
    else if(mails===""){
        mailId.innerHTML="";
        boolMail=false;
    }
    else{
        mailId.innerHTML="&#10060";
        boolMail=false;
    }
}
function cityCheck(){
    var city=document.getElementById("city").value;
    var outCity=document.getElementById("outCity");
    city.trim();
    if(/^[a-zA-Z]+$/.test(city)){
        outCity.innerHTML="&#9989";
        boolCity=true;
    }
    else if(city===""){
        outCity.innerHTML="";
        boolCity=false;
    }
    else{
        outCity.innerHTML="&#10060";
        boolCity=false;
    }
}
function pinCheck(){
    var pin=document.getElementById("pincode").value;
    var outPin=document.getElementById("outPin");
    pin.trim();
    if(/^[1-9]\d{5}$/.test(pin)){
        outPin.innerHTML="&#9989";
        boolPin=true;
    }
    else if(pin===""){
        outPin.innerHTML="";
        boolPin=false;
    }
    else{
        outPin.innerHTML="&#10060";
        boolPin=false;
    }
}

function checkAllDetails(){
    if(boolName&&boolPh&&boolMail&&boolCity&&boolPin){
        let tabs=document.getElementById("setData");
        let len=tabs.rows.length;
        if(len>1)
        sessionStorage.setItem("tableData",tabs.outerHTML);
        else sessionStorage.setItem("tableData","");
        return true;
    }
    else{
        document.getElementById("errorOut").innerText="please check the all inputs";
        return false;
    }
}


let booName=false;let booField=false;let booExp=false;
function checkCompanyName(){
    var cname=document.getElementById("companyName");
    var nameId=cname.value.trim();
    if(/^[A-Za-z]+( [A-Za-z]+)?$/.test(nameId)){
        cname.style.borderBottom="2px solid rgb(189, 158, 124)";
        booName=true;
    }
    else if(nameId===""){
        cname.style.borderBottom="2px solid rgb(189, 158, 124)";
        booName=false;
    }
    else{
        cname.style.borderBottom="2px solid red";
        booName=false;
    }
}
function checkCompanyField(){
    var cfield=document.getElementById("companyField");
    var nameId=cfield.value.trim();
    if(/^[A-Za-z]+( [A-Za-z]+)?$/.test(nameId)){
        cfield.style.borderBottom="2px solid rgb(189, 158, 124)";
        booField=true;
    }
    else if(nameId===""){
        cfield.style.borderBottom="2px solid rgb(189, 158, 124)";
        booField=false;
    }
    else{
        cfield.style.borderBottom="2px solid red";
        booField=false;
    }
}
function checkCompanyExp(){
    var cname=document.getElementById("companyExp");
    var nameId=cname.value.trim();
    if(/^[0-9]+(.[0-9]+)?$/.test(nameId)){
        cname.style.borderBottom="2px solid rgb(189, 158, 124)";
        booExp=true;
    }
    else if(nameId===""){
        cname.style.borderBottom="2px solid rgb(189, 158, 124)";
        booExp=false;
    }
    else{
        cname.style.borderBottom="2px solid red";
        booExp=false;
    }
}
function callAdd(){
    document.querySelector(".details").style.display="block";
    document.querySelector("#addWork").style.display="none";
}
function cancelWork(){
    document.querySelector("#addWork").style.display="block";
    document.querySelector(".details").style.display="none";
    document.getElementById("companyName").value="";
    document.getElementById("companyField").value="";
    document.getElementById("companyExp").value="";
}
function addDetails(){
    if(booExp&&booField&&booName){
        let tab=document.querySelector(".workExperience");
        tab.style.display="inline-block";
        let newRow=tab.insertRow();
        newRow.insertCell(0).innerHTML=document.getElementById("companyName").value;
        newRow.insertCell(1).innerHTML=document.getElementById("companyExp").value;
        newRow.insertCell(2).innerHTML=document.getElementById("companyField").value;
        cancelWork();
        booExp=false;
        booField=false;
        booName=false;
    }
}

function clearAllTd(){
    document.getElementById("errorPhoto").innerHTML="";
    document.getElementById("errorResume").innerHTML="";
    let tabs=document.querySelector(".workExperience");
    let len=tabs.rows.length;
    for(let i=len-1;i>0;i--){
        tabs.deleteRow(i);
    }
    tabs.style.display="none";
}
function checkResume(input){
    const resume=input.files[0];
    if(resume){
        let arr=["pdf","doc","docx"];
        let valid=resume.name.split('.').pop().toLowerCase();
        if(arr.includes(valid))document.getElementById("errorResume").innerHTML="&#9989";
        else{
            input.value="";
            sessionStorage.setItem("resume","");
        }
    }
    else{
        document.getElementById("errorResume").innerHTML="";
        document.getElementById(resume).value="";
    }
}
function checkPhoto(input){
    const photo=input.files[0];
    if(photo){
        if(photo.type==="image/png"){
            document.getElementById("errorPhoto").innerHTML="&#9989";
        }
        else{
            input.valu="";
            sessionStorage.setItem("photo","");
        }
    }
    else{
        document.getElementById("errorPhoto").innerHTML="";
        document.getElementById("photo").value="";
    }
}


window.onload=function(){
    const arr=["creator.png","mail.png","book.png","campaign.png","crm.png","desk.png"];
    let srcArr=["https://www.zoho.com/en-in/creator/","https://www.zoho.com/mail/?src=zindex&sec=fa","https://www.zoho.com/in/books/?src=zindex&sec=fa","https://www.zoho.com/campaigns/","https://www.zoho.com/en-in/crm/?src=zindex&sec=fa","https://www.zoho.com/en-in/desk/"];
        let creator=document.getElementById("creatorId");
        let mai=document.getElementById("maiId");
        let book=document.getElementById("bookId");
        let cam=document.getElementById("camId");
        let crm=document.getElementById("crmId");
        let desk=document.getElementById("deskId");
            var i=0;
            var inter=setInterval(()=>{
                creator.src=arr[i];
                document.getElementById("creatorA").href=srcArr[i];
                i--;
                if(i<0)i=5;
            },1000);
            var g=1;
            var inter=setInterval(()=>{
                mai.src=arr[g];
                document.getElementById("mailA").href=srcArr[g];
                g--;
                if(g<0)g=5;
            },1000);
            var k=2;
            var int=setInterval(()=>{
                book.src=arr[k];
                document.getElementById("bookA").href=srcArr[k];
                k--;
                if(k<0)k=5;
            },1000);
            var l=3;
            var inr=setInterval(()=>{
                cam.src=arr[l];
                document.getElementById("camA").href=srcArr[l];
                l--;
                if(l<0)l=5;
            },1000);
            var z=4;
            var inx=setInterval(()=>{
                crm.src=arr[z];
                document.getElementById("crmA").href=srcArr[z];
                z--;
                if(z<0)z=5;
            },1000);
            var m=5;
            var inm=setInterval(()=>{
                desk.src=arr[m];
                document.getElementById("deskA").href=srcArr[m];
                m--;
                if(m<0)m=5;
            },1000);
        };
