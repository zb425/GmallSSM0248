//注意：若将代码写到$(function(){})中，则里面的所有方法都不是全局的，故此a标签中的onclick调用不到里面的方法！！！。
//总记录数
var totalNum = 0;

var temp=true;

//总页数
var totalPage = 0;

//默认每页显示数
var avageNum = 9;

var tem;

//默认显示第一页
var currentPage = 1;

var textNum=0;

var textName="";

var id="";

var totalPrice;

var bookName;

var bookId;

var comeBackId;


getUserList(currentPage,avageNum,textNum,textName);
//initPagination(totalNum,totalPage);
getBookInfoAll();

//与后台交互获取数据，异步加载到页面上
function getUserList(pageNum,pageSize,text,textName){
    currentPage = pageNum;
    textNum=text;
    textName=textName;
    $.ajax({
        url:"main/selectBookInfoAll",
        method:"post",
        data:{"pageNum":pageNum,"pageSize":pageSize,"text":textNum,"textName":textName},
        async:false,
        success:function(result){
            var showMenu=$('#center_boom').html(" ");
            /*var div6=$('<li class="breadcrumb-item"><a href="javascript:void(0);"><h3>《图书列表》</h3></a></li>');
            div6.appendTo(showMenu);*/
            for(var menu in result.data){
                var img=document.createElement("img");
                img.src="upload/"+result.data[menu].bookImg;
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
                    .append("<a href='javascript:void(0);' class=\"add-btn\" onclick=\"addCookie('"+result.data[menu].bookId+"');\">加入购物车</a>\t\t\t")
                    .append("<span>\t\t\t\t\t</span>")
                    .append("<a href=\"javascript:void(0);\" class=\"add-btn\" onclick=\"checkBooOut('"+result.data[menu].bookId+"','"+result.data[menu].bookPrice+"','"+result.data[menu].bookName+"');\">购买</a>").appendTo(div3);
                div1.appendTo(showMenu);
            }
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function checkBooOut(book_id,price,name) {
    totalPrice=price;
    bookName=name;
    bookId=book_id;
    if (id ==""||id ==null){
        $('#loginModel').modal('show');
    }else{
        if (confirm("收货地址是否选择默认的?")){
            returnPay();
            $('#checkOutModel').modal('show');
        }else{
            //$('#add_Id').val(book_id);
            $('#addressModel').modal('show');
        }
    }
   // alert(book_id);
}

function closeAddressModel() {
    $('#addressModel').modal('hide');
}

function addressAdd() {
    var userForm=new FormData($('#addressForm')[0]);
        $.ajax({
            url:'addressAdd',
            type:'post',
            data:userForm,
            processData : false,
            contentType : false,
            success:function (result) {
                alert("success");
                $('#addressModel').modal('hide');
                returnPay();
                $('#checkOutModel').modal('show');
            },
            error:function (result) {
                alert("error");
            }
        });
}

function payCheckOut() {
    var oPay = $('#oPay').val();
    var payInterface = $('#payInterface').val();
    //alert(oPay+" "+payInterface);
    if (oPay==payInterface){
        var bookName=$('#bookName').val();
        var oTotal=$('#oTotal').val();
        var oDiscount=$('#oDiscount').val();
        var oPay=$('#oPay').val();
        //alert(bookName+" "+oTotal+" "+oDiscount+" "+oPay);
        $.ajax({
            url:'addOrderLibrary',
            type:'post',
            data:{"bookName":bookName,"oTotal":oTotal,"oDiscount":oDiscount,"oPay":oPay,"bookId":bookId,"u_id":id},
            success:function (result) {
                alert("success");
                $('#checkOutModel').modal('hide');
            },
            error:function (result) {
                alert("error");
            }
        });
    }else{
        alert("error");
    }
}

function returnPay() {
    $('#bookName').val(bookName);
    $('#oTotal').val(totalPrice);
    $.ajax({
        url:'getUserDiscount',
        type:'post',
        data:{"id":id},
        success:function (result) {
          $('#oDiscount').val(result.data);
          $('#oPay').val(totalPrice*(result.data));
        },
        error:function (result) {
            alert("error");
        }
    });

}

function addCookie(book_id) {
    if (id ==""||id ==null){
        $('#loginModel').modal('show');
    }else{
        $.ajax({
            url: "insertCookie",
            method: "post",
            data: {"book_id": book_id, "u_id": id},
            success:function (result) {
                alert("success");
            },
            error:function (result) {
                alert("error");
            }
        });
    }
}

function findOnePage(page) {
    if (temp ==true){
        getUserList(currentPage,avageNum,textNum,textName);
    }else if (temp==false){
        cookieAjax(currentPage,avageNum,id);
    }else if (temp =="#"){
        myOrderAll(currentPage,avageNum);
    }else{
        myAddressAll(currentPage,avageNum);
    }

}
function findFastPage() {
    if (currentPage==1){

        checkA();
    }else if (temp ==true){
        getUserList(currentPage-1,avageNum,textNum,textName);
    }else if (temp==false){
        cookieAjax(currentPage-1,avageNum,id);
    }else if (temp=="#"){
        myOrderAll(currentPage-1,avageNum);
    }else{
        myAddressAll(currentPage-1,avageNum);
    }
}
function findRowsPage(page) {
    if (temp ==true){
        getUserList(page,avageNum,textNum,textName);
    }else if (temp==false){
        cookieAjax(page,avageNum,id);
    }else if (temp =="#"){
        myOrderAll(page,avageNum);
    }else{
        myAddressAll(page,avageNum);
    }

}

function findNextPage() {
    if (currentPage==totalPage){
        checkA();
    }else if(temp ==true){
        getUserList(currentPage+1,avageNum,textNum,textName);
    }else if (temp ==false){
        cookieAjax(currentPage+1,avageNum,id);
    }else if (temp =="#"){
        myOrderAll(currentPage+1,avageNum);
    }else{
        myAddressAll(currentPage+1,avageNum);
    }
}

function findLastPage() {
    if (temp ==true){
        getUserList(totalPage,avageNum,textNum,textName);
    }else if(temp==false){
        cookieAjax(totalPage,avageNum,id);
    }else if (temp =="#"){
        myOrderAll(totalPage,avageNum);
    }else{
        myAddressAll(totalPage,avageNum);
    }

}

function getBookInfoAll() {
    $.ajax({
        url: "main/getBookInfoAll",
        method: "post",
        success: function (result) {
            totalNum=result.data;
            totalPage=parseInt(totalNum/avageNum)+1;
            //alert(totalNum+" "+totalPage);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function checkA() {
    currentPage == 1 ? $("#prev").addClass("disabled") : $("#prev").removeClass("disabled");
    currentPage == totalPage ? $("#next").addClass("disabled") : $("#next").removeClass("disabled");
}

function findBookInfoByID(id) {
    temp = true;
    getUserList(currentPage,avageNum,id,textName);
}

function btnSearch() {
    temp = true;
    var textName=document.getElementById("textName").value;
    textName=textName;
    getUserList(currentPage,avageNum,textNum,textName);
}

function mainAjax() {
    window.location="http://www.bgamq.com";
}

function registModel() {
    $('#registModel').modal('show');
}

function closeModel() {
    $('#registModel').modal('hide');
}

function registerUser() {
    var userForm=new FormData($('#registForm')[0]);
        $.ajax({
            url: 'registerUser',
            type: 'post',
            data: userForm,
            processData: false,
            contentType: false,
            success: function (result) {
                alert("success");
                //$('#registForm').reset();
                $('#registModel').modal('hide');
            },
            error: function (result) {
               alert("error");
            }
        });
}

function loginModel() {
    var arrcookie=document.cookie;
    var temp=arrcookie.split(";");
    var arr=temp[0].split("=");

    if(arr[1]!=undefined){
        alert("你已登录不需登录!");
    }else{
        $('#loginModel').modal('show');
    }
}

function ajaxUserLogin() {
    var username=$('#username').val();
    var password=$('#password').val();
    $.ajax({
        url: 'loginUser',
        type: 'post',
        data: {"username":username,"password":password},
        success: function (result) {
            if (result.status==200){
                alert("success");
                $('#loginModel').modal('hide');
                var arrcookie=document.cookie;
                var temp=arrcookie.split(";");
                var arr=temp[0].split("=");
                $('#loginUserName').html(arr[1]);
                id = temp[1].split("=")[1];
                getCookieAll(id);
            }else{
                alert("error");
            }

            },
        error: function (result) {
            alert("error");
        }
    });
}

function updatePassword() {
    $('#updateModelPassword').modal('show');
}

function ajaxUpdatePassword() {
    var phone=$('#phone').val();
    var password=$('#newPassword').val();
    $.ajax({
        url: 'upadatePasswordUser',
        type: 'post',
        data: {"phone":phone,"password":password},
        success: function (result) {
            alert("success");
            $('#updateModelPassword').modal('hide');
            var arrcookie=document.cookie;
            var arr=arrcookie.split("=");
            $('#loginUserName').html(arr[1]);
        },
        error: function (result) {
            alert("error");
        }
    });
}

function cookieAjax(currentPage,avageNum,u_id) {
   /* var arrcookie=document.cookie;
    var arr=arrcookie[0].split("=");
    id = arrcookie[1].split("=")[1];*/
    if (id==""||id ==null){
        $('#loginModel').modal('show');
    }else{
        currentPage = currentPage;
        temp = false;
        u_id=id;
        $.ajax({
            url:"main/selectBookInfoCookieAll",
            method:"post",
            data:{"pageNum":currentPage,"pageSize":avageNum,"id":u_id},
            async:false,
            success:function(result){
                $('#center').addClass("shopping-cart");
                var showMenu=$('#center_boom').html(" ");
                var div1 =$('<div class="col-md-12"></div>');
                var div2=$('<h2>You cart items</h2>');
                div2.appendTo(div1);
                var div3=$('<table></table>');
                div3.appendTo(div1);
                var div4=$('<tr>\n' +
                    '\t\t\t\t\t\t\t<th></th>\n' +
                    '\t<th></th>\n' +
                    '\t\t\t\t\t\t\t<th>图书名</th>\n' +
                    '\t\t\t\t\t\t\t<th>描述</th>\n' +
                    '\t\t\t\t\t\t\t<th>价格</th>\n' +
                    '\t\t\t\t\t\t\t<th></th>\n' +
                    '\t\t\t\t\t\t</tr>');
                div4.appendTo(div3);
                for(var menu in result.data){
                    text = "upload/"+result.data[menu].bookImg;
                    var div5=$('<tr>'+'<td>'+'<input type="checkbox" name="tem"/>'+'</td>'+
                        '<td>'+'<img src='+text+'>'+'</td>'+
                        '<td>'+result.data[menu].bookName+'</td>'+
                        '<td>'+result.data[menu].bookMsg+'</td>'+
                        '<td>'+result.data[menu].bookPrice+'</td>'+
                        '<td>'+'<span>'+'<i class="fa fa-times" aria-hidden="true"></i>'+'</span>'+'</td>'+
                        +'</tr>');
                    div5.appendTo(div3);
                }
                var div6=$('<div class="col-sm-6 col-md-6">\n' +
                    '                     <a href="#" onclick="mainShow();" class="button red">继续购物</a>\n' +
                    '                  </div>\n' +
                    '                  <div class="col-sm-6 col-md-6 text-right">\n' +
                    '                     <a href="#" class="button" onclick="checkOut();">结账</a>\n' +
                    '                  </div>');

                div1.appendTo(showMenu);
                div6.appendTo(showMenu);

            }
            ,
            error:function (result) {
                alert("error");
            }
        });
    }

}

function mainShow() {
    window.location.href="http://www.bgamq.com";
}

function getCookieAll(id) {
    $.ajax({
        url: "main/getCookieAll",
        method: "post",
        data:{"id":id},
        success: function (result) {
            totalNum=result.data;
            totalPage=parseInt(totalNum/avageNum)+1;
            //alert(totalNum+" "+totalPage);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function closePayModel() {
    $('#checkOutModel').modal('hide');
}

function myOrderAll(page,avageNum) {
    if (id==""||id ==null){
        $('#loginModel').modal('show');
    }else{
        temp="#";
        currentPage=page;
        getOrderAll();
    $.ajax({
        url:"selectOrderAll",
        method:"post",
        data:{"pageNum":currentPage,"pageSize":avageNum,"id":id},
        async:false,
        success:function(result){
            $('#center').addClass("shopping-cart");
            var showMenu=$('#center_boom').html(" ");
            var div1 =$('<div class="col-md-12"></div>');
            var div2=$('<h2>You Order items</h2>');
            div2.appendTo(div1);
            var div3=$('<table></table>');
            div3.appendTo(div1);
            var div4=$('<tr>\n' +
                '\t\t\t\t\t\t\t<th></th>\n' +
                '\t\t\t\t\t\t\t<th>总价</th>\n' +
                '\t\t\t\t\t\t\t<th>折后价</th>\n' +
                '\t\t\t\t\t\t\t<th>打折</th>\n' +
                '\t\t\t\t\t\t\t<th>状态</th>\n' +
                '\t\t\t\t\t\t\t<th>编号</th>\n' +
                '\t\t\t\t\t\t\t<th>发货状态</th>\n' +
                '\t\t\t\t\t\t\t<th></th>\n' +
                '\t\t\t\t\t\t</tr>');
            div4.appendTo(div3);
            for(var menu in result.data){
               // text = "/upload/"+result.data[menu].bookImg;
                var div5=$('<tr>'+'<td>'+'<input type="checkbox" name="tem"/>'+'</td>'+
                    //'<td>'+'<img src='+text+'>'+'</td>'+
                    '<td>'+result.data[menu].oTotal+'</td>'+
                    '<td>'+result.data[menu].oPay+'</td>'+
                    '<td>'+result.data[menu].oDiscount+'</td>'+'</tr>');
                if(result.data[menu].oState == "1"){
                    $('<td>'+'成功'+'</td>').appendTo(div5);

                }else{
                   /*div5.append('<td>'+'失败'+'</td>')*/
                    $('<td>'+'失败'+'</td>').appendTo(div5);
                }
                $('<td>'+result.data[menu].oWuliucode+'</td>').appendTo(div5);
                if(result.data[menu].oSSstate=="0"){
                    $('<td>'+'未发货'+'</td>').appendTo(div5);
                }else if(result.data[menu].oSSstate=="1"){
                    $('<td>'+'已发货'+'</td>').appendTo(div5);
                }else if(result.data[menu].oSSstate=="2"){
                    $('<td>'+'退货中'+'</td>').appendTo(div5);
                }else if(result.data[menu].oSSstate=="3"){
                    $('<td>'+'退货成功'+'</td>').appendTo(div5);
                }else if(result.data[menu].oSSstate=="4"){
                    $('<td>'+'收货成功'+'</td>').appendTo(div5);
                }
                $('<td>'+'<span>'+'<a href="javascript:void(0);" onclick="comeback('+result.data[menu].oId+','+result.data[menu].bookId+');">删除</a>'+'</span>'+'</td>').appendTo(div5);
                //if(result.data[menu].oSSstate!="4"){
                $('<td>'+'<span>'+'<a href="javascript:void(0);" onclick="returnOrder('+result.data[menu].oId+','+result.data[menu].bookId+','+result.data[menu].oSSstate+');">退货</a>'+'</span>'+'</td>').appendTo(div5);
                $('<td>'+'<span>'+'<a href="javascript:void(0);" onclick="breakBookOrder('+result.data[menu].oId+','+result.data[menu].bookId+','+result.data[menu].oSSstate+');">收货</a>'+'</span>'+'</td>').appendTo(div5);
              //  }
                div5.appendTo(div3);
            }
            var div6=$('<div class="col-sm-6 col-md-6">\n' +
                '                     <a href="#" onclick="mainShow();" class="button red">继续购物</a>\n' +
                '                  </div>\n');

            div1.appendTo(showMenu);
            div6.appendTo(showMenu);

        }
        ,
        error:function (result) {
            alert("error");
        }
    });

    }
}

/*物理删除*/
function comeback(id,book_id) {
    comeBackId=book_id;
    $.ajax({
        url: "main/updateOrderById",
        method: "post",
        data:{"u_id":id,"book_id":comeBackId},
        success: function (result) {
            alert("success");
            myOrderAll(1,9);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

/*退货请求*/
function returnOrder(id,book_id,returnType) {
    comeBackId=book_id;
    if(returnType=="2"){
        alert("你已在退货中....");
    }else if(returnType=="3"){
        alert("你已完成退货....");
    }else if(returnType=="4"){
        alert("你已收货成功....")
    }else {
        $.ajax({
            url: "main/returnOrder",
            method: "post",
            data: {"u_id": id, "book_id": comeBackId},
            success: function (result) {
                alert("success");
                myOrderAll(1, 9);
            }
            ,
            error: function (result) {
                alert("error");
            }
        });
    }
}

function breakBookOrder(id,book_id,breakType) {
    comeBackId=book_id;
    if(breakType=="2"){
        alert("你已在退货中,不可以收货....");
    }else if(breakType=="3"){
        alert("你已完成退货,不可以收货....");
    }else if(breakType=="4"){
        alert("你已收货成功,不需要在此收货....")
    }else{
        $.ajax({
            url: "main/breakBookOrder",
            method: "post",
            data:{"u_id":id,"book_id":comeBackId},
            success: function (result) {
                alert("success");
                myOrderAll(1,9);
            }
            ,
            error:function (result) {
                alert("error");
            }
        });
    }
}

function getOrderAll() {
    $.ajax({
        url: "main/getOrderAll",
        method: "post",
        data:{"u_id":id},
        success: function (result) {
            totalNum=result.data;
            totalPage=parseInt(totalNum/avageNum)+1;
            //alert(totalNum+" "+totalPage);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function myAddressAll(pageAddress,avageNum) {
    if (id==""||id ==null){
        $('#loginModel').modal('show');
    }else {
        temp = "*";
        currentPage = pageAddress;
        getAddressAll();
        $.ajax({
            url: "selectAddressAll",
            method: "post",
            data: {"pageNum": currentPage, "pageSize": avageNum, "id": id},
            async: false,
            success: function (result) {
                $('#center').addClass("shopping-cart");
                var showMenu = $('#center_boom').html(" ");
                var div1 = $('<div class="col-md-12"></div>');
                var div2 = $('<h2>You Address items</h2>');
                div2.appendTo(div1);
                var div3 = $('<table></table>');
                div3.appendTo(div1);
                var div4 = $('<tr>\n' +
                    '\t\t\t\t\t\t\t<th></th>\n' +
                    '\t\t\t\t\t\t\t<th>姓名</th>\n' +
                    '\t\t\t\t\t\t\t<th>电话</th>\n' +
                    '\t\t\t\t\t\t\t<th>邮编</th>\n' +
                    '\t\t\t\t\t\t\t<th>省份</th>\n' +
                    '\t\t\t\t\t\t\t<th>城市</th>\n' +
                    '\t\t\t\t\t\t\t<th>区域</th>\n' +
                    '\t\t\t\t\t\t\t<th>详细地址</th>\n' +
                    '\t\t\t\t\t\t\t<th></th>\n' +
                    '\t\t\t\t\t\t\t<th></th>\n' +
                    '\t\t\t\t\t\t</tr>');
                div4.appendTo(div3);
                for (var menu in result.data) {
                    var div5 = $('<tr>' + '<td>' + '<input type="checkbox" name="tem"/>' + '</td>' +
                        '<td>' + result.data[menu].addName + '</td>' +
                        '<td>' + result.data[menu].addPhone + '</td>' +
                        '<td>' + result.data[menu].addCode + '</td>' +
                        '<td>' + result.data[menu].addProvince + '</td>' +
                        '<td>' + result.data[menu].addCicty + '</td>' +
                        '<td>' + result.data[menu].addArea + '</td>' +
                        '<td>' + result.data[menu].addAdderss + '</td>' +
                        '<td>' + '<span>' + '<a href="javascript:void(0);" onclick="deleteAddress(' + result.data[menu].addId + ');">删除</a>' + '</span>' + '</td>' +
                        '<td>' + '<span>' + '<a href="javascript:void(0);" onclick="checkBock(' + result.data[menu].addId + ');">选择</a>' + '</span>' + '</td>' +
                        +'</tr>');
                    div5.appendTo(div3);
                }
                var div6 = $('<div class="col-sm-6 col-md-6">\n' +
                    '                     <a href="#" onclick="mainShow();" class="button red">继续购物</a>\n' +
                    '                  </div>\n');

                div1.appendTo(showMenu);
                div6.appendTo(showMenu);

            }
            ,
            error: function (result) {
                alert("error");
            }
        });
    }
}

function checkBock(u_id) {
    $.ajax({
        url: "main/updateAddress",
        method: "post",
        data:{"u_id":u_id,"add_id":id},
        success: function (result) {
            alert("success");
            myAddressAll(currentPage,avageNum);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function deleteAddress(id) {
    $.ajax({
        url: "main/deleteAddress",
        method: "post",
        data:{"u_id":id},
        success: function (result) {
            alert("success");
            myAddressAll(currentPage,avageNum);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function getAddressAll() {
    $.ajax({
        url: "main/getAddressAll",
        method: "post",
        data:{"u_id":id},
        success: function (result) {
            totalNum=result.data;
            totalPage=parseInt(totalNum/avageNum)+1;
            //alert(totalNum+" "+totalPage);
        }
        ,
        error:function (result) {
            alert("error");
        }
    });
}

function errorShow() {
    alert("此功能暂未开发！");
}