$(document).ready(function () {
    cha();
    $(".tianjia").click(function () {
        location.href="/toIndex2";
    });

    $(".chaxun").click(function () {
        cha();
    });
    
})

function cha() {
    $(".tia").remove();

    var assetsid = $(".mingcheng").val();
    var assetstype = $(".jieyue").val();
    console.log(assetsid)
    console.log(assetstype)

    var json = {
        assetsid : assetsid,
        assetstype : assetstype
    }

    $.post("/doIndex",json,function(resoult){
        console.log(resoult.data)
        $.each(resoult.data,function (i,v) {
            console.log(v)
            var $tr = $("<tr class='tia' align='center'><td>"+v.assetsid+"</td><td>"+v.assetsname+"</td><td>"+v.assetstype+"</td><td>"+v.intodate+"</td></tr>");
            console.log($tr)
            $(".table-fenye").append($tr);
        })
    },"json");
}