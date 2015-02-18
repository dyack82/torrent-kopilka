$(function () {
    
 var $skrit = $('#skrit').text();
 var $podrobnee = $('#podrobnee').text();


    for (var i = 0; i < 10; i++) {
        var $post = $('#clone').clone().addClass("clone" + i);
        $('#posts').append($post);
    }

    for (var i = 0; i < 1; i++) {
        var $top = $('#top').clone();
        $('#sidebar').append($top);
    }

    $(this).on('scroll', function () {
        if ($(this).scrollTop() > 100000) {         // если scroll опустить вниз больше чем на 10px - получим сообщение в консоль
            console.log('redy');
        }
    });

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

    /***************************************************************************************************************************/
    /******************************************  GET LAST  *********************************************************************************/
    /***************************************************************************************************************************/
//    $('#getLast').click(function () {
    $(function () {
        $.ajax({
            url: 'getLastAdded/10',
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
                for (var i = 0; i < countElements; i++) {
                    if (data.content[i].name) {
                        $(".name").eq(i).text(data.content[i].name + ' / ' + data.content[i].originalName);
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
//                                if (data.content[i].trailers) {
//                                   trailer = data.content[i].link;
//                                   $(".trailer").eq(i).text(data.content[i].trailers[0].link);
//                               }
                    if (data.content[i].description) {
                        $(".description div").eq(i).text($(".description div").eq(i).text() + " " + data.content[i].description);
                    }
                    if (data.content[i].star.kinopoisk !== null) {
                        $(".ratingKinopoisk a").eq(i).attr('href', 'http://www.kinopoisk.ru/film/' + data.content[i].star.kinopoisk + '/');
                        $(".ratingKinopoisk img").eq(i).attr('src', 'http://rating.kinopoisk.ru/' + data.content[i].star.kinopoisk + '.gif');
                    }
                    if (data.content[i].online) {
                        $(".onlineButton").eq(i).attr('href', data.content[i].online);
                    }
                }
            },
            error: function (error) {
                console.log('Error!+++' + error);
                alert('Error!+++' + error.toString()); 
            }
        });
    });
    /***************************************************************************************************************************/
    /******************************************  TOP PO SKACHKE  *********************************************************************************/
    /***************************************************************************************************************************/
    $('#getTopDownloads').click(function () {
//    $(function () {
        $.ajax({
            url: 'getTopDownloads',
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
                var topLength = data.length;
                console.log(topLength);
                for (var len = 0; len < topLength; len++) {


// $(".imageContent").eq(i).attr('src', 'pages/images/' + data.content[i].imagePrefix + '/' + data.content[i].originalName + '.jpg');
                    $('.top img').eq(len).attr('src', 'pages/images/' + data[len][2] + '/' + data[i][1] + '.jpg');
                    $('.top b').eq(len).text(data[len][0] + " (" + data[len][3].slice(0, -6) + ")");
                }
            },
            error: function (error) {
                console.log('Error!+++' + error);
                alert('Error!+++' + error.toString()); // ?????????
            }
        });
    });
    /***************************************************************************************************************************/
    /******************************************  TORRENT  *********************************************************************************/
    /***************************************************************************************************************************/

    $('.downloadButton').click(function () {        // podgrugaem torrent po ID
        var $thisIndex = $('.downloadButton').index(this);
        var $thisId = $(this).attr('id');

        $('.downloadButton').eq($thisIndex).css({
//            'background-image': 'url(pages/images/loader.gif)',
            'background-image': 'url(loader.gif)',
            'background-repeat': 'no-repeat',
            'background-position': 'center',
            'background-size': '20px',
            'font-size': '0px',
            'height': '30px',
            'width': '180px'
        });

//--------------------------  RAZVOROT - SVOROT  -----------------------------------------------------
//        if ($('.more').eq($thisIndex).css('display') === 'none') {
//            $('.more').eq($thisIndex).css({display: 'block'});
//            console.log('none -> block');
//        }
        if ($('.more').eq($thisIndex).css('display') === 'block') {
//            $('.more #youtubeColorRu').eq($thisIndex).slideUp(1000);
            $('.more').eq($thisIndex).slideUp(1000);
//            $('.more').eq($thisIndex).css({display: 'none'});
            console.log('  block -> none');
            $('.downloadButton').eq($thisIndex).html('<b>' + $podrobnee + '</b>'); //////////////////////////////////////////////////////
                 $('.downloadButton').eq($thisIndex).css({
//            'background-image': 'url(./pages/images/loader.gif)',
            'background-image': 'none',
            'font-size': '13px',
            'height': '30px',
            'width': '220px'
        });  
       
            return;
        }
 //******************************************************       
           $('.downloadButton').eq($thisIndex).css({
            'background-image': 'url(./pages/images/loader.gif)'
        });
////////////////////////      $('.more').eq($thisIndex).toggle();            // NE ISPOLZOVAT !!! // KLICK - SVOROT-RAZVOROT        
        $.ajax({
            url: 'getTorrentByFilmId',
            type: 'GET',
            dataType: 'json',
            contentType: 'application/json; charset=windows-1251',
            mimeType: 'application/json',  
            data: ({
                id: $thisId
            }),
            async: true,
            success: function (data) {
                console.log(data);
                /*----------------------------------  text -> skrit  --------------------------------------------------------*/
                $('.downloadButton').eq($thisIndex).html('<b>' + $skrit + '</b>');  ///////////////////////////////////////////////
                $('.downloadButton').eq($thisIndex).css({
                    
                    'font-size': '20px',
                    'height': '30px',
                    'color': 'white',
                    'text-align': 'center',
//                    'padding-top': '3px',
                    'width': '180px',
                    'background-image': 'none'
                });
//                $('.downloadButton b').eq($thisIndex).css({
//                    'margin-top': '3px'
//                     });
//                
                /*----------------------------------  more -> open  -------------------------------------------*/
                if ($('.more').eq($thisIndex).css('display') === 'none') {
//                    $('.more').eq($thisIndex).css({display: 'block'});
//$('.more').eq($thisIndex).animate({height: 'show'}, 5000);//******************************************
//$('#youtubeColorRu').eq($thisIndex).animate({height: 'show'}, 4000);

$('.more').eq($thisIndex).slideDown(1000); 
                    console.log('none -> block');
                }
                /*----------------------------------  clone  -------------------------------------------*/
                var amount = data.length;
                for (var j = 0; j < amount; j++) {
                    var $tableClone = $('#wrapperTable > #tableClone').eq($thisIndex).clone();
                    $('#wrapperTable > #tableClones').eq($thisIndex).append($tableClone);
                }
                $('#wrapperTable > #tableClone').eq($thisIndex).hide(); // DEL - tu s kotoroy kopirovali
                /*---------------------------------  trailer  ------------------------------------------------------*/
//                var tr = null;
//             tr = $(".trailer").eq($thisIndex).text();
//                if(tr !== null){
////                    console.log($('#youtubeColorRu movie'));
////                            $('#youtubeColorRu movie value').attr('value', '15');
//$('#youtubeColorRu').eq($thisIndex).attr('src', 'http://youtu.be/P7prFugK7ks');
//                }
                
                
                
//                <object id="youtubeColorRu" width="560" height="316">
//                                    <param name="movie" value=""></param>

                /*--------------------------------------------------------------------------------------------------*/
//                console.log('***************');
                for (var indexTor in data) {
//                        arrData += data[tmpTor].format + ", ";  // DOSTAEM PRAVILNO                     
                    var $tableClones = $('#wrapperTable > #tableClones').eq($thisIndex);
                    var $tableClone = $tableClones.children("#tableClone").eq(indexTor); // $tableClone - KONKRETNAYA STROKA
                    var $row = $tableClone.children('.row');
                    $row.children('.quality').text(data[indexTor].quality);
                    $row.children('.format').text(data[indexTor].format);
                    $row.children('.video_codec_video').text(data[indexTor].videoCodec + " " + data[indexTor].video);
                    $row.children('.sizeFile').text(data[indexTor].sizeFile);
                    $row.children('.audio_transfer').text(data[indexTor].audioTransfer);
                    $row.children('.subtitles').text(data[indexTor].subtitles);
                    $row.children('.audio_codec_audio').text(data[indexTor].audioCodec + " " + data[indexTor].audio);
                    var $torrentLink = $row.children('.torrentLink');
                    var $a = $torrentLink.children('a').attr('href', 'pages/' + data[indexTor].torrentLink);
                    $a.children('img').attr('src', 'pages/images/utorrent-logo.png');
                }
            },
            error: function (error) {
                console.log('Error!+++' + error);
                alert('Error!+++' + error.toString());
            }

        });
    });





















});

