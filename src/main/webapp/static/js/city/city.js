(function (window) {


    function init() {
        $.ajax({
            url: '/city/findCityAndProvinceList',
            type: 'post',
            async: false,
            dataType: "json",
            success: function (data) {
                if(data.code == 200){
                    var val = data.data;
                    var html = '';
                    for(var i = 0,len = val.length;i<len;i++){
                        var cityList = val[i].cityList;
                        var b = '';
                        for(var a = 0,lens = cityList.length;a<lens;a++){
                            if(a==0){
                                b += cityList[a].name;
                            }else {
                                b += '、'+cityList[a].name;
                            }
                        }
                        html += '<tr><td>'+val[i].name+'</td><td>'+b+'</td></tr>';
                    }
                    $('#table').empty().append(html);
                }else {
                    alert("异常")
                }
            }
        });
    }

    window.page = {
        init: function () {
            init();
        },
    };
})(window);