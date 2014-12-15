$(function () {


    $('#search').click(function () {              // search content
        var inputText = $("#input_name").val();
        $.ajax({
            url: 'searchContent',
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json',
            mimeType: 'application/json',
            data: ({
                text: inputText
            }),
            success: function (data) {
                var result = 'id = ' + data.id + ', name = ' + data.name + ', released = ' + data.released + ' !!!';
                $("#result_text").text(result).css({background: 'blue'});
            }
        });
    });

    $('#getAll').click(function () { 
//        var inputText = $("#input_str").val();
        $.ajax({
            url: 'getAll',
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json',
            mimeType: 'application/json',
            data: ({
                text: "inputTextS"
            }),
            success: function (data) {
                var result = 'id = ' + data.id + ', name = ' + data.name + ', released = ' + data.released + ', ';
                $("#result_all").text(result).css({background: 'cyan'});
                $(".name").text("Name : " + data.name);
                $(".released").text('Released : ' + data.released);
            }
        });
    });
    
//        $('#getAll').click(function () { 
////        var inputText = $("#input_str").val();
//        $.ajax({
//            url: 'getAll',
//            type: 'GET',
//            dataType: 'json',
//            contentType: 'application/json',
//            mimeType: 'application/json',
//            data: ({
//                text: "inputTextS"
//            }),
//            success: function (data) {
//                var result = 'id = ' + data.id + ', name = ' + data.name + ', released = ' + data.released + ', ';
//                $("#result_all").text(result).css({background: 'cyan'});
//                $(".name").text("Name : " + data.name);
//                $(".released").text('Released : ' + data.released);
//            }
//        });
//    });








});
//    $('#getForecast').click(function () {
//      $.ajax({
//        url: 'film/titanic',
//        data: ({resp : "re"}),
//        success: function(data) {
//          $('.block').html(data).css({background: 'pink'});
//          
//          alert(r);
//        }
//      };

//    });
//    $('#getForecast').click( function() {
//        var data = { controller: "film", parametr: "all", backgroung: "yellow" };
//      $.get( "film", success, "html" );
//    } );
// 
//    function success( data ) {
//
//    $('body').css({                  
//        background: 'blue'
//    });
//
//    
//    alert(data.name);
// 
//   };



