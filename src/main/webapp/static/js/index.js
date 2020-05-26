$(function () {
  ajaxLibraryAll();
  //ajaxBookInfoALL();
});

function ajaxLibraryAll() {
    $.ajax({
       url:'main/selectLibraryAll',
        type:'POST',
        success:function (result) {
            var showMenu=$('#menu');
            for(var menu in result.data){
                var li = $('<li class="dropdown"></li>');
                $(li).append("<a href=\"javascript:void(0);\" id='' onclick='findBookInfoByID("+result.data[menu].bId+");'><img src=\"static/images/menu-icon1.png\" alt=\"menu-icon1\" />"+result.data[menu].bName+"</a>").appendTo(showMenu);
            }
        },
        error:function (result) {
            alert("error");
        }
    });
}

/*
function ajaxBookInfoALL() {
    $.ajax({
        url:'/main/selectBookInfoAll',
        type:'POST',
        success:function (result) {
            var showMenu=$('#center_boom');
            for(var menu in result.data){
                var img=document.createElement("img");
                img.src="/upload/"+result.data[menu].bookImg;
                var div1 =$('<div class="col-xs-12 col-sm-6 col-md-4"></div>');
                var div2=$('<div class="pro-text text-center"></div>');
                div2.appendTo(div1);
                var div3=$('<div class="pro-img"></div>');
                $(div3).append(img);
                div3.appendTo(div2);
                var div4=$('<div class="pro-text-outer"></div>');
                $(div4).append("<span>"+result.data[menu].bookName+"</span>")
                    .append("<a href='#'><h4>"+result.data[menu].bookMsg+"</h4></a>")
                    .append("<p class=\"wk-price\">"+"$"+result.data[menu].bookPrice+" </p> ")
                    .append("<a href=\"#\" class=\"add-btn\">购买</a>").appendTo(div3);
                div1.appendTo(showMenu);
            }
        },
        error:function (result) {
            alert("error");
        }
    });
}*/
