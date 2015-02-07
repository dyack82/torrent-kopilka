$(function () {

    for (var i = 0; i < 4; i++) {
        var post = $('#clone').clone();
        $('#posts').append(post);
    }

    for (var i = 0; i < 4; i++) {
        var $top = $('#top').clone();
        $('#sidebar').append($top);
    }


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


    $('#getLast').click(function () {
//        var inputText = $("#input_str").val();
        $.ajax({
            url: 'findLastAdded/3',
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json; charset=windows-1251',
            mimeType: 'application/json',
//            data: ({
//                count: "2"
//            }),
            async: true,
            success: function (data) {
      console.log(data);
                var countElements = data.numberOfElements;
                var arrNemes = "";
//                var genres = "";
//                var producers = "";
//                var
//                console.log("= = " + data.content[0].countrys[0].id);
                
//                $(".name").eq(0).text(data.content[0].name);

//                    for (var tmp in data.content[0].countrys) {
//                            console.log("= = " + data.content[0].countrys[tmp].name);
//                    }
                    
                    //for (var tmp in data) {
//                    if (data[tmp].name) {
                
                for (var i = 0; i<countElements;i++) {
//                    console.log("= = " + i);
                    if (data.content[i].name) {
                        $(".name").eq(i).text(data.content[i].name + ' / ' + data.content[i].originalName);
                        $(".imageContent").eq(i).attr('src', 'pages/images/'+ data.content[i].imagePrefix + '/' + data.content[i].originalName + '.jpg');
                    }
                    if (data.content[i].category.name) {
                        $(".category").eq(i).text(data.content[i].category.name);
                    }
                    if (data.content[i].releaseDate) {
                        $(".released").eq(i).text(data.content[i].releaseDate);
                    }
                    if (data.content[i].countrys) {
                        arrNemes = "";
                            for (var tmp in data.content[i].countrys) {
                                arrNemes += data.content[i].countrys[tmp].name + ", ";
                            }                       
                        $(".country").eq(i).text(arrNemes.slice(0, -2));
                    }
                    if (data.content[i].genres) {
                        arrNemes = "";
                            for (var tmp in data.content[i].genres) {
                                arrNemes += data.content[i].genres[tmp].name + ", ";
                            }                       
                        $(".genre").eq(i).text(arrNemes.slice(0, -2));
                    }
                    if (data.content[i].producers) {
                        arrNemes = "";
                            for (var tmp in data.content[i].producers) {
                                arrNemes += data.content[i].producers[tmp].name + ", ";
                            }                       
                        $(".regisser").eq(i).text(arrNemes.slice(0, -2));
                    }
                    if (data.content[i].acters) {
                        arrNemes = "";
                            for (var tmp in data.content[i].acters) {
                                arrNemes += data.content[i].acters[tmp].nameActer + ", ";
                            }                       
                        $(".acters").eq(i).text(arrNemes.slice(0, -2));
                    }
                    if (data.content[i].ageGroup) {
                        $(".age_viewers").eq(i).text(data.content[i].ageGroup + "+");
                    }
                    if (data.content[i].duration) {
                        $(".time_duration").eq(i).text(data.content[i].duration + " min");
                    }
                    if (data.content[i].description) {
                        $(".description").eq(i).text(" " + data.content[i].description);
                    }                           
                    if (data.content[i].star.kinopoisk) {
                        $(".ratingKinopoisk a").eq(i).attr('href', 'http://www.kinopoisk.ru/film/' + data.content[i].star.kinopoisk + '/');
                      $(".ratingKinopoisk img").eq(i).attr('src', 'http://rating.kinopoisk.ru/' + data.content[i].star.kinopoisk + '.gif');
                    }

                }


//                console.log(data);
//                for (var tmp in data) {
//                    if (data[tmp].name) {
//                        $(".name").eq(tmp).text(data[tmp].name);
//                    }
//                    var n = $(".name").eq(tmp).text();
//                    if (data[tmp].originalName) {
//                        $(".name").eq(tmp).text(n + '/' + data[tmp].originalName + '/film_id = ' + data[tmp].film_id + '/tmp = ' + tmp);
//                    }
//                    if (data[tmp].category) {
//                        $(".category").eq(tmp).text(data[tmp].category + '  id = ' + data[tmp].id + '  tmp = ' + tmp);
//                    }
//                    if (data[tmp].release_date) {
//                        $(".released").eq(tmp).text(data[tmp].release_date);
//                    }
//                    if (data[tmp].country) {
//                        $(".country").eq(tmp).text(data[tmp].country);
//                    }
//                    if (data[tmp].genre) {
//                        $(".genre").eq(tmp).text(data[tmp].genre);
//                    }
//                    if (data[tmp].regisser) {
//                        $(".regisser").eq(tmp).text(data[tmp].regisser);
//                    }
//                    if (data[tmp].acters) {
//                        $(".acters").eq(tmp).text(data[tmp].acters);
//                    }
//                    if (data[tmp].age_group) {
//                        $(".age_viewers").eq(tmp).text(data[tmp].age_group);
//                    }
//                    if (data[tmp].time_duration) {
//                        $(".time_duration").eq(tmp).text(data[tmp].time_duration);
//                    }
//
//                    if (data[tmp].images) {
//                        $('#posts img').eq(tmp).attr('src', data[tmp].images);
//                    }
//                }
            },
            error: function (jqXHR) {
                console.log('Error!+++' + data);
                alert('Error!+++' + jqXHR.toString()); // ?????????
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



