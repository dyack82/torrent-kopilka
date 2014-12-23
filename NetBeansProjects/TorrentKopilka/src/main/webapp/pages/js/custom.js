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
                
                for (var tmp in data) {
                    if(data[tmp].name){             $(".name").eq(tmp).text(data[tmp].name); }
                    var n = $(".name").eq(tmp).text();
                    if(data[tmp].originalName){     $(".name").eq(tmp).text(n + '/' + data[tmp].originalName); }
                    if(data[tmp].id){               $(".category").eq(tmp).text('id = ' + data[tmp].id + '  tmp = ' + tmp);}
                    if(data[tmp].released){         $(".released").eq(tmp).text(data[tmp].released);}
                    if(data[tmp].country){          $(".country").eq(tmp).text(data[tmp].country);}
                    if(data[tmp].genre){            $(".genre").eq(tmp).text(data[tmp].genre);}
                    if(data[tmp].regisser){         $(".regisser").eq(tmp).text(data[tmp].regisser);}
                    if(data[tmp].acters){           $(".acters").eq(tmp).text(data[tmp].acters);}
                    if(data[tmp].age_viewers){      $(".age_viewers").eq(tmp).text(data[tmp].age_viewers);}
                    if(data[tmp].time_duration){    $(".time_duration").eq(tmp).text(data[tmp].time_duration);}
                    
                    if(data[tmp].images){    $('#posts img').eq(tmp).attr('src', data[tmp].images); }
                }
            }
        });
    });
    
    
//                                                               
//                                                    
//                                                    <h3 class="acters">---</h3>
//                                                    <h3 class="age_viewers">---</h3>
//                                                    <h3 class="time_duration">---</h3>
    
    
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



