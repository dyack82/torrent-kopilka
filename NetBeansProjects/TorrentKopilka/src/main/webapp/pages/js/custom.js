$(function () {

		for(var i=0;i<4;i++){
			var post = $('#clone').clone();                 
			$('#posts').append(post);     
		}


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
                console.log(data);
//                var result;
                for (var tmp in data) {
//                    document.write(tmp + " : " + data[tmp].name + "<br>")
//                }
//                    result = 'id = ' + data[tmp].id + ', name = ' + data[tmp].name + ', released = ' + data[tmp].released + ', ';
//                    $("#result_all").text(result).css({background: 'cyan'});
                    $(".name").eq(tmp).text(data[tmp].name + ' / original name');
//                    $(".category").eq(tmp).text(data[tmp].);
                    $(".released").eq(tmp).text(data[tmp].released);
                    $(".country").eq(tmp).text(data[tmp].country);
                    $(".genre").eq(tmp).text(data[tmp].genre);
                    $(".regisser").eq(tmp).text(data[tmp].regisser);
//                    $(".acters").eq(tmp).text(data[tmp].);
                }
            }
        });
    });
    
    
//                     
//
//
//          
//
//                        @Column(name = "age_viewers")
//                        private String age_viewers;
//
//                        @Column(name = "time_duration")
    
    
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



