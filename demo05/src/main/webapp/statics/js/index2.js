$(document).ready(function () {
    cha();
})
function cha() {
    $(".tia").remove();
    $.post("/doIndex",function(resoult){
        $.each(resoult.data,function (i,v) {
            var $tr = $("<tr class='tia' align='center'><td><a href='/toupdate?sid="+v.sid+"'>"+v.sid+"</a></td><td>"+v.sname+"</td><td>"+v.sgender+"</td><td>"+v.sage+"</td><td>"+v.saddress+"</td><td>"+v.semail+"</td></tr>");
            console.log($tr)
            $(".table-fenye").append($tr);
        })
    },"json");
}