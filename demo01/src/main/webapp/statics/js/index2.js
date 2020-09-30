$(document).ready(function () {
    cha();
    $(".tianjia").click(function () {
        location.href="/toIndex2";
    });
    
})

function cha() {

    $(".tia").remove();
    $.post("/doIndex",function(resoult){
        $.each(resoult.data,function (i,v) {
            console.log(resoult.list)
            var $tr = $("<tr class='tia' align='center'><td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.sex+"</td><td>"+v.age+"</td><td>"+v.rank+"</td><td>"+v.department+"</td><td><a href='javascript:void(0)' class='shan'>删除</a></td></tr>");
            console.log($tr)
            $(".student").append($tr);
        })

        $(".shan").click(function () {
            var id = $(this).parent().prev().prev().prev().prev().prev().prev().text();
            var json2 = {
                id : id
            }
            $.post("/doDel",json2,function (result) {
                if(result.data>0){
                    alert("删除成功");
                    cha();
                }else{
                    alert("删除失败")
                }
            },"json")
        });
    },"json");
}