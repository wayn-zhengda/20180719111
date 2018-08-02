const dragCon = document.getElementById('drag-wrap');
dragCon.addEventListener('dragstart',startDrag,false);
dragCon.addEventListener('dragover',function (e) {
    e.preventDefault();
},false);
dragCon.addEventListener('drop',exchangeElement,false);

function startDrag(e) {
    alert("startDrag");
    e.dataTransfer.setData('Text',e.target.id + ';'+ e.target.parentElement.id);
}

function exchangeElement(e) {
    e.preventDefault();
    const el = e.target;
    let PE,
        CE;
    if (el.tagName.toLowerCase() !== 'div') {
        PE = el.parentElement;
        CE = el;
    } else {
        PE = el;
        CE = el.querySelector('img');
    }

    /**
     * 判断不在控制范围内
     */
    if (!PE.classList.contains('item')) {
        return;
    }
    const data = e.dataTransfer.getData('Text').split(';');
    //交换元素
    document.getElementById(data[1]).appendChild(CE);
    PE.appendChild(document.getElementById(data[0]));
}