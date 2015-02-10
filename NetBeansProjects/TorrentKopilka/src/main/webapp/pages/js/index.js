$(function () {

    for (var i = 0; i < 4; i++) {
        var $post = $('#clone').clone().addClass("clone" + i);
        $('#posts').append($post);
    }

    for (var i = 0; i < 4; i++) {
        var $top = $('#top').clone();
        $('#sidebar').append($top);
    }

    $(this).on('scroll', function () {
        if ($(this).scrollTop() > 11350) {         // если scroll опустить вниз больше чем на 10px - получим сообщение в консоль
            console.log('redy');
        }
    });

    $('.downloadButton').click(function () {        // KLICK - RAZVOROT
        var $thisIndex = $('.downloadButton').index(this);
        $('.more').eq($thisIndex).toggle();
        /*-----------------------  NE UDALAT  -----------------------------------------------------*/
//                console.log($thisIndex);
//                    var amount = data.content[i].torrents.length;
//                    for (var i = 0; i < 2; i++) {
//                        var $tableClone = $('#tableClone').clone().addClass("clone" + i);
//                        $('#tableClones').append($tableClone);
//                        console.log('**');
//                    }

    });


//                console.log();
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
//    $(function () {

//        var inputText = $("#input_str").val();
        $.ajax({
            url: 'findLastAdded/10',
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json; charset=windows-1251',
            mimeType: 'application/json',
//            data: ({
//                count: "2"
//            }),
            async: true,
            success: function (data) {
//                console.log(data);
                var countElements = data.numberOfElements;
                var arrNemes = "";
//                console.log("= = " + data.content[0].countrys[0].id);
                for (var i = 0; i < countElements; i++) {
//                    console.log("= = " + i);
                    if (data.content[i].name) {
                        $(".name").eq(i).text(data.content[i].name + ' / ' + data.content[i].originalName + ' / ' + data.content[i].id);
                        $(".imageContent").eq(i).attr('src', 'pages/images/' + data.content[i].imagePrefix + '/' + data.content[i].originalName + '.jpg');
                        $('.downloadButton').eq(i).attr('id', data.content[i].id);
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
                    if (data.content[i].online) {
                        $(".onlineButton").eq(i).attr('href', data.content[i].online);
                    }
/*----------------------------------- pravilnoe klonirovanie -----  vstsvit v drugoe mesto -----------------------------------------------------*/
                    var amount = data.content[i].torrents.length;
                    var $tableClone = $('#tableClone').clone();
                    for (var j = 0; j < amount; j++) {                      
                        $('#tableClones').append($tableClone);
                    }
                    $('#wrapperTable > #tableClone').hide(4000); // DEL - tu s kotoroy kopirovali
/*--------------------------------------------------------------------------------------------*/
                    if (i > 0) {
//                        continue;
                    }
//                    console.log('--Q - i = ' + i + " tmpTor = " );
//                    $(".tableClone .quality").eq(i).text('1');
//                    console.log('---F - i = ' + i + " tmpTor = ");
//                    $(".tableClone .format").eq(i).text('2');


                    arrNemes = "";
                    for (var tmpTor in data.content[i].torrents) {
//                        console.log('--i = ' + i); 
//                        if(tmpTor == 1){
//                            break;
//                        }
//                    console.log('--tmpTor = ' + tmpTor);    
                        arrNemes += data.content[i].torrents[tmpTor].quality + ", ";
                        console.log('--Q - i = ' + i + " tmpTor = " + tmpTor);
                        $(".quality").eq(i).text(arrNemes);
                        arrNemes = "";
                        arrNemes += data.content[i].torrents[tmpTor].format + ", ";
                        console.log('---F - i = ' + i + " tmpTor = " + tmpTor);
                        $(".format").eq(i).text(arrNemes);
                        arrNemes = "";
                        break;
                    }
/*-------------------------------------------------------------------------------------------------------*/
//                    }






                    arrNemes = "";
//                    var amount = data.content[i].torrents.length;
//                    for (var x = 0; x < amount; x++) {
//                        console.log("*");
//                    }
////                    $('#tableClone').clone().insertAfter('#tableClone');
//                     $('#tableClone').clone(true).appendTo('#tableClones').eq(i);



//                    if (data.content[i].torrents) {
//                            for (var i = 0; i < 4; i++) {
//                                $('#tableClone').clone().appendTo($('#more').eq(i), '#wrapperTable', false);
//                                $('#tableClones').append($tableClone);
//                            }
//                        for (var tmp in data.content[i].torrents) {
//                            arrNemes = "";
//                            if (data.content[i].torrents[tmp].quality !== null) {
//                                arrNemes += data.content[i].torrents[tmp].quality + " ";
//                            }
//                            if (data.content[i].torrents[tmp].format !== null) {
//                                arrNemes += data.content[i].torrents[tmp].format;
//                            }
//                            $(".quality_format").eq(i).text(arrNemes);
//                            arrNemes = "";
//                            if (data.content[i].torrents[tmp].videoCodec !== null) {
//                                arrNemes += data.content[i].torrents[tmp].videoCodec + " ";
//                            }
//                            if (data.content[i].torrents[tmp].video !== null) {
//                                arrNemes += data.content[i].torrents[tmp].video;
//                            }
//                            $(".video_codec_video").eq(i).text(arrNemes);
//                            arrNemes = "";
//                            if (data.content[i].torrents[tmp].sizeFile !== null) {
//                                arrNemes += data.content[i].torrents[tmp].sizeFile;
//                            }
//                            $(".sizeFile").eq(i).text(arrNemes);
//                            arrNemes = "";
//                            if (data.content[i].torrents[tmp].audioTransfer !== null) {
//                                arrNemes += data.content[i].torrents[tmp].audioTransfer;
//                            }
//                            $(".audio_transfer").eq(i).text(arrNemes);
//                            arrNemes = "---";
//                            if (data.content[i].torrents[tmp].subtitles !== null) {
//                                arrNemes += data.content[i].torrents[tmp].subtitles;
//                            }
//                            $(".subtitles").eq(i).text(arrNemes);
//                            arrNemes = "";
//                            if (data.content[i].torrents[tmp].audioCodec !== null) {
//                                arrNemes += data.content[i].torrents[tmp].audioCodec + " ";
//                            }
//                            if (data.content[i].torrents[tmp].audio !== null) {
//                                arrNemes += data.content[i].torrents[tmp].audio;
//                            }
//                            arrNemes = "";
//                            $(".audio_codec_audio").eq(i).text(arrNemes);
//                            if (data.content[i].torrents[tmp].torrentLink !== null) {
//                                $(".torrent a").eq(i).attr('href', data.content[i].torrents[tmp].torrentLink);
//                            }
//                             arrNemes = "";
//                        }


//                        arrNemes = "";
//                            for (var tmp in data.content[i].torrents.video_codec !== null) {
//                                arrNemes += data.content[i].torrents[tmp].video_codec;
//                            }
//                            for (var tmp in data.content[i].torrents.video) {    
//                                arrNemes += data.content[i].torrents[tmp].video;
//                            }                       
//                        $(".video_codec_video").eq(i).text(arrNemes);


                }
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



