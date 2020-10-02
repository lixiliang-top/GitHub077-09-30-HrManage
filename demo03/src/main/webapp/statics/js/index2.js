$(document).ready(function () {
    cha();
    $(".jizhang").click(function () {
        location.href="/toIndex2";
    });

    $(".chaxun").click(function () {
        cha();
    });

    $.post("/doIndexXia",function (resout) {
        $.each(resout.data,function (i,v) {
            var $option = $("<option value='"+v.id+"'>"+v.bname+"</option>");
            $(".jieyue").append($option);
        })
    },"json");

})
var $tr;
function cha() {
    $(".tia").remove();

    var assetstype = $(".jieyue").val();
    console.log(assetstype)

    var json = {
        type_id : assetstype
    }

    $.post("/doIndex",json,function(resoult){
        $.each(resoult.data,function (i,v) {
            console.log(v)
            if(v.typeId==2||v.typeId==3){
                $tr = $("<tr class='tia' align='center'><td>"+v.title+"</td><td>"+v.billTime+"</td><td>"+v.bname+"</td><td>'+'"+v.price+"</td><td>"+v.bexplain+"</td></tr>");
            }else{
                $tr = $("<tr class='tia' align='center'><td>"+v.title+"</td><td>"+v.billTime+"</td><td>"+v.bname+"</td><td>'-'"+v.price+"</td><td>"+v.bexplain+"</td></tr>");
            }

            $(".table-fenye").append($tr);
        })
    },"json");
}