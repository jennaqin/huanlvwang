function phoneVerify(){
    var pn = document.getElementById("pnum");
    var pnNull = document.getElementById("pNumNull");
    var pv = document.getElementById("pVerify");
    var telephone = /^1[3-8]\d{9}$/;
    if (pn.value == ""){
        pnNull.style.visibility = "visible";
    }
    else {
        pnNull.style.visibility = "hidden";
        if (!telephone.test(pn.value)){
            pv.style.visibility = "visible";
        }
        else {
            pv.style.visibility = "hidden";
        }
    }
}
function nameVerify(){
    var nv = document.getElementById("nVerify");
    var name = document.getElementById("nam");
    var reg1 = new RegExp("[\\u4E00-\\u9FFF]+","g");
    var reg2 = new RegExp("[a-zA-Z]","g");
    if(reg1.test(name.value) || reg2.test(name.value)){
        nv.style.visibility = "hidden";
    }else{
        nv.style.visibility = "visible";
    }
}
function icVerify(){
    var ic1 = document.getElementById("ic1");
    var ic2 = document.getElementById("ic2");
    var pv1 = document.getElementById("picVerify1");
    var pv2 = document.getElementById("picVerify2");
    if(ic1.value == ""){
        pv1.style.visibility = "visible";
    }
    else{
        pv1.style.visibility = "hidden";
    }
    if(ic2.value == ""){
        pv2.style.visibility = "visible";
    }
    else{
        pv2.style.visibility = "hidden";
    }
}
function register(){
    var pv = document.getElementById("pVerify");
    var pnNull = document.getElementById("pNumNull");
    var pv1 = document.getElementById("picVerify1");
    var pv2 = document.getElementById("picVerify2");
    var nv = document.getElementById("nVerify");
    var fuxuan = document.getElementById("fuxuan");
    if(pv.style.visibility == "visible" || pnNull.style.visibility == "visible" ||pv1.style.visibility == "visible" ||pv2.style.visibility == "visible" ||nv.style.visibility == "visible" ||!fuxuan.checked){
        alert("全部填写");
    }
}
function judge() {
    var city1 = document.getElementById("city1");
    var homemianji = document.getElementById("homemianji");
    var huxing = document.getElementById("huxing");
    var ting = document.getElementById("ting");
    var yangtai = document.getElementById("yangtai");
    var wei = document.getElementById("wei");
    var chu = document.getElementById("chu");
    var baseCheck = document.getElementById("baseCheck");
    var dateCheck = document.getElementById("dateCheck");
    var begindate = document.getElementById("begindate");
    var enddate = document.getElementById("enddate");
    var photo = document.getElementById("photo");
    var photoCheck= document.getElementById("photoCheck");
    if (wei.value==""||huxing.value==""||ting.value==""||yangtai.value==""||chu.value==""){
        baseCheck.style.opacity="1";
    }
    if (homemianji.value==""){
        cityCheck.style.opacity="1";
    }
    if (begindate.value==""||enddate.value=="") {
        dateCheck.style.opacity="1";
    }
    if (photo.value=="") {
        photoCheck.style.opacity="1";
    }
}
function judge1() {
    var city = document.getElementById("city");
    var cityCheck1 = document.getElementById("cityCheck1");
    var begindate1 = document.getElementById("begindate");
    var enddate1 = document.getElementById("enddate");
    var dateCheck1 = document.getElementById("dateCheck1");
    var hostPhoto = document.getElementById("hostPhoto");
    var hostphotoCheck= document.getElementById("hostphotoCheck");
    if (hostPhoto.value=="") {
        hostphotoCheck.style.opacity="1";
    }
    if (begindate1.value==""||enddate1.value=="") {
        dateCheck1.style.opacity="1";
    }
    if (city.value==""){
        cityCheck1.style.opacity="1";
    }

}
function check1(x) {
    var city = document.getElementById("city");
    var cityCheck1 = document.getElementById("cityCheck1");
    if (x==1){
        if(!/^[\u4e00-\u9fa5]+$/gi.test(city.value)){
            cityCheck1.style.opacity="1";
        }
        else{
            cityCheck1.style.opacity="0";
        }
    }

}
function check(x){
    var city1 = document.getElementById("city1");
    var cityCheck = document.getElementById("cityCheck");
    var homemianji = document.getElementById("homemianji");
    var baseCheck = document.getElementById("baseCheck");
    var huxing = document.getElementById("huxing");
    var ting = document.getElementById("ting");
    var yangtai = document.getElementById("yangtai");
    var wei = document.getElementById("wei");
    var chu = document.getElementById("chu");
    if (x==1){
        if(!/^[\u4e00-\u9fa5]+$/gi.test(city1.value)){
            cityCheck.style.opacity="1";
        }
        else{
            cityCheck.style.opacity="0";
        }
    }
    else if (x==2){
        if(!/^[0-9]*$/gi.test(homemianji.value)||homemianji.value==""){
            baseCheck.style.opacity="1";
        }
        else{
            baseCheck.style.opacity="0";
        }
    }
    else if (x==3){
        if(!/^[0-9]*$/gi.test(homemianji.value)||ting.value==""){
            baseCheck.style.opacity="1";
        }
        else{
            baseCheck.style.opacity="0";
        }
    }
    else if (x==4){
        if(!/^[0-9]*$/gi.test(homemianji.value)||yangtai.value==""){
            baseCheck.style.opacity="1";
        }
        else{
            baseCheck.style.opacity="0";
        }
    }
    else if (x==5){
        if(!/^[0-9]*$/gi.test(homemianji.value)||chu.value==""){
            baseCheck.style.opacity="1";
        }
        else{
            baseCheck.style.opacity="0";
        }
    }
}
function remove(){
    var img1 = document.getElementById('fang1');
    var img2 = document.getElementById('fang2');
    img1.style.marginLeft="-630px";
    img2.style.marginLeft="20px";
}
function remove1(){
    var img1 = document.getElementById('fang1');
    var img2 = document.getElementById('fang2');
    img1.style.marginLeft="20px";
    img2.style.marginLeft="650px";
}
function xianshi(){
    var left = document.getElementById('left');
    var right = document.getElementById('right');
    left.style.display="block";
    right.style.display="block";
}
function yin(){
    var left = document.getElementById('left');
    var right = document.getElementById('right');
    left.style.display="none";
    right.style.display="none";
}
function show1(){
    var all = document.getElementById('all');
    all.style.display="block";
}
function show2(){
    var all1 = document.getElementById('all1');
    all1.style.display="block";
}
function show3(){
    var all3 = document.getElementById('all3');
    all3.style.display="block";
}
function show4(){
    var all4 = document.getElementById('all4');
    all4.style.display="block";
}
function show5(){
    var all5 = document.getElementById('all5');
    all5.style.display="block";
}
function huiyuan(){
	window.open("login.jsp");   
}
function hidden1(){
    var all = document.getElementById('all');
    var all1 = document.getElementById('all1');
    var all2 = document.getElementById('all2');
    var all3 = document.getElementById('all3');
    var all4 = document.getElementById('all4');
    var all5 = document.getElementById('all5');
    all.style.display="none";
    all1.style.display="none";
    all2.style.display="none";
    all3.style.display="none";
    all4.style.display="none";
    all5.style.display="none";
}
function newchuangkou(){
    window.open("manageLode.html");
}
function up(x){
    var j1=document.getElementById('j11');
    var j2=document.getElementById('j21');
    var j3=document.getElementById('j31');
    var j4=document.getElementById('j41');
    var j5=document.getElementById('j51');
    var j6=document.getElementById('j61');
    var j7=document.getElementById('j71');
    var j8=document.getElementById('j81');
    var j9=document.getElementById('j91');
    var j10=document.getElementById('j101');
    if (x==1) {
        j1.style.marginTop="-99px";
        //j1.style.marginTop="-50px";
    }
    if (x==2) {
        j2.style.marginTop="-99px";
        //j2.style.marginTop="-50px";
    }
    if (x==3) {
        j3.style.marginTop="-99px";
        //j3.style.marginTop="-50px";
    }
    if (x==4) {
        j4.style.marginTop="-99px";
        //j4.style.marginTop="-50px";
    }
    if (x==5) {
        j5.style.marginTop="-99px";
        //j5.style.marginTop="-50px";
    }
    if (x==6) {
        j6.style.marginTop="-99px";
        //j6.style.marginTop="-50px";
    }
    if (x==7) {
        j7.style.marginTop="-99px";
        //j3.style.marginTop="-50px";
    }
    if (x==8) {
        j8.style.marginTop="-99px";
        //j4.style.marginTop="-50px";
    }
    if (x==9) {
        j9.style.marginTop="-99px";
        //j5.style.marginTop="-50px";
    }
    if (x==10) {
        j10.style.marginTop="-99px";
        //j6.style.marginTop="-50px";
    }
}
function down(x){
    var j1=document.getElementById('j11');
    var j2=document.getElementById('j21');
    var j3=document.getElementById('j31');
    var j4=document.getElementById('j41');
    var j5=document.getElementById('j51');
    var j6=document.getElementById('j61');
    var j7=document.getElementById('j71');
    var j8=document.getElementById('j81');
    var j9=document.getElementById('j91');
    var j10=document.getElementById('j101');
    if (x==1) {
        j1.style.marginTop="0";
        //j1.style.marginTop="-50px";
    }
    if (x==2) {
        j2.style.marginTop="0";
        //j2.style.marginTop="-50px";
    }
    if (x==3) {
        j3.style.marginTop="0";
        //j3.style.marginTop="-50px";
    }
    if (x==4) {
        j4.style.marginTop="0";
        //j4.style.marginTop="-50px";
    }
    if (x==5) {
        j5.style.marginTop="0";
        //j5.style.marginTop="-50px";
    }
    if (x==6) {
        j6.style.marginTop="0";
        //j6.style.marginTop="-50px";
    }
    if (x==7) {
        j7.style.marginTop="0";
        //j3.style.marginTop="-50px";
    }
    if (x==8) {
        j8.style.marginTop="0";
        //j4.style.marginTop="-50px";
    }
    if (x==9) {
        j9.style.marginTop="0";
        //j5.style.marginTop="-50px";
    }
    if (x==10) {
        j10.style.marginTop="0";
        //j6.style.marginTop="-50px";
    }
}
function scrollchange(x){
    if (x==1) {
        var step =710;
        document.documentElement.scrollTop = document.body.scrollTop = step;
    }
    if (x==2) {
        var step =1450;
        document.documentElement.scrollTop = document.body.scrollTop = step;
    }
    if (x==3) {
        var step =2920;
        document.documentElement.scrollTop = document.body.scrollTop = step;
    }
    if (x==4) {
        var step =3990;
        document.documentElement.scrollTop = document.body.scrollTop = step;
    }
    if (x==5) {
        var step =4550;
        document.documentElement.scrollTop = document.body.scrollTop = step;
    }
}
window.onscroll = function(){
    var t = document.documentElement.scrollTop || document.body.scrollTop;
    var title = document.getElementById( "title" );
    var l1 = document.getElementById( "l1" );
    var l2 = document.getElementById( "l2" );
    var l3 = document.getElementById( "l3" );
    var l4 = document.getElementById( "l4" );
    var l5 = document.getElementById( "l5" );
    if( t >= 533&&t<1110 ) {
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l1.style.color="#00d8ff";
        l2.style.color="#aaa";
        l1.hover="#707070";
        l3.style.color="#aaa";
        l4.style.color="#aaa";
        l5.style.color="#aaa";
    }
    else if(t<533){
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l1.style.color="#aaa";
        l2.style.color="#aaa";
        l3.style.color="#aaa";
        l4.style.color="#aaa";
        l5.style.color="#aaa";
    }
    else if(t>=1110&t<2450){
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l2.style.color="#00d8ff";
        l1.style.color="#aaa";
        l3.style.color="#aaa";
        l4.style.color="#aaa";
        l5.style.color="#aaa";
    }
    else if (t>=2450&&t<3350) {
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l3.style.color="#00d8ff";
        l1.style.color="#aaa";
        l4.style.color="#aaa";
        l2.style.color="#aaa";
        l5.style.color="#aaa";

    }
    else if (t>=3350&&t<3950) {
        var t1= document.getElementById('t11');
        var t2= document.getElementById('t21');
        var t3= document.getElementById('t31');
        var t4= document.getElementById('t41');
        t1.style.width="1070px";
        t2.style.width="100px";
        t3.style.width="800px";
        t4.style.width="960px";
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l4.style.color="#00d8ff";
        l1.style.color="#aaa";
        l2.style.color="#aaa";
        l3.style.color="#aaa";
        l5.style.color="#aaa";

    }
    else if (t>=3950) {
        l1.onmouseover=function(){
            l1.style.color="#00d8ff";
        }
        l1.onmouseout=function(){
            l1.style.color="#aaa";
        }
        l2.onmouseover=function(){
            l2.style.color="#00d8ff";
        }
        l2.onmouseout=function(){
            l2.style.color="#aaa";
        }
        l3.onmouseover=function(){
            l3.style.color="#00d8ff";
        }
        l3.onmouseout=function(){
            l3.style.color="#aaa";
        }
        l4.onmouseover=function(){
            l4.style.color="#00d8ff";
        }
        l4.onmouseout=function(){
            l4.style.color="#aaa";
        }
        l5.onmouseover=function(){
            l5.style.color="#00d8ff";
        }
        l5.onmouseout=function(){
            l5.style.color="#aaa";
        }
        title.style.background = "#fff";
        l5.style.color="#00d8ff";
        l4.style.color="#aaa";
        l1.style.color="#aaa";
        l2.style.color="#aaa";
        l3.style.color="#aaa";

    }
}