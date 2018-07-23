// (function (){
//  alert("test")
// }());


// $('#all').bind('click',function(){
//  alert("xuanze");
// })

function choose(dom) {
    var tags = $('#testChoose').find('input.tags:checked').length;
    alert(tags);
    if (tags > 2) {
        alert("最多选择2个");
        dom.prop('checked',false);
        return;
    }
}

function test() {
    alert("test");
}
