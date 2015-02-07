$(function () {

    for (var i = 0; i < 4; i++) {
        var country = $('#country').clone();
        $('#countrys').append(country);
    }

    for (var i = 0; i < 4; i++) {
        var genre = $('#genre').clone();
        $('#genres').append(genre);
    }

    $('button').click(function () {
        var JSONObject = {
            'name': $("#name").val(),
            'originalName': $("#originalName").val(),
            'ageGroup': $("#ageGroup").val(),
            'duration': $("#duration").val(),
            'description': $("#description").val(),
            'releaseDate': $("#releaseDate").val(),
            'category': $("#category").val(),
            'ratingSum': $("#ratingSum").val(),
            'ratingCount': $("#ratingCount").val(),
            'ratingKinopoisk': $("#ratingKinopoisk").val(),
            'trailerLink': $("#trailerLink").val(),
            'trailerDescription': $("#trailerDescription").val(),
            'country1': $("#country").val(),
            'country2': $("#country +").val(),
            'country3': $("#country ++").val(),
            'country4': $("#country +++").val(),
            'country5': $("#country ++++").val(),
            'genre1': $("#genre").val(),
            'genre2': $("#genre +").val(),
            'genre3': $("#genre ++").val(),
            'genre4': $("#genre +++").val(),
            'genre5': $("#genre ++++").val(),
            'producer1': $("#producer1").val(),
            'producer2': $("#producer2").val(),
            'producer3': $("#producer3").val(),
            'acter1': $("#acter1").val(),
            'acter2': $("#acter2").val(),
            'acter3': $("#acter3").val(),
            'acter4': $("#acter4").val(),
            'acter5': $("#acter5").val(),
            'acter6': $("#acter6").val(),
            'acter7': $("#acter7").val(),
            'acter8': $("#acter8").val(),
            'acter9': $("#acter9").val(),
            'acter10': $("#acter10").val()
        };

        $.ajax({
            type: 'PUT',
            url: 'newCont', // prefix
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: true,
            success: function (result) {
                console.log('Error!-----' + data);
                alert('Error!-----' + data.toString());
            },
            error: function (jqXHR) {
                console.log('Error!+++++' + jqXHR);
                alert('Error!+++++' + jqXHR.toString()); 
            }
        });
    });


});





//		for(var i=0;i<4;i++){
//			var post = $('#clone').clone();                 
//			$('#posts').append(post);     
//		}


//    $('#search').click(function () {              // search content
//        var inputText = $("#input_name").val();
//        $.ajax({
//            url: 'searchContent',
//            type: 'GET',
//            dataType: 'json',
//            contentType: 'application/json',
//            mimeType: 'application/json',
//            data: ({
//                text: inputText
//            }),
//            success: function (data) {
//                var result = 'id = ' + data.id + ', name = ' + data.name + ', released = ' + data.released + ' !!!';
//                $("#result_text").text(result).css({background: 'blue'});
//            }
//        });
//    });


//    $('#getAll').click(function () {
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
//                console.log(data);
//                
//                for (var tmp in data) {
//                    if(data[tmp].name){             $(".name").eq(tmp).text(data[tmp].name); }
//                    var n = $(".name").eq(tmp).text();
//                    if(data[tmp].originalName){     $(".name").eq(tmp).text(n + '/' + data[tmp].originalName); }
//                    if(data[tmp].id){               $(".category").eq(tmp).text('id = ' + data[tmp].id + '  tmp = ' + tmp);}
//                    if(data[tmp].release_date){         $(".released").eq(tmp).text(data[tmp].release_date);}
//                    if(data[tmp].country){          $(".country").eq(tmp).text(data[tmp].country);}
//                    if(data[tmp].genre){            $(".genre").eq(tmp).text(data[tmp].genre);}
//                    if(data[tmp].regisser){         $(".regisser").eq(tmp).text(data[tmp].regisser);}
//                    if(data[tmp].acters){           $(".acters").eq(tmp).text(data[tmp].acters);}
//                    if(data[tmp].age_group){      $(".age_viewers").eq(tmp).text(data[tmp].age_group);}
//                    if(data[tmp].time_duration){    $(".time_duration").eq(tmp).text(data[tmp].time_duration);}
//                    
//                    if(data[tmp].images){    $('#posts img').eq(tmp).attr('src', data[tmp].images); }
//                }
//            }
//        });
//    });


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



