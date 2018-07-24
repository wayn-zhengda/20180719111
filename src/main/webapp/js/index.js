// (function (){
//  alert("test")
// }());


// $('#all').bind('click',function(){
//  alert("xuanze");
// })

function choose() {
    var tags = $('#testChoose').find('input.tags:checked').length;
    if (tags > 2) {
        alert("最多选择2个");
        this.prop('checked',false);
        return;
    }
}

// function test() {
//     alert("test");
// }
//
// cars=["BMW","Volvo","Saab","Ford"];
// var i=0;
// for (;cars[i];)
// {
//     document.write(cars[i] + "<br>");
//     i++;
// }

function testTime() {
    var t = new Date();
    var h = t.getHours();
    var m = t.getMinutes();
    var s = t.getSeconds();
    m = check(m);
    s = check(s);
    document.getElementById('timer').innerHTML=h+":"+m+":"+s;
    x = setTimeout('testTime()',500)
}
function check(i) {
    if (i<10){
        return("0"+i);
    }
    return i;
}

(function () {
    var i = Math.random()*10000;
     i = Math.round(i);
    alert(i)
})